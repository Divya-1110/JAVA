package com.nissan.app;

import java.util.Scanner;

public abstract class Animal {
	int noOfLegs;
	String color;
	
	Scanner s =new Scanner(System.in);
	
	abstract void cry();
	abstract void fly();
	abstract void walk();
	
	public int getNoOfLegs() {

		System.out.println("Enter no of legs:");
		int noOfLegs=s.nextInt();
		
		return noOfLegs;
		
	}
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	public String getColor() {
		System.out.println("Enter color of animal:");
		color=s.next();
		
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	 
	
}
