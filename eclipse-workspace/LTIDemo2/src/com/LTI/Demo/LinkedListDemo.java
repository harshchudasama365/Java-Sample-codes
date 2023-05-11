package com.LTI.Demo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String args[]) {
		List<String> obj1 = new LinkedList();
		
		obj1.add("harsh");
		obj1.add("nill");
		
		List<String> obj2 = new LinkedList();
		
		obj2.add("harsh");
		obj2.add("JC");
		obj2.add("nill");
		
		System.out.println(obj1.retainAll(obj2));
		System.out.println(obj1);
		
		
		
		
		
		
	}
	
	

}
