package com.LTI.another;

public class StaticNonstaticBlock {

	public StaticNonstaticBlock() {
		// TODO Auto-generated constructor stub
		System.out.println("CONSTRUCTOR");
	}
	static {
		System.out.println("STATIC BLOCK");
	}
	{
		System.out.println("NON STATIC BLOCK");
	}

}
