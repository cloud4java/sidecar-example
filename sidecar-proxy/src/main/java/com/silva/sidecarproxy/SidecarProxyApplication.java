package com.silva.sidecarproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class SidecarProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SidecarProxyApplication.class, args);
	}

}
