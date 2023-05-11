package com.LTI;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class userFunc {
	
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	public userFunc() throws ClassNotFoundException, SQLException {
		con = DatabaseCon.getConnection();
	}

	public void basedOnComplaintId(int complId) {
		// TODO Auto-generated method stub
		try {
			stmt=con.createStatement();
			String query = String.format("select Issue from master where `Complaint ID` = %d", complId);
			rs = stmt.executeQuery(query);
			
			if(rs==null) {
				System.out.println("Given Complaint ID does not exist");
			}else {
				System.out.println("------------Issues----------");
				 while(rs.next())
				        {
				            
				            System.out.println(rs.getString(1));
				        }
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	public void basedOnTimelyResponse() {
		// TODO Auto-generated method stub
		try {
			stmt=con.createStatement();
			String query = String.format("select Issue from master where `Timely response` = 'Yes'");
			rs = stmt.executeQuery(query);
			
			if(rs==null) {
				System.out.println("No Timely Response exists");
			}else {
				System.out.println("------------Issues----------");
				 while(rs.next())
				        {
				            
				            System.out.print(rs.getString(1));
				        }
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	public void basedOnCloseComp() {
		// TODO Auto-generated method stub
		try {
			stmt=con.createStatement();
			String query = String.format("select Issue from master where `Comapny response to consumer` not null");
			rs = stmt.executeQuery(query);
			
			if(rs==null) {
				System.out.println("No any Closed Complaint");
			}else {
				System.out.println("------------Issues----------");
				 while(rs.next())
				        {
				            
				            System.out.print(rs.getString(1));
				        }
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	public void basedOnBankName(String bankName) {
		// TODO Auto-generated method stub
		try {
			stmt=con.createStatement();
			String query = String.format("select Issue from master where lower(company) = %s", bankName);
			rs = stmt.executeQuery(query);
			
			if(rs==null) {
				System.out.println("No Complaint is there for "+bankName );
			}else {
				System.out.println("------------Issues----------");
				 while(rs.next())
				        {
				            
				            System.out.print(rs.getInt(1));
				        }
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	public void basedOnYear(String year) {
		// TODO Auto-generated method stub
		try {
			stmt=con.createStatement();
			String query = String.format("select Issue from master where right(`Date received`, 4) = %s", year);
			rs = stmt.executeQuery(query);
			
			if(rs==null) {
				System.out.println("No Complaint found for the year "+year);
			}else {
				System.out.println("------------Issues----------");
				 while(rs.next())
				        {
				            
				            System.out.print(rs.getInt(1));
				        }
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}


	
}
