package com.LTI.Demo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo {
	public static void main(String args[])  {
		System.out.println("Welcome :)");
		
		try {
			
			Demo obj = new Demo();
			obj.f1();
			
//			String s1 = args[0];
//			String s2 = args[1];
//			
//			int x = Integer.parseInt(s1);
//			int y = Integer.parseInt(s2);
//			
//			int z = x/y;
//			
//			System.out.println(z);
		
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println("ENTER input in number");
		}
		catch(ArithmeticException e) {
			System.out.println("do not enter 0");
			
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
