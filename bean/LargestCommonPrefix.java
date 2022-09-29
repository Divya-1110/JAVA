package com.nissan.bean;

import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class LargestCommonPrefix {

	public static void main(String[] args)
	{
	   Scanner input=new Scanner(System.in);
	   
	   //get user input
	   System.out.println("Enter the String1:");
	   String firststring=input.nextLine();
	   
	   System.out.println("Enter the String2:");
	   String secondstring=input.nextLine();		
		
	   //logic
	   
	   //find length of smallest string
	   int smaller=Math.min(firststring.length(), secondstring.length());
	   
	   //len of smaller string as max loop iteration
	   //char to be checked from first to second
	   //StrinBuilder is used to append
	   StringBuilder commonstring=new StringBuilder();
	   for(int i=0;i<smaller;i++)
	   {
		  char c=firststring.charAt(i);
		  
		  //check condition
		  if(c==secondstring.charAt(i))
		  {
			 commonstring.append(c); 
		  }
		  else
		  {
			 break; 
		  }
	   }
	   
	   //display-output
	   if(commonstring.length()==0)
	   {
		  System.out.println(firststring+" and "+secondstring+"have no common prefix");
		  
	   }
	   else 
	   {
		   System.out.println("The common prefix is: "+commonstring);
	   }
	 	
    }
}
