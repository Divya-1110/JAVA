package com.nissan.bean;

import java.util.Scanner;

public class DemoArthimeticOperation {

	public static void main(String[] args) {
		
		//scanner class
		Scanner input =new Scanner(System.in);
		
		//user input
		System.out.println("Enter the integer Number1:");
		int number1=input.nextInt();
		
		System.out.println("Enter the integer Number2:");
		int number2=input.nextInt();
		
		System.out.println("Enter the float Number1:");
		float num1=input.nextFloat();
		
		System.out.println("Enter the float Number2:");
		float num2=input.nextFloat();
		
		//creating object AirthmeticOperations
		AirthmeticOperations opertion =new AirthmeticOperations();
		
		//display addition output
		System.out.println("the addition of two int numbers is:"+opertion.calculate(number1,number2));
		System.out.println("the addition two float numbers is:"+opertion.calculate(num1, num2));
	}

}
