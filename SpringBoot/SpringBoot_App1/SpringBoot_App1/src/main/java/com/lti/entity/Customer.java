package com.lti.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private int c_id;
	private String c_name;
	private String address;
	
	@Autowired
	private Account a1;
	
	
	
	public Account getA1() {
		return a1;
	}
	public void setA1(Account a1) {
		this.a1 = a1;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [c_id=" + c_id + ", c_name=" + c_name + ", address=" + address + ", a1=" + a1 + "]";
	}

}
