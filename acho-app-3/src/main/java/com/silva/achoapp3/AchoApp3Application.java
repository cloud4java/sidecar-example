package com.silva.achoapp3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
//
//@EnableEurekaClient
//@EnableZuulProxy
//
// @EnableDiscoveryClient
public class AchoApp3Application {

	public static void main(String[] args) {
		SpringApplication.run(AchoApp3Application.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
