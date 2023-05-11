package com.lti.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Person_map1")
public class Person {
	
	@Id
	private int pid;
	private String pname;
	
	//Reference - list 
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Pid_MailList_FK") //IF we add this line then 1 additional table will not created, just foreign key will be added to email table
	
	private Collection<MailAddress> mail_list = new ArrayList<>();
	
	public Collection<MailAddress> getMail_list() {
		return mail_list;
	}
	public void setMail_list(Collection<MailAddress> mail_list) {
		this.mail_list = mail_list;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + "]";
	}
	
	

}
