package com.LTI.Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEachLoop {
	
	public static void main(String args[]) {
		ArrayList<String> obj = new ArrayList<String>();//Hetrogeneous
		obj.add("harsh");
		obj.add("AB");
		obj.add("KL");
		
		  for(String i1:obj)
	        {    
	            System.out.println(i1.toUpperCase());
	        }
	  
	      //  --------------OR--------------
		  
		  Iterator itr = obj.iterator();
		  
		  while(itr.hasNext()) {
			  String s = (String)itr.next();
			  System.out.println(s.toUpperCase());
		  }
		  
	        System.out.println(obj);
	        
		
	}

}
