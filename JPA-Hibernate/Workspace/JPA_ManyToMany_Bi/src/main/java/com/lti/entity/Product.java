package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Product_map1")
public class Product {
	
	//Owner Side
	
	@Id
	private int pid;
	private String pname;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Product_Order_New_Table",
				joinColumns = @JoinColumn(name = "pid_fk"),
				inverseJoinColumns = @JoinColumn(name = "oid_fk"))
	private List<Order> order_list = new ArrayList<>();
	
	public List<Order> getOrder_list() {
		return order_list;
	}
	public void setOrder_list(List<Order> order_list) {
		this.order_list = order_list;
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
		return "Product [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
}
