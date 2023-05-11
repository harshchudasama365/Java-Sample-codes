package com.LTI.Demo;
//Data Structure - Balanced tree 
//No duplicates and saving in ascending order
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String args[]) {
//		Set<String> obj1 = new TreeSet<String>();
		Set<Integer> obj1 = new TreeSet<Integer>((o1, o2)->(o1>o2)?-1:(o1<o2)?1:0);
		
//		obj1.add("harsh");
//		obj1.add("nill");
//		obj1.add("harsh");
//		obj1.add("aaa");
//		obj1.add("bbb");
		
		obj1.add(98);
		obj1.add(47);
		obj1.add(22);
		obj1.add(10);
		obj1.add(999);
		
		System.out.println(obj1);
	}

}
