package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MailAddress_map1")
public class MailAddress {
	
	@Id
	private int mailid;
	private String mailadd;
	public int getMailid() {
		return mailid;
	}
	public void setMailid(int mailid) {
		this.mailid = mailid;
	}
	public String getMailadd() {
		return mailadd;
	}
	public void setMailadd(String mailadd) {
		this.mailadd = mailadd;
	}
	@Override
	public String toString() {
		return "MailAddress [mailid=" + mailid + ", mailadd=" + mailadd + "]";
	}
	

}
