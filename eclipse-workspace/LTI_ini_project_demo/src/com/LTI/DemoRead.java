package com.LTI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.opencsv.CSVReader;

//import com.opencsv.CSVReader;

public class DemoRead {

	public static void main(String[] args) throws FileNotFoundException {
		{  
			
//			@SuppressWarnings("deprecation")
//			CSVReader reader = new CSVReader(new FileReader("data.csv"), ',');
			//parsing a CSV file into Scanner class constructor  
			Scanner sc = new Scanner(new File("D:\\LTI_Assignment\\Problem_Statement\\complaints_new.csv")); 
		
//			sc.useDelimiter(",");   //sets the delimiter pattern  
			while (sc.hasNext())  //returns a boolean value  
			{  
			
			System.out.print(sc.next().split(","));  //find and returns the next complete token from this scanner  
			}   
			sc.close();  //closes the scanner  
			}  
	}
}
