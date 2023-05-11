package com.LTI.Demo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ThrowsChecked {
	public static void main(String args[])  {
		System.out.println("Welcome :)");
		
		try {
			
			ThrowsChecked obj = new ThrowsChecked();
			obj.f1();	
		} 
		catch(Exception e) {
			System.out.println("RAAAAAAAAAAA");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("FINALLY EXECUTED");
		}
		
	}
	
 void f1() throws FileNotFoundException{
	 f2();
 }
 
 void f2() throws FileNotFoundException{
	 f3();
 }
 
 void f3() throws FileNotFoundException{
	
	PrintWriter pw  = new PrintWriter("abc.txt");
	pw.write("hello");
}
}
