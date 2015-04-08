package com.quikmason.common;

import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.MediaType;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.accept.ContentNegotiationManagerFactoryBean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

/**
 * Defines how and where HTML view templates and static resources can be found
 */
@Configuration
@EnableWebMvc
@ImportResource(value = { "classpath:/spring-jdbc.xml", "classpath:/spring-security.xml" })
@ComponentScan(basePackages = "com.quikmason")
public class DispatcherConfig extends WebMvcConfigurerAdapter {

	public static final String[] RESOURCE_LOCATIONS = new String[] { "/css/", "/img/", "/js/", "/font/" };
	public static final String[] RESOURCE_HANDLERS = new String[] { "/css/**", "/img/**", "/js/**", "/font/**" };

	@Bean
	public ContentNegotiatingViewResolver jspResolver() {

		MappingJacksonJsonView defaultView = new MappingJacksonJsonView();
		defaultView.setExtractValueFromSingleKeyModel(true);

		InternalResourceViewResolver jspViewResolver = new InternalResourceViewResolver();
		jspViewResolver.setViewClass(JstlView.class);
		jspViewResolver.setPrefix("/WEB-INF/views/");
		jspViewResolver.setSuffix(".jsp");

		ContentNegotiatingViewResolver contentViewResolver = new ContentNegotiatingViewResolver();

		ContentNegotiationManagerFactoryBean contentNegotiationManager = new ContentNegotiationManagerFactoryBean();
		contentNegotiationManager.addMediaType("json", MediaType.APPLICATION_JSON);
		contentViewResolver.setContentNegotiationManager(contentNegotiationManager.getObject());

		contentViewResolver.setDefaultViews(Arrays.<View> asList(new MappingJacksonJsonView()));
		contentViewResolver.setViewResolvers(Arrays.<ViewResolver> asList(jspViewResolver));
		contentViewResolver.setDefaultViews(Arrays.<View> asList(defaultView));

		return contentViewResolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler(RESOURCE_HANDLERS).addResourceLocations(RESOURCE_LOCATIONS);
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(new ByteArrayHttpMessageConverter());
		MappingJacksonHttpMessageConverter messageConverter = new MappingJacksonHttpMessageConverter();
		ObjectMapper objectMapper = messageConverter.getObjectMapper();
		objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.configure(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false);
		objectMapper.setDateFormat(CustomDateSerializer.FORMATTER);
		converters.add(messageConverter);
	}

}
