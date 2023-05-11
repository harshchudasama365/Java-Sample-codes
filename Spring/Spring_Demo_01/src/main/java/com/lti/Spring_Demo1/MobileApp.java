package com.lti.Spring_Demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.App.Airtel;
import com.lti.App.Sim;

/**
 * Hello world!
 *
 */
public class MobileApp 
{
    public static void main( String[] args )
    {
//        Sim s1 = new Airtel();
//        s1.calling();
    	
    	//Spring/IOC container - by using XML configuration file
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Airtel a1 = context.getBean("s1",Airtel.class);
    	a1.calling();
    }
}
