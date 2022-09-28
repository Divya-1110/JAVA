package com.nissan.bean;

import java.util.Scanner;

public class SolutionAreaCircle {
	
    // entry point
	public static void main(String[] args) {
		// Test my first program
            System.out.println("Welcome!");
            //declare the variables
            double radius;
            Scanner input =new Scanner(System.in);
            System.out.print("Enter radius: ");
            radius=input.nextDouble();
            System.out.println("The radius is : "+areaCircle(radius));// calling method
            System.out.println(String.format("The radius is: %.2f ",Circumference(radius)));        
	}
	
	//calculation method--area
	private static double areaCircle(double radius){
		return radius*radius*Math.PI;
	}
	
	//circumference
	private static double Circumference(double radius){
		return 2*Math.PI*radius;
	}
	
  }
