package com.nissan.bean;

import java.util.Scanner;

public class PoundToKilo
{

	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		
		// get input from user
		System.out.println("Enter a num in pounds: ");
		double pounds=input.nextDouble();
		
		//display result
		double kilo=poundsToKilogram(pounds);
		System.out.println("Pound In Kilogram:"+kilo);
		
	}

   //convert pound to kilogram	
   private static double poundsToKilogram(double pounds)
   {
	return pounds*0.456; //airthmetic operator
    }
}
