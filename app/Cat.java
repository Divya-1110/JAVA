package com.nissan.app;

public class Cat extends Animal{
	
	
	
	@Override
	void cry() {
		System.out.println("Meow Meow");
		System.out.print("The cat is in "+getColor()+" color");

	}

	
	@Override
	void walk() {
         System.out.println("Cat is Walking with"+getNoOfLegs()+"legs");		
	}


	@Override
	void fly() {
        System.out.println("Cat cant fly");		

		}
	
	}
