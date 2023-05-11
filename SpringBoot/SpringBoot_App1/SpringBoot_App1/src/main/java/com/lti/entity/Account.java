package com.lti.entity;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
	private int acc_id;
	private String acc_number;
	private String type;
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public String getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(String acc_number) {
		this.acc_number = acc_number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Account [acc_id=" + acc_id + ", acc_number=" + acc_number + ", type=" + type + "]";
	}
	
	

}
