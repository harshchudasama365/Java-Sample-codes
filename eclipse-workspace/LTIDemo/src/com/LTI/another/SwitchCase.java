package com.LTI.another;

public class SwitchCase {
	int day = 8;
	public void run(){
		switch(day) {
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		default:
			System.out.println("Default executed");
			break;
		}
	}
}
