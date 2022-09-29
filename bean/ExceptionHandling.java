package com.nissan.bean;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		Scanner input=new Scanner(System.in);
		
		int firstNumber,secondNumber,result;
	
		System.out.print("Enter a first number");
		firstNumber=input.nextInt();
		
		System.out.print("Enter a second number");
		secondNumber=input.nextInt();
		
		if(secondNumber==0)
		{
			throw new ArithmeticException();
		}
		else
		{
		    //result
		  result=firstNumber/secondNumber;
		  System.out.println("result: "+result);
		}
	}
		catch(ArithmeticException e) 
		{
			System.out.print("Sorry!Invalid entry");
		}
		
	}
	

}
