package com.nissan.bean;

public class FigureRectangle extends Figure {
	
	
	//default constructor
	public FigureRectangle() {
		
	}
	
	//parameterized constructor
	FigureRectangle(double dim1,double dim2){
		super(dim1,dim2);
	}
	

	//calculate area
	public double area() {
		
		return dim1*dim2;
		
	}
	

}
