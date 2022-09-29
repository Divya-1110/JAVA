package com.nissan.bean;
/*
Create a Box class with three instance variables as width, height, depth. Create a method
inside this class which returns the volume. Create two different objects in other class assign
values for instance variable and calculate the volume and print it.
*/

public class Box {
	
	//instance variable
	private int width;
	private int height;
	private int depth;
	private int volume;
	
	//default constructor
	public Box() {
		
	}
	//Parameterized constructor
	public Box(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	//custom method
	public int volume() {
		volume=this.width*this.height*this.depth;
		return volume;
	}
	
	

}
