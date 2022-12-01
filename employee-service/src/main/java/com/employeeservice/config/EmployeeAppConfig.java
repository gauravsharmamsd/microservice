package com.employeeservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class EmployeeAppConfig {
	@Bean
	public ModelMapper geMapper() {
		return new ModelMapper();
	}
	@Value("${addressservice.base.url}")
	private String addressBaseURL;
	
	@Bean
	public RestTemplate geRestTemplate() {
		return new RestTemplateBuilder().rootUri(addressBaseURL).build();
	}
	@Bean
	public WebClient client() {
	return	WebClient.builder().baseUrl(addressBaseURL)
		.build();
	}
	
	
}
