package com.lti.Spring_Demo_07_Autowiring_Xml;

public class Account {
	
	private String acctype;
	

	public String getAcctype() {
		return acctype;
	}

	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}

	@Override
	public String toString() {
		return "Account [acctype=" + acctype + "]";
	}
	
	

}
