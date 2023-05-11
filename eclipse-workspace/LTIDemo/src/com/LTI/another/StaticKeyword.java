package com.LTI.another;

public class StaticKeyword {
	static int count;
		// TODO Auto-generated constructor stub
		
		public StaticKeyword(){
			count++ ;
		}
		public StaticKeyword(int n){
			count++;
		}
		public StaticKeyword(int n, int m){
			count++ ;
		
	}
		public void display() {
			System.out.println(count);
		}
}
