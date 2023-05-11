/**
 * 
 */
package com.lti.dao;

import javax.persistence.EntityManager;

import com.lti.entity.Employee;

/**
 * @author Harsh
 *
 */
public class EmployeeDaoImpl implements EmployeeDao {

	private EntityManager em = null;
	
//	getting Entity Manager from utility class
	public EmployeeDaoImpl() {
		em = JPA_Utility.getEntityManager();
	}
	
	public Employee createEmployee(Employee e) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("DAO-LAYER msg : Employee Persist in DB.");
		return e;
	}

	public Employee findEmployeeById(int eid) {
		// TODO Auto-generated method stub
		Employee emp = em.find(Employee.class, eid);
		return emp;
	}

}
