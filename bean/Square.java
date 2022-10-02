package com.nissan.bean;

public class Square extends Shape{
	
	private double side;
	
	
	//default constructor
	public Square() {
		super();
	}
	
	//pc
	public Square(double side) {
		super();
		this.side = side;
	}

	//custom method
		public double area() {
			return this.side*this.side;
		}

	//override
		@Override
		public String toString() {
			return "Square [side=" + side + "]"+this.area();
		}
	
 
}
