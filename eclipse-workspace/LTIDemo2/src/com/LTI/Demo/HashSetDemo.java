
package com.LTI.Demo;
//No duplicates and insertion order not preserved
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String args[]) {
		Set<String> obj1 = new HashSet<String>();
		
		obj1.add("harsh");
		obj1.add("nill");
		
		obj1.add("harsh");
		
		System.out.println(obj1);
	}
	}
