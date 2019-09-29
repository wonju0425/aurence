package com.aurance.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class AuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuranceApplication.class, args);
		System.out.println("Spring Boot Started.");
	}

}
