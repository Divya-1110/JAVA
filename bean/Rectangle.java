package com.nissan.bean;

public class Rectangle extends Shape{
	
	private double length,breadth;
	
	//dc
	public Rectangle()
	{
		
	}
	
    //pc
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	//custom method
	public double area() {
		return this.length*this.breadth;
	}

	//override
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	
   
	
}
