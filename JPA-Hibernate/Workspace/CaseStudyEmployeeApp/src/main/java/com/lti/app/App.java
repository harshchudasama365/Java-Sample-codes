package com.lti.app;

import com.lti.entity.Employee;
import com.lti.exception.NoSuchEMployeeException;
import com.lti.service.EmpService;
import com.lti.service.EmpServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Employee e1 = new Employee();
        e1.setEid(501);
        e1.setEname("Harsh C.");
        e1.setEsal(40000);
        
        EmpService eService = new EmpServiceImpl();
        boolean result = eService.addEmp(e1);
        if(result) {
        	System.out.println("Employee added.");
        }else {
        	System.out.println("Employee not added");
        }
        try {
        	Employee e2 = eService.findEmp(501);
        	System.out.println("Employee Found --"+ e2);
        	
        }catch (NoSuchEMployeeException e) {
			// TODO: handle exception
        	e.getMessage();
		}
    }
}
