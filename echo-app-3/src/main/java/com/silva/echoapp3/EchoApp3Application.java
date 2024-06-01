package com.silva.echoapp3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class EchoApp3Application {

	public static void main(String[] args) {
		SpringApplication.run(EchoApp3Application.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
