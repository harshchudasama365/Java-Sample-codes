package com.LTI.Demo;


import java.util.List;
import java.util.Vector;

public class VectorDemo {
	public static void main(String args[]) {
		List<String> obj1 = new Vector();
		
		obj1.add("harsh");
		obj1.add("nill");
		
		List<String> obj2 = new Vector();
		
		obj2.add("harsh");
		obj2.add("JC");
		
		System.out.println(obj1.retainAll(obj2));
		System.out.println(obj1);
		
		
		
	}
}
