package com.lti.Spring_Demo_07_Autowiring_Xml;

public class Customer {
	
	private String cname;
	
	//one account ref inside the customer
	//customer have an account -- by ref
	
	private Account acc_ref;
	
	
	public Customer() {
		
	}
	

	public Customer(String cname, Account acc_ref) {
		super();
		this.cname = cname;
		this.acc_ref = acc_ref;
	}

	public Account getAcc_ref() {
		return acc_ref;
	}

	public void setAcc_ref(Account acc_ref) {
		this.acc_ref = acc_ref;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", acc_ref=" + acc_ref + "]";
	}

	
	
	
	
	

}
