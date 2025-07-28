package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NewProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewProjectApplication.class, args);
	}
     
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}




