package com.lti.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext cntx = new ClassPathXmlApplicationContext("Spring.xml");
//		Message msg = cntx.getBean("message", Message.class);
		Message msg = cntx.getBean(Message.class);
		System.out.println(msg.getMsg());

	}

}
