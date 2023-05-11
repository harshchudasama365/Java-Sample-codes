package com.LTI;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		userFunc obj = new userFunc();
		
		int n = 0;
		
		do{
			System.out.println("************** MENU***********");
			System.out.println("1.Display complaint based on year");
			System.out.println("2.Display complaint based on bank name");
			System.out.println("3.Display complaint based on complaint id");
			System.out.println("4.Display all closed complaints");
			System.out.println("5.Complaints that recieved Timely Response: ");
			System.out.println("6.Exit");
			System.out.println("Please enter your choice");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:System.out.println("Enter the year : ");
					String year = sc.next();
					obj.basedOnYear(year);
					break;
			case 2:System.out.println("Enter the bank name : ");
					String bankName = sc.next();
					obj.basedOnBankName(bankName.toLowerCase());
					break;
			case 3:System.out.println("Enter the Complaint ID : ");
					int complId = sc.nextInt();
					obj.basedOnComplaintId(complId);
					break;
			case 4:	obj.basedOnCloseComp();
					break;
			case 5:	obj.basedOnTimelyResponse();
					break;
			case 6:System.out.println("THank you for using our system !!!");
					System.exit(0);
					break;
			default:
				System.out.println("Enter valid input !");
					
			}

		}while(n!=6);
		

		
	}

}
