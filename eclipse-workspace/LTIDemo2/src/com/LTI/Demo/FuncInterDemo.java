package com.LTI.Demo;

public class FuncInterDemo {

	public static void main(String[] args){
		// TODO Auto-generated method stub
//		FuncInterDef obj = new FuncInterImpl();
//		obj.m1();
//------------NOTE----------   if functional interface is there than we dont have to create dedicated(intermediate) 
//class we can define directly as lambda expression 
// no need to create FuncInterImpl class
		FuncInterDef obj = ()->System.out.println("Bye");
		obj.m1();
	}

}
