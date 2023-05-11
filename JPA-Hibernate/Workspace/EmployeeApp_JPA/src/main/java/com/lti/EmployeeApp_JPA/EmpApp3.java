package com.lti.EmployeeApp_JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.lti.entity.Employee;

public class EmpApp3 {
	
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
	   
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
	
	public static void findEmpBySalRange() {
		System.out.println("Employee By Salary Range : 10000 to 100000");
		System.out.println("Employees By Salary Range : 10000 to 100000 ");
		EntityManager em = emf.createEntityManager();
		Query q1 = em.createNamedQuery(Employee.SALARY_RANGE_QUERY);
		List<Employee>  elist = q1.getResultList();
		elist.forEach(System.out::println);
		
	}
	
	public static void findEmpByEmpid(int empid) {
		System.out.println("Employee Details for id : "+empid);
		EntityManager em = emf.createEntityManager();
		TypedQuery<Employee> tQuery = em.createQuery("SELECT e from Employee e where e.empid=:empid", Employee.class);
		tQuery.setParameter("empid", empid);
		System.out.println(tQuery.getSingleResult());
		
	}
	
	public static void findEmpBySalRangeTypedQuery(long min, long max) {
		System.out.println("Employee Details");
		EntityManager em = emf.createEntityManager();
		TypedQuery<Employee> tQuery = em.createQuery("SELECT e from Employee e where e.salary between :min_sal AND :max_sal", Employee.class);
		tQuery.setParameter("min_sal", min);
		tQuery.setParameter("max_sal", max);
		List<Employee> elist = tQuery.getResultList();
		elist.forEach(System.out::println);
	}
	
	
	public static void main(String[] args) {
		
//		findEmpBySalRange();
//		findEmpByEmpid(121);
		findEmpBySalRangeTypedQuery(10000, 100000);
		
	}

}
