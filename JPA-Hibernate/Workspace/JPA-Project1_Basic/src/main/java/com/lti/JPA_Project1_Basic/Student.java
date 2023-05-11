package com.lti.JPA_Project1_Basic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
		
		@Id
		int rollno;
		
		String sname;
		int marks;
		
		public Student(int rollno, String name, int marks) {
			super();
			this.rollno = rollno;
			this.sname = name;
			this.marks = marks;
		}


		

		public Student() {
			// TODO Auto-generated constructor stub
		}




		public int getRollno() {
			return rollno;
		}


		public void setRollno(int rollno) {
			this.rollno = rollno;
		}


		public String getSname() {
			return sname;
		}


		public void setSname(String name) {
			this.sname = name;
		}


		public int getMarks() {
			return marks;
		}


		public void setMarks(int marks) {
			this.marks = marks;
		}


		
		
	}

