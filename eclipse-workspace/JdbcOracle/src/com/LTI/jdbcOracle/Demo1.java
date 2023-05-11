package com.LTI.jdbcOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
        String un="sysdba";
        String pwd="root";
        Connection con=DriverManager.getConnection(url, un, pwd);
        
	}

}
