package com.LTI.Demo;

public class UserDefine_Demo {
	public static void main(String args[]) {
		// if UserDefine_Invalid extends Exception not RuntimeException  then we have to use throws keyword
		// public static void main(String args[]) throws UserDefine_Invalid
		//Coz RuntimeException is parent class of Unchecked exception so we do not have to use throws keyword, it by default return exception to calling method		
		int age = Integer.parseInt(args[0]);
		if(age < 0) {
			throw new UserDefine_Invalid("Hey Buddy do not enter negative age");
		}
	}
}
