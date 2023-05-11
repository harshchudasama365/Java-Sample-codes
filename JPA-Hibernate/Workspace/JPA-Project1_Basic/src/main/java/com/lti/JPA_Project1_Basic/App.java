package com.lti.JPA_Project1_Basic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		System.out.println("Welcome");
//		Student s1 = new Student(101, "Harsh",98);
//		
//		Student s2=new Student();
//        s2.setRollno(102);
//        s2.setSname("Akash");
//        s2.setMarks(90);
//		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
//		EntityManager emanager = factory.createEntityManager();
//		emanager.getTransaction().begin();
//		
//		
//		
//		emanager.persist(s1);
//		emanager.getTransaction().commit();
//		System.out.println("Student object created / persist inside database");
		
		System.out.println( "Hello World!" );
        
        Student s1=new Student(104,"Harsh",99);
        
        Student s2=new Student();
        s2.setRollno(102);
        s2.setSname("Akash");
        s2.setMarks(90);
       
        
        //JPA-API
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager emanager = factory.createEntityManager();
        emanager.getTransaction().begin();// For Transaction
        
        //C-------->To create/persist the object s1 inside database
        //persist()--EntityManager
        
        emanager.persist(s1);
        emanager.persist(s2);
        emanager.getTransaction().commit();
        System.out.println("Student Object created/persist inside database");
        
        //R----------> To read the student data from database
        Student read_s1=emanager.find(Student.class, 101);
        System.out.println("Student details find/read database");
        System.out.println(read_s1);
        
        //U--------->To update the student object
        emanager.getTransaction().begin();
        read_s1.setMarks(95);
        emanager.merge(read_s1);//Merge() method is used to update the data
        emanager.getTransaction().commit();
        System.out.println("Student update successfull");
        System.out.println("After updation"+read_s1);
        
        
        //D---------->To remove the data from the database
        emanager.getTransaction().begin();
        Student read_s2=emanager.find(Student.class, 102);
        System.out.println("Student details find/read from database");
        System.out.println(read_s2);
        emanager.remove(read_s2);
        emanager.getTransaction().commit();
        System.out.println("Student details find/read from database");
        
        //to check whether s2 is there or not
        //after remove() null is there
        Student read_s2_again = emanager.find(Student.class,102);
        System.out.println(read_s2_again);
        
        emanager.close();
        

	}

}
