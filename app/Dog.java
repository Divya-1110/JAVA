package com.nissan.app;

public class Dog extends Animal {
	
	
	

	@Override
	void cry() {
		System.out.println("Bow Bow");
		System.out.println("The Dog is in "+getColor()+" color");

	}

	@Override
	void walk() {
		System.out.println("Dog is walking with"+getNoOfLegs()+"legs");		
	}
	
	void color() {
		System.out.println("The Dog is in "+getColor()+" color");
	}

	@Override
	void fly() {
		System.out.println("Dog cant fly");
		
	}

}
