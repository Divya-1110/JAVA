package com.nissan.bean;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) 
	{	
		
	  Scanner input =new Scanner(System.in);
				
	           // get input from user
		   System.out.println("Enter the Weight in pounds: ");
		   double weight=input.nextDouble();
				
		   System.out.println("Enter the Height: ");
		   double Height=input.nextDouble();
	
		    // display-body mass index
	            double result=bodyMassIndex(weight,Height);
	            System.out.printf("The Bodymassindex is :"+result);
	
	            //report display using bmi
	            System.out.println("The BMI REPORT is :"+bmiReport(result));
	
	}
	
	//body mass index report
	private static String bmiReport(double result) {
		if(result<19)
		{
			return "UnderWeight";
		}
		else if(result>55) {
			return"Normal Weight";
		}
		else
		{
			 return"Over Weight";
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
