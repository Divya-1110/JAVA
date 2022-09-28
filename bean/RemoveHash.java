package com.nissan.bean;

import java.util.Scanner;

public class RemoveHash {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		//string - user input
	     System.out.println("Enter a string");
	     String fourthstring=input.next();
	     
	       //length of string
	       int len = fourthstring.length();
	       
	       String resultString = "";
	       
	       //removing  hash and its immediate left and right values
	       for (int i = 0; i < len; i++) 
	       {
	         if (i == 0 && fourthstring.charAt(i) != '#')
	            resultString +=fourthstring.charAt(i);
	           if (i > 0 && fourthstring.charAt(i) != '#' && fourthstring.charAt(i-1) != '#') 
	           resultString += fourthstring.charAt(i);
	          if (i > 0 && fourthstring.charAt(i) == '#' && fourthstring.charAt(i-1) != '#') 
	           resultString = resultString.substring(0,resultString.length()-1);
	        }
		
		//display string after removing hash and its immediate left and right values
	       System.out.println(resultString);
    
	}
}
