package com.lti.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class StudentApp {
	
	public static void main(String[] args) {
		
//		Resource rs = new ClassPathResource("spring.xml");
//		BeanFactory factory = new XmlBeanFactory(rs);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
    	Student sbean = (Student)context.getBean("stud1");
//    	Student sbean = context.getBean("stud1", Student.class);
    	
    	System.out.println(sbean);
		System.out.println(context);
	}

}

