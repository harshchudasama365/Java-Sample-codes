package com.LTI.Demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparatorMovieImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Movie> obj = new ArrayList<>();
		
		Movie m1 = new Movie(4, "ABC");
		Movie m2 = new Movie(1, "DEF");
		Movie m3 = new Movie(8, "XYZ");
		
		obj.add(m1);
		obj.add(m2);
		obj.add(m3);
		
		ComparatorMovie ratingCompare = new ComparatorMovie();
		
		
		Collections.sort(obj, ratingCompare);
		
		System.out.println(obj);

	}

}
