package com.quikmason.common;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateTimeDeserializer extends JsonDeserializer<Date> {

	public static SimpleDateFormat FORMATTER = new SimpleDateFormat("dd.MM.yyyy HH:mm");

	@Override
	public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		try {
			return FORMATTER.parse(jp.getText());
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
}