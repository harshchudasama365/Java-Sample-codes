package com.LTI.Demo;

import java.util.Comparator;

public class ComparatorMovie implements Comparator<Movie>{
	public int compare(Movie m1, Movie m2) {
		if(m1.getRating() < m2.getRating()) {
			return -1;
		}else if(m1.rating > m2.getRating()) {
			return 1;
		}else {
			return 0;
		}	
	}
}
