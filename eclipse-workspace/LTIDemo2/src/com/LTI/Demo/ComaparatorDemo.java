package com.LTI.Demo;

import java.util.Set;
import java.util.TreeSet;

public class ComaparatorDemo {
public static void main(String[] args)    {
        
        System.out.println("welcome");
        Set<Integer> l=new TreeSet<Integer>(new ComparatorImpl());
        l.add(15);
        l.add(7);
        l.add(8);
        l.add(35);
        l.add(99);
        l.add(6);

        System.out.println(l);      
    }

}
