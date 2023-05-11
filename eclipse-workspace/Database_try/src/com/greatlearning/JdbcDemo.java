package com.greatlearning;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection  con = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/week4","root","root");
			
//			if(con!=null) {
//				System.out.println("Connection Established");
//			}
//			else {
//				System.out.println("Connection not Established");
//			}
			

			Statement st=con.createStatement();
	        
//	        st.executeUpdate("create table JK (eno int,ename varchar(20),esal int)");
//			  System.out.println("table created");
//	        st.executeUpdate("insert into JK values(111,'fazal',5000)");
//	        System.out.println("inserted properly");
			
//			--------------------------------------------------------
			
			
//			ResultSet rs=st.executeQuery("select * from JK");
//	        while(rs.next())
//	        {
//	            System.out.print(rs.getInt(1));
//	            System.out.print(rs.getString(2));
//	            System.out.println(rs.getInt(3));
//	            
//	            
//	        }
//	        System.out.println("data taken properly");
			
//			---------------------------------------------------------
//			Scanner sc=new Scanner(System.in);
//	        
//	        int eno=sc.nextInt();
//	        String ename=sc.next();
//	        int esal=sc.nextInt();
//	        
//	        String query=String.format("insert into JK values(%d,'%s',%d)", eno,ename,esal);
//	        
//	        st.executeUpdate(query);
//	        
//	        
//	        
//	        System.out.println("data inserted properly");
//	        
//	        --------------------------------------------------------------------
			
//			 Scanner sc=new Scanner(System.in);
//		        
//		        int id=sc.nextInt();
//		        
//		        
//		        String query=String.format("delete from JK where eno=%d",id);
//		        
//		        st.executeUpdate(query);
//		        
//		        
//		        
//		        System.out.println("data deleted properly");
//		        
		        
//		  -----------------------------------------------------------------------
		  
//		  ResultSet rs=st.executeQuery("select max(esal)  from JK");
//	        
//	        while(rs.next())
//	        {
//	            
//	            System.out.println(rs.getInt(1));
//	        }
//	        
//	        System.out.println("found salary properly");
			
//			-----------------------------------------------------------------
			
			
			String query="insert into JK values(?,?,?)";
	        PreparedStatement pst=con.prepareStatement(query);
	        System.out.println("prepared statement object created");
	        Scanner sc=new Scanner(System.in);
	        while(true)
	        {
	            
	            System.out.println("enter employee number");
	            int eno=sc.nextInt();
	            String ename=sc.next();
	            int esal=sc.nextInt();
	            
	            pst.setInt(1, eno);
	            pst.setString(2,ename);
	            pst.setFloat(3, esal);
	            
	            pst.executeUpdate();
	            System.out.println("records  inserted successfully");
	            System.out.println("Do you want to insert one more record");
	            String option=sc.next();
	            if(option.equalsIgnoreCase("no"))
	                break;
	            
	        
	        }
			
			
			
			
			
			
			con.close();
		
		

	}
		

}



