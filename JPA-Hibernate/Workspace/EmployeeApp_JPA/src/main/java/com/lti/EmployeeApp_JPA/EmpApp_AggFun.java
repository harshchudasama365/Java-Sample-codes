package com.lti.EmployeeApp_JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.entity.Employee;

public class EmpApp_AggFun {
	
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory(null);
	
	public static void countEmp() {
		System.out.println("Total count of emp : ");
		EntityManager em = emf.createEntityManager();
		Query q3 = em.createQuery("SELECT COUNT(e) FROM Employee e");
		long COUNT = (long)q3.getSingleResult();
		System.out.println("Total count of employee = "+COUNT);
	}
	
	public static void maxSal() {
		System.out.println("Max salary of empTable : ");
		EntityManager em = emf.createEntityManager();
		Query q4 = em.createQuery("SELECT MAX(e.salary) FROM Employee e");
		long maxSalalary = (long)q4.getSingleResult();
		System.out.println("Max salary of empTable = "+maxSalalary);
	}
	
	public static void findEmpById() {
		EntityManager em = emf.createEntityManager();
		Query q5 = em.createQuery("SELECT e FROM Employee e where e.depName='Admin'", Employee.class);
//		q5.setParameter("dname", );
		List<Employee> elistByDept = q5.getResultList();	
		elistByDept.forEach(System.out::println);
		
	}
	
	
	
//	public static void main(String[] args) {
////		EmpApp.persistEmp();
//		
//		System.out.println("Employee saved");
//		countEmp();
//		maxSal();
//		findEmpById();
//		
//	
//		
//	}

}
