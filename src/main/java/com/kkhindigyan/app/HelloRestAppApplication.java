package com.kkhindigyan.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.kkhindigyan.controller"} )
public class HelloRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloRestAppApplication.class, args);
	}
}
