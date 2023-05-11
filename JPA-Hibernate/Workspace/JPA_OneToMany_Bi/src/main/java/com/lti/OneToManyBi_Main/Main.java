package com.lti.OneToManyBi_Main;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.lti.entity.Department;
import com.lti.entity.Employee;

public class Main {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
	
	public static void findHighestSalEmp() {
		
		System.out.println("Highest salaried Person");
		
		
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Employee> tq1 = 
				em.createQuery("Select e from Employee e  where e.salary = (Select MAX(e2.salary) from Employee e2)", Employee.class);
		Employee maxsalemp = tq1.getSingleResult();
		System.out.println(maxsalemp);
	}
	
	public static void findHighestSalDept() {
		System.out.println("Highest Salaried Department name");
		EntityManager em = emf.createEntityManager();
		TypedQuery<String> tq2 =
		em.createQuery("Select d.deptname from Department d "+
		"JOIN d.empSet e where e.salary = (Select MAX(e2.salary) from Employee e2)",String.class);
		String depname = tq2.getSingleResult();
		System.out.println(depname);
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEid(101);
		e1.setEname("OBB");
		e1.setSalary(23000);
		
		Employee e2 = new Employee();
		e2.setEid(102);
		e2.setEname("XYZ");
		e2.setSalary(60000);
		
		Department d1 = new Department();
		d1.setDeptid(55);
		d1.setDeptname("HR");
		
		
		//adding employees to empset
		Set<Employee> empset = new HashSet<>();
		empset.add(e1);
		empset.add(e2);
		
		
		//add empset to department object
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		
		//Associate Employees with department
		d1.setEmpSet(empset);
		em.getTransaction().begin();
		em.persist(d1);
//		em.persist(e1);
//		em.persist(e2);
		em.getTransaction().commit();
		
		//Associate the Department with employees
		e1.setDept(d1);
		e2.setDept(d1);
		
		//To access the department from employee --Reverse
		em.getTransaction().begin();
		Employee emp = em.find(Employee.class, 102);
		System.out.println("Employee name : "+emp.getEname() );
		System.out.println("Department name : "+emp.getDept().getDeptname());
	
		//To access the employee from department
		Department dept = em.find(Department.class,  55);
		System.out.println("To access the employees from department");
		System.out.println("Department id : "+dept.getDeptid());
		Set<Employee> eset = dept.getEmpSet();
		for(Employee e: eset) {
			System.out.println(e);
		}
		
		em.getTransaction().commit();
		
		findHighestSalEmp();
	}

}
