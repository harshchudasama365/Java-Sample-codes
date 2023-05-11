package com.lti.demo;

public class Student {
	
	private int rollno;
	private String sname;
	private int marks;
	
	private Address add;

	public Student(int rollno, String sname, int marks, Address add) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.marks = marks;
		this.add = add;
	}
	
	

	public Address getAdd() {
		return add;
	}



	public void setAdd(Address add) {
		this.add = add;
	}



	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", marks=" + marks + ", add=" + add + "]";
	}
	
	

}
