package com.lti.SpringBoot_App1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.lti.entity.Account;
import com.lti.entity.Customer;

@SpringBootApplication
@ComponentScan(basePackages = "com.lti.entity")
@EnableAutoConfiguration
public class SpringBootApp1Application {

	public static void main(String[] args) {
		//Getting context back
		ConfigurableApplicationContext cntx = SpringApplication.run(SpringBootApp1Application.class, args);
		Customer c1 = cntx.getBean(Customer.class);
		
		c1.setC_id(1);
		c1.setC_name("Jay");
		c1.setAddress("Mumbai");
		
		Account a1 = cntx.getBean(Account.class);
		a1.setAcc_id(101);
		a1.setAcc_number("HG890");
		a1.setType("Saving");
		
		c1.setA1(a1);
		System.out.println("Customer Details : "+c1);
		
	}
}
