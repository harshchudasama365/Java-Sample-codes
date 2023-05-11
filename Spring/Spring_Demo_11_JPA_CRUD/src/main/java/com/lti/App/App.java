package com.lti.App;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.entity.Employee;
import com.lti.service.EmployeeService;
import com.lti.service.EmployeeServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext cntx = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeService eService = cntx.getBean(EmployeeServiceImpl.class);
        
        Employee emp1 = cntx.getBean("e1", Employee.class);
        
        List<Employee> elist = eService.showAllEmployee();
        System.out.println("Employee count : "+elist.size());
        
        eService.create(emp1);
        System.out.println("Employee created inside Db");
        
        elist = eService.showAllEmployee();
        
        System.out.println("Employee count after adding data : "+ elist.size());
        
        
    }
}
