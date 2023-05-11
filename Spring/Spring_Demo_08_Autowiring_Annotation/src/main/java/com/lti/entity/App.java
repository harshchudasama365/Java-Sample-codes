package com.lti.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext cntx = new ClassPathXmlApplicationContext("spring.xml");
        Customer cust = cntx.getBean("c1", Customer.class);
        System.out.println(cust);
    }
}
