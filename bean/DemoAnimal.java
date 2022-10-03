package com.nissan.bean;

import java.util.Scanner;

public class DemoAnimal {

	public static void main(String[] args) {
		
		//Scanner class
		Scanner input =new Scanner(System.in);
		
		//user input
		System.out.println("Enter Animal body Temperature:");
		int temperature=input.nextInt();

		MyAnimals myanimals=new MyAnimals(temperature);
	        myanimals.GetBodyTemp();
	}

}
