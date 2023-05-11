package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.EmployeeDao;
import com.lti.entity.Employee;

//Class acts as service class
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired 
	private EmployeeDao empdao;
	
	public void create(Employee e) {
		empdao.insert(e);
	}

	public List<Employee> showAllEmployee() {
		return empdao.findAll();
	}

}
