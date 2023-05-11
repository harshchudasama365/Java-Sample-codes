package com.LTI.Demo;

public class Person {
	int id;
	String name;
	String address;
	public Person(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
