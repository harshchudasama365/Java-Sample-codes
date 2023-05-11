package com.LTI;

import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.opencsv.*;

public class DatabaseCon {

public static Connection getConnection() throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
//		 try (CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Harsh\\Desktop\\temp.csv"))){
//			 
//		 }catch (Exception e)
//	        {
//             e.printStackTrace();
//     }
		Connection  con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project","root","root");
		
		if(con!=null) {
			System.out.println("Connection Established");
		}
		else {
			System.out.println("Connection not Established. \n Exit From the System");
			System.exit(0);
		}
		
		return con;
				
	}
}
