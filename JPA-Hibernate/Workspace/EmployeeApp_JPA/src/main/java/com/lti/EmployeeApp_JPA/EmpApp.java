package com.lti.EmployeeApp_JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.entity.Employee;

public class EmpApp 
{
	
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory(null);
   
	public static void persistEmp() {
		
		Employee e1 = Employee.createEmp(121, "Harsh", "Admin", 180000);
		Employee e2 = Employee.createEmp(122, "Sameer", "IT", 40000);
		Employee e3 = Employee.createEmp(123, "JK", "IT", 70000);
		Employee e4 = Employee.createEmp(124, "Yash", "IT", 80000);
		Employee e5 = Employee.createEmp(125, "Hardik", "HR", 160000);
		Employee e6 = Employee.createEmp(126, "Jay", "Admin", 190000);
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(e4);
		em.persist(e5);
		em.persist(e6);
		em.getTransaction().commit();
		
	}
	
	public static void EmpListQuery() {
		System.out.println("------Employee List-------");
		EntityManager em = emf.createEntityManager();
		Query q1 = em.createQuery("SELECT e FROM Employee e");
		List<Employee> elist = q1.getResultList();
		elist.forEach(System.out::println);
		
	}
	
	
//	public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//        persistEmp();
//        System.out.println("Employee save in database");
//        EmpListQuery();
//    }
}
