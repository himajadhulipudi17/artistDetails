package com.altimetrik.demo.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	
	@Bean
	public RestTemplate restTemplate() {
		
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();

		// support "text/plain"
		converter.setSupportedMediaTypes(Arrays.asList(MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON));
		
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(converter);
		
		return restTemplate;	
	}

}
