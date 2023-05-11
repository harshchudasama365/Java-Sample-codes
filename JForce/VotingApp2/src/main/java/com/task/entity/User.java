package com.task.entity;

import javax.persistence.*;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

//@EnableAutoConfiguration

@Entity
@Table(name="UserDetailsN")
public class User {
	@Id
	Long userid;
	String username;
	String password;
	String emailid;
	String mobilenumber;
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	public User(Long userid, String username, String emailid, String mobilenumber, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.emailid = emailid;
		this.mobilenumber = mobilenumber;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public User(String username, String password, String emailid, String mobilenumber) {
		super();
		this.username = username;
		this.password = password;
		this.emailid = emailid;
		this.mobilenumber = mobilenumber;
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
