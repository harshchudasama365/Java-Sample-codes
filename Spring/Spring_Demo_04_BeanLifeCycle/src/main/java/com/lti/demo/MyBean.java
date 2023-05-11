package com.lti.demo;

public class MyBean {
	
	private String beanName;

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	@Override
	public String toString() {
		return "MyBean [beanName=" + beanName + "]";
	}
	
	public void init() {
		System.out.println("MyBean int() : initialize the MyBean.");
	}
	
	public void destroy() {
		System.out.println("MyBean destroy() : destroy the MyBean");
	}

}
