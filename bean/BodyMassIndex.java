package com.nissan.bean;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		// get input from user
				Scanner input =new Scanner(System.in);
				System.out.println("Enter the Weight in pounds: ");
				double weight=input.nextDouble();
				System.out.println("Enter the Height: ");
				double Height=input.nextDouble();
				
	double result=bodyMassIndex(weight,Height);
	System.out.println("The Bodymassindex is :"+result);
	System.out.println("The BMI REPORT is :",bmiReport(result));
	
	}
	//bim report
	private static void bmiReport(double result) {
		if(result<19)
		{
			System.out.printf("UnderWeight");
		}
		else if(result>19) {
			System.out.printf("Normal Weight");
		}
		else
		{
			System.out.printf("Over Weight");
		}
	
	}
	
	//calculating BMI
	private static double bodyMassIndex(double weight,double Height) {
		double kilo=weight*0.45359273; //converting pounds to kilogram
		double meter=Height*0.0254;//converting inches to meters
		double bmi=kilo/(meter*meter);
		return bmi; 
   
     }
}
