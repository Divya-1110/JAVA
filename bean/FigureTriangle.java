package com.nissan.bean;

public class FigureTriangle extends Figure {
	
	//default constructor
	public FigureTriangle() {
		
	}
	
	//parameterized constructor
	public FigureTriangle(double dim1,double dim2)
	{
		super(dim1,dim2);
	
	}
	
	//calculate area
   public double area() {
		
		return dim1*dim2/2;	
	}
	

}
