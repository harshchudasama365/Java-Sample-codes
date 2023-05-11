package com.LTI.another;

class Parents{
	void display() {
		System.out.println("PARENT DISPLAY IS CALLED");
	}
}
public class MethodOverriding extends Parents{

	public void display() {
		System.out.println("CHILD DISPLAY IS CALLED");
	}

}
