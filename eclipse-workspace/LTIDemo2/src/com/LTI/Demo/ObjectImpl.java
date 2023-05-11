package com.LTI.Demo;

public class ObjectImpl {
	int id;
	String name;
	public ObjectImpl(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
//		toString is method of Object class
//		overriding the toString method 
		return (id+":"+name);
	}
}
