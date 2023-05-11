package com.LTI.another;

public class ArraysDemo {
	public void run1D() {
		int[] arr = {1, 2, 3, 4, 5, 6};
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void run2D() {
		int[][] arr = { {1, 2, 3, 4}, {5, 6, 7} };
	    for (int i = 0; i < arr.length; ++i) {
	      for(int j = 0; j <arr[i].length; ++j) {
	        System.out.println(arr[i][j]);
	      }
	    }
	}
}
