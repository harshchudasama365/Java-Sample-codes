package com.LTI.Demo;
//No duplicates but insertion order preserved
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	public static void main(String args[]) {
		Set<String> obj1 = new LinkedHashSet<String>();
		
		obj1.add("harsh");
		obj1.add("nill");
		obj1.add("harsh");
		obj1.add("ghhhhn");
		obj1.add("rtyfhh");
		obj1.add("fdgnv");
		
		System.out.println(obj1);
	}

}
