package com.lti.service;

import java.util.List;

import com.lti.entity.Employee;

public interface EmployeeService {

	void create(Employee e);
	List<Employee> showAllEmployee();
	
}
