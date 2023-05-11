package com.LTI.another;

class Person {
	String name;
	String address;
	
	public Person() {
		
	}

	public Person(String name, String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address = address;
		System.out.println("para constuct");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

public class Inheritance extends Person{
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Inheritance(int id) {
		super();
		this.id = id;
	}
	
}



