package com.application.ms1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient    // for auto registration of service with consul
@SpringBootApplication
public class AppMS1Application {

	public static void main(String[] args) {
		SpringApplication.run(AppMS1Application.class, args);
	}
}
