package com.nissan.bean;

import java.util.Scanner;

public class ArrayQuestionOne
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		
	    System.out.println("Enter a string");
	    String firststring=input.next();
	    
	   //declare variables
	    int sumofdigits =0;
	    
	    //calculating sum of digits in string
	    for(int i=0;i<firststring.length();i++) 
	    {
	    	if(firststring.charAt(i)>='0' && firststring.charAt(i)<='9')
	    	{
	    		sumofdigits=sumofdigits+firststring.charAt(i)-'0';
	    	}
	    }
	    
	    //display sum of digits
	    System.out.println("Sum Of Digits in a string: "+sumofdigits);
	}
    
}
 
