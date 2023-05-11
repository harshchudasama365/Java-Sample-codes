package com.lti.DemoMaven_Project2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDemo {

		@Test
		void strCheck() {
			String s1 = "Demo";
			System.out.println("Test case for string check");
			assertEquals("Demo", s1);
		}
}
