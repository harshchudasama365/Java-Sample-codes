package com.lti.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.entity.Gadget;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext cntx = new ClassPathXmlApplicationContext("spring.xml");
        Gadget g1 = cntx.getBean("gad-1", Gadget.class);
        System.out.println(g1.hashCode());
        Gadget g2 = cntx.getBean("gad-1", Gadget.class);
        System.out.println(g2.hashCode());
       
    
    }
}
