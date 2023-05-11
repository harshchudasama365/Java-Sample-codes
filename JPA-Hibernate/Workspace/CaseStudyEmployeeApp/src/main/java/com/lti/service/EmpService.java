package com.lti.service;

import com.lti.entity.Employee;
import com.lti.exception.NoSuchEMployeeException;

public interface EmpService {
	
	public boolean addEmp(Employee emp);
	public Employee findEmp(int eid) throws NoSuchEMployeeException;

}
