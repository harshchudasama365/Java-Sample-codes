package com.lti.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.lti.entity.Person;

public class PersonDAOImpl implements PersonDAO{
	
	
	@Autowired
	private JdbcTemplate jdbc_temp;
	

//	public void setJdbc_temp(JdbcTemplate jdbc_temp) {
//		this.jdbc_temp = jdbc_temp;
//	}

	
	public void insert(Person p) {
		String q1 = "INSERT INTO Person_details VALUES (?,?,?)";
		
		Object[] args = {p.getPname(), p.getAdd(), p.getPid()};
		
		int noOfRowsinserted = jdbc_temp.update(q1, args);
		
		System.out.println("No of rows inserted = "+noOfRowsinserted);
	}

}
