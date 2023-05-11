package com.lti.EmployeeApp;

import java.sql.SQLException;

import com.lti.Dao.EmployeeDao;
import com.lti.Entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, ClassNotFoundException
    {
        System.out.println( "Hello World!" );
        EmployeeDao dao = new EmployeeDao();
        Employee e1 = new Employee();
        e1.setUsername("harsh");
        e1.setPassword("harsh");
        e1.setEmail("harsh@hmail.com");
        dao.addEmp(e1);
        System.out.println("Employee added successfully.");
        dao.deleteEmpbyname("abc");
        System.out.println("Employee deleted Successfully");
    }
}
