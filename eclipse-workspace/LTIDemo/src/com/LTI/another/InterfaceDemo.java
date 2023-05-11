package com.LTI.another;

interface I1{
	void f1();
}

interface I2 extends I1{ //1 interface can inherite another interface
	
}

public class InterfaceDemo implements I1{
	public void f1() {
		System.out.println("HEY");
	}
}
