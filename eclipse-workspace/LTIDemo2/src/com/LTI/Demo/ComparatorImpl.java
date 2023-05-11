package com.LTI.Demo;
//By default Comparable is used to sort the data(method name-compareTo) , but if we want to perform customized operation than Interface Comparator is used and the method is compare
import java.util.Comparator;

public class ComparatorImpl implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		if(i1<i2) {
			return +1;
		}else if(i1>i2) {
			return -1;
		}else {
			return 0;
		}
	}
}
