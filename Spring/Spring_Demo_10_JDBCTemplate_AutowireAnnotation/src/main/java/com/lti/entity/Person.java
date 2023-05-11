package com.lti.entity;

public class Person {
	
	private String pname;
	private String add;
	private int pid;
	
	public void person(){};
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", add=" + add + ", pid=" + pid + "]";
	}
	

}
