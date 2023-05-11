package com.LTI.Demo;
//ArrayList is unsynchronous and it is Thread safe and faster than vector
import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String args[]) {

	//	ArrayList<Integer> obj = new ArrayList();//Homogeneous 
		ArrayList obj = new ArrayList();//Hetrogeneous
		obj.add(100);
		obj.add("harsh");
		obj.add(12.5f);
		System.out.println(obj);
		
		Person p1 = new Person(101, "Harsh","HUD");
		Person p2 = new Person(102, "Harsha","JK");
		Person p3 = new Person(103, "Harshi","JM");
		
		ArrayList<Person> obj2 = new ArrayList();
		obj2.add(p1);
		obj2.add(p2);
		System.out.println(obj2);
		
	}
}
