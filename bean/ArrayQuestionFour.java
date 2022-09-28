package com.nissan.bean;

import java.util.Scanner;

public class ArrayQuestionFour {

	public static void main(String[] args)
	{
		
		Scanner input=new Scanner(System.in);
		
		//user input-size of array
		   System.out.println("Enter size of array:");
		   int sizeofarray =input.nextInt();
		   
		   //declare variables
		   int sumofdigits=0;
		   int marks[]=new int[sizeofarray];
		
		//sum of array values
		for(int i=0;i<sizeofarray;i++) 
		{
			marks[i]=input.nextInt();
		     sumofdigits=sumofdigits+marks[i];	    
		}
		
		//calculating average
		float average=(float)sumofdigits / sizeofarray;
		
		//display average
		System.out.println("Average mark is: "+average);
	}

}
