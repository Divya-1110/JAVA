package com.nissan.bean;

import java.util.Scanner;

public class PoundToKilo {

	//concert pound to kilogram
	public static void main(String[] args) {
		// get input from user
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a num in pounds: ");
		double pounds=input.nextDouble();
		//convert
		double kilo=poundsToKilogram(pounds);
		System.out.println("Pound In Kilogram:"+kilo);
		
	}
private static double poundsToKilogram(double pounds) {
	return pounds*0.456; //airthmetic operator
}
}
