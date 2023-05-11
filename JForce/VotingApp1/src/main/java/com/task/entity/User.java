package com.task.entity;

import javax.persistence.*;



@Entity
public class User {
	@Id
	String username;
	String password;
	String emailid;
	String mobilenumber;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", emailid=" + emailid + ", mobilenumber="
				+ mobilenumber + "]";
	}
	
	
}
