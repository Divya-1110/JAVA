package com.nissan.bean;

import java.util.Scanner;

public class DemoFigure {

	public static void main(String[] args) {
		
	//scanner class
	Scanner input =new Scanner(System.in);
		
    //user input
	System.out.println("Enter the length:");
	double lenght=input.nextDouble();
	
	System.out.println("Enter the breadth:");
	double breadth=input.nextDouble();
	
	//object creation
	FigureRectangle r=new FigureRectangle(lenght,breadth);
	System.out.println("Area of reactangle is:"+r.area());
	
	FigureTriangle t=new FigureTriangle(lenght,breadth);
	System.out.println("Area of reactangle is:"+t.area());
	
	
	}

}
