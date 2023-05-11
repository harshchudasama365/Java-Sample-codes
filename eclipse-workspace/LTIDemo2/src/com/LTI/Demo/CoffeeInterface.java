package com.LTI.Demo;

public interface CoffeeInterface {
	
	void task1();
	void task2();
	
	default void task3() {
		System.out.println("Task3 is default");
	}

}
