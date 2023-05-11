package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Employee;


//To perform the CRUD operation inside the database
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	//Indicated that bean of entitymanager created by using the bean of EntityManagerfactory
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void insert(Employee e) {
		em.persist(e);//Getting data of Employee from service layer
	}

	public List<Employee> findAll() {
		TypedQuery<Employee> tql = em.createQuery("SELECT e FROM Employee e", Employee.class);
		List<Employee> elist = tql.getResultList();
		return elist;//Return to the service layer
	}

}
