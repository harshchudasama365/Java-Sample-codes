package com.lti.JPA_OneToOne_Uni;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Acc_map1")
public class Account {
	
	@Id
	private int accno;
	private String bname;
	private long accbal;
	
	public long getAccbal() {
		return accbal;
	}
	public void setAccbal(long accbal) {
		this.accbal = accbal;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", bname=" + bname + ", accbal=" + accbal + "]";
	}

}
