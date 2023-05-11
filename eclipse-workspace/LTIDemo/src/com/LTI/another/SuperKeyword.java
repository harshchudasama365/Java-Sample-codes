package com.LTI.another;

class A{
	public int x = 5;
	A(){
		this(500);  //this keyword will calls constructor having one parameterise constructor
		System.out.println("Default from A");
	}
	A(int i){
		System.out.println("Para from A"+i);
	}
}

public class SuperKeyword extends A{

	public SuperKeyword() {
		// TODO Auto-generated constructor stub
		System.out.println("Default frfom B");
		System.out.println(super.x);
	}
	
	public SuperKeyword (int y) {
//		super(6);
		System.out.println("Para of B"+y);
	}

}
