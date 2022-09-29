package com.nissan.bean;

public class CheckAge {

	public static void main(String[] args) 
	{
		
		ExceptionHandlingQ1 valid =new ExceptionHandlingQ1();
		try 
		{
			valid.validateAge();  
		}
		catch(AgeException a) {
			System.out.print("Invalid entry!");
			
		}

	}

}
