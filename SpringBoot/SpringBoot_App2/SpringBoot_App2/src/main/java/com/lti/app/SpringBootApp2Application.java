package com.lti.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.lti.*")
public class SpringBootApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp2Application.class, args);
		System.out.println("Course APP started");
	}

}
