package com.lti.entity;

public class Account {

	private int accid;
	private String acctype;
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	@Override
	public String toString() {
		return "Account [accid=" + accid + ", acctype=" + acctype + "]";
	}
	
	
}
