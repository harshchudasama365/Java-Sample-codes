package com.lti.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name = "msg1")
	public Message getmsg1() {
		return new Message();
	}
}
