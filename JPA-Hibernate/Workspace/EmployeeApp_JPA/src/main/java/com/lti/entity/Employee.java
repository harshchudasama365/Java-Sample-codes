package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(
		name = Employee.SALARY_RANGE_QUERY,
		query = "SELECT e from Employee e Where e.salary BETWEEN 10000 AND 100000")

@Table(name = "Emp_Table")
public class Employee {

	public static final String SALARY_RANGE_QUERY = "salaryRangeQuery";

	@Id
	private int empid;

	private String empName;
	private String depName;
	private long salary;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", depName=" + depName + ", salary=" + salary
				+ "]";
	}

	// Create-fun for Employee
	public static Employee createEmp(int eid, String ename, String dept, long sal) {
		Employee empobj = new Employee();
		empobj.setEmpid(eid);
		empobj.setEmpName(ename);
		empobj.setDepName(dept);
		empobj.setSalary(sal);
		return empobj;

	}

}
