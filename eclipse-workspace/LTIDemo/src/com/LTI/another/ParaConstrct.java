package com.LTI.another;

public class ParaConstrct {

	public int rollno;
	String name;
	int marks;
	
	public ParaConstrct() {
		// TODO Auto-generated constructor stub
		this.rollno = 10;
		this.name = "harsh";
		this.marks = 90;
		System.out.println("Constructor called");
		System.out.println(rollno+":"+name+":"+marks);
	}
	
	public ParaConstrct(int r, String n, int m) {
		// TODO Auto-generated constructor stub
		this.rollno = r;
		this.name = n;
		this.marks = m;
		System.out.println("Para Constructor called");
		System.out.println(rollno+":"+name+":"+marks);
	}

}
