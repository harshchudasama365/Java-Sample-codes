package com.lti.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.lti.entity.Person;

public class PersonDAOImpl implements PersonDAO{
	
	private JdbcTemplate jdbc_temp = new JdbcTemplate(getDataSource());

	private DataSource ds;
	
	public DataSource getDataSource() {
		String url  = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "harsh";
		String pass="root";
		
		DataSource ds1 = new DriverManagerDataSource(url, user, pass);
		System.out.println("Connection Established");
		return ds1;
	}

	public void insert(Person p) {
		String q1 = "INSERT INTO Person_details VALUES (?,?,?)";
		
		Object[] args = {p.getPname(), p.getAdd(), p.getPid()};
		
		int noOfRowsinserted = jdbc_temp.update(q1, args);
		
		System.out.println("No of rows inserted = "+noOfRowsinserted);
	}

}
