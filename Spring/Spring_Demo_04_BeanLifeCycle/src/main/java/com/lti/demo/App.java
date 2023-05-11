package com.lti.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext cntx = new ClassPathXmlApplicationContext("spring.xml");
		MyBean b1 = cntx.getBean("bean1", MyBean.class);
		System.out.println(b1);
		cntx.registerShutdownHook();

	}

}
