package com.lti.dao;

import com.lti.entity.Employee;

public interface EmployeeDao {
	
	public Employee findEmployeeById(int eid);
	public Employee createEmployee(Employee emp);
	

}
