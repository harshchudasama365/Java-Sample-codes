package com.lti.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.PersonDAO;
import com.lti.dao.PersonDAOImpl;
import com.lti.entity.Person;

public class App 
{
    public static void main( String[] args )
    {
//    	PersonDAO dao = new PersonDAOImpl();
    	
    	ApplicationContext cntx = new ClassPathXmlApplicationContext("spring.xml");
    	PersonDAO dao = cntx.getBean("persondao",PersonDAOImpl.class);
    	
       Person p1 = new Person();
       
       p1.setPname("JK.");
       p1.setAdd("Delhi");
       p1.setPid(120);
       
       dao.insert(p1);
    
    }
}
