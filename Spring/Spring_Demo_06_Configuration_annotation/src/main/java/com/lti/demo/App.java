package com.lti.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//spring.xml not required
public class App {

	public static void main(String[] args) {
		
		ApplicationContext cntx = new AnnotationConfigApplicationContext(AppConfig.class);
		//getting bean from configuration
		Message msg = cntx.getBean("msg1", Message.class);
		msg.setMsg("Hello from Congfiguation Class Bean");
		System.out.println(msg.getMsg());

	}

}
