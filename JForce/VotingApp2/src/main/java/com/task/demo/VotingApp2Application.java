package com.task.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan(basePackages = {"com.task"})  // force scan JPA entities
public class VotingApp2Application {

	
	
	public static void main(String[] args) {
		SpringApplication.run(VotingApp2Application.class, args);	
		System.out.println("Application on 2");	
		
	}

}
//{
//    "username": "harsh",
//    "emailid": "harsh@gmail.com",
//    "password": "root",
//    "mobilenumber": "4567890"
//}

//<dependency>
//<groupId>com.mysql</groupId>
//<artifactId>mysql-connector-j</artifactId>
//<scope>runtime</scope>
//</dependency>