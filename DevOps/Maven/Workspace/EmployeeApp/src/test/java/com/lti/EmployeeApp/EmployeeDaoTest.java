package com.lti.EmployeeApp;



import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.Connection;

import com.lti.Dao.DatabaseConn;
import com.lti.Dao.EmployeeDao;
import com.lti.Entity.Employee;

public class EmployeeDaoTest {
	
	@Test
	public void getConnectionTEst() {
		Connection conn = DatabaseConn.getconn();
		assertNull(conn, "connection successful");
		
	}
	
	@Test
	public void addEmpTest() {
		Employee emp = new Employee();
        emp.setUsername("emp");
        emp.setPassword("emppass");
        emp.setEmail("emp@email");
        Connection conn = DatabaseConn.getconn();
        EmployeeDao dao = new EmployeeDao();
        dao.addEmp(emp);
        Employee empByDb = new Employee();
	}

}
