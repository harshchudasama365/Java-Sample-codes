package com.lti.exception;

public class NoSuchEMployeeException extends Exception{

	public NoSuchEMployeeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
		System.out.println(message);
	}

}
