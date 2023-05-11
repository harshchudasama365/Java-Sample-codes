package com.LTI.java;

public class Demo{
	
	public static void main(String args[]) {
		CurrentAccount customer1 = new CurrentAccount("BK7G9L006", 30000,"ROOT");
		 customer1.displayAccount();
		 customer1.withdraw(1000);
	}

}
