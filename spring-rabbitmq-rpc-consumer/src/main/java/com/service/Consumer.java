package com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:client.xml")
public class Consumer {

	public static void main(String[] args) {
		SpringApplication.run(Consumer.class, args);
	}
}
