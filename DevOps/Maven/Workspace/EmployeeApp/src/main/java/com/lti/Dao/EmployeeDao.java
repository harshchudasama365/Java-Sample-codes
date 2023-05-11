package com.lti.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lti.Entity.Employee;

public class EmployeeDao {
	
	private Connection conn;
	
	public EmployeeDao() throws SQLException, ClassNotFoundException{
		
		conn = DatabaseConn.getconn();
	}
	
	public void addEmp(Employee e) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("insert into Employee_Table(username, password, email) values(?,?,?)");
		ps.setString(1,e.getUsername());
		ps.setString(2,e.getPassword());
		ps.setString(3,e.getEmail());
		ps.executeUpdate();
		ps.close();
	
	
	}
	
	public Employee getEmpByName(String username) throws SQLException {
		Employee emp  = new Employee();
		PreparedStatement ps = conn.prepareStatement("select * from Employee_Table where username = ?");
		ps.setString(1, username);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			emp.setUsername(rs.getString("username"));
			emp.setPassword(rs.getString("password"));
			emp.setEmail(rs.getString("email"));
		}
		return emp;
	}
	
	public void deleteEmpbyname(String username) throws SQLException 
	{
		  PreparedStatement ps = conn.prepareStatement("delete from Employee_Table where username = ?");
		  ps.setString(1, username);
		  ps.executeUpdate();
		  ps.close();
	}

}
