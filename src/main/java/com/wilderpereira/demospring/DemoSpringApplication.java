package com.wilderpereira.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class DemoSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);
	}
}
