package com.quikmason.common;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Initializes Spring application context 
 */
public class SpringInit implements WebApplicationInitializer {

  @Override
  public void onStartup(ServletContext container) {

    // Create the 'root' Spring application context
    AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
    rootContext.register(DispatcherConfig.class);

    // Manage the lifecycle of the root application context
    container.addListener(new ContextLoaderListener(rootContext));

    FilterRegistration.Dynamic springSecurity = container.addFilter("springSecurityFilterChain", new DelegatingFilterProxy());
    springSecurity.addMappingForUrlPatterns(null, true, "/*");

    // Register and map the dispatcher servlet
    ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(rootContext));
    dispatcher.setLoadOnStartup(1);
    dispatcher.addMapping("/");

  }
}
