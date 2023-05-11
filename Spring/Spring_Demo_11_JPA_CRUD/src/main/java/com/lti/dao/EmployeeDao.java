package com.lti.dao;

import java.util.List;

import com.lti.entity.Employee;

public interface EmployeeDao {
	
	public void insert(Employee e);
	public List<Employee> findAll();

}
