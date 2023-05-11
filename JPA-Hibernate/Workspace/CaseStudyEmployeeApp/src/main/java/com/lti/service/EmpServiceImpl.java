package com.lti.service;

import com.lti.dao.EmployeeDao;
import com.lti.dao.EmployeeDaoImpl;
import com.lti.entity.Employee;
import com.lti.exception.NoSuchEMployeeException;

/**
 * @author Harsh
 *
 */
public class EmpServiceImpl implements EmpService {
	
	private EmployeeDao edao = new EmployeeDaoImpl();

	@Override
	public boolean addEmp(Employee emp) {
		Employee emp1 = edao.createEmployee(emp);
		if(emp1 == null) {
			return false;
		}
		return true;
	}

	@Override
	public Employee findEmp(int eid) throws NoSuchEMployeeException {
		Employee empobj = edao.findEmployeeById(eid);
		if(empobj != null) {
			return empobj;
		}
		throw new NoSuchEMployeeException("No Employee with id is found");
	}
	
	

}
