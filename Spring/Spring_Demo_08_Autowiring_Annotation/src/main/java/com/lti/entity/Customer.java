package com.lti.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {

	private String cname;
	
	//Account is autowire by annotation
	
	
	//Qualifier annotation is used when more than one bean for Account
	//To match & inject the proper account inside the customer
	@Autowired
	@Qualifier(value = "acc2")
	private Account account;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Account getAccount() {
		return account;
	}
	
//It is to not write setAccount coz setters methods are their in Account class
	public void setAccount(Account account) {
		this.account = account;
	}
	
	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", account=" + account + "]";
	}
	
	
}
