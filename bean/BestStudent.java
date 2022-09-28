package com.nissan.bean;

import java.util.Scanner;

public class BestStudent {

	public static void main(String[] args)
	{
		
	   //declare variables
		Scanner input= new Scanner(System.in);
		
		//user input no of students,first student name and marks
		System.out.print("Enter no of students:");
		int noOfStudents=input.nextInt();
		System.out.print("Enter student name:");
		String name1=input.next();
		System.out.print("Enter student marks:");
		int score1=input.nextInt();		
	
		//for loop --for taking remaining students names and marks
		for(int i=1;i<noOfStudents;i++) 
		{  
			System.out.print("Enter student name:");
			String name=input.next();
			System.out.print("Enter student marks:");
			int score=input.nextInt();
			
			//check condition-comparing  every student mark with first student score
			if(score>score1) 
			{
				name1=name;
				score1=score;
		     }
	     }
		//displaying best student
		System.out.println("The BestStudent is: "+name1+" and score is "+score1);
		
	}	

}


