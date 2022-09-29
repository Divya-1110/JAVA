package com.nissan.bean;
//constructor -assignment -2problem

import java.util.Scanner;

public class DemoPerson {

	public static void main(String[] args) {
		
		//scanner object
		Scanner input=new Scanner(System.in);
		
		//use input 
		  System.out.println("Enter person name");
		  String personName=input.nextLine();
		  
		  System.out.println("Enter Person Age");
		  int personAge=Integer.parseInt(input.nextLine());
		  
		  System.out.println("Enter employee salary");
		  float salary=input.nextFloat();
		 
		  //Person object
		Person person1=new Person(personName,personAge,salary);
		
		//display person details
		person1.display();
		
	}

}
