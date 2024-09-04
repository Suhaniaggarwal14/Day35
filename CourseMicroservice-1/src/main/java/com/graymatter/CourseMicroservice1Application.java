package com.graymatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CourseMicroservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(CourseMicroservice1Application.class, args);
	}

}
