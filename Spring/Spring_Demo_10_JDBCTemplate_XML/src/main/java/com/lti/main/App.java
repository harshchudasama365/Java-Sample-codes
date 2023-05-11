package com.lti.main;

import com.lti.dao.PersonDAO;
import com.lti.dao.PersonDAOImpl;
import com.lti.entity.Person;

public class App 
{
    public static void main( String[] args )
    {
    	PersonDAO dao = new PersonDAOImpl();
    	
       Person p1 = new Person();
       
       p1.setPname("Komal Dixit");
       p1.setAdd("Jaipur");
       p1.setPid(121);
       
       dao.insert(p1);
    
    }
}
