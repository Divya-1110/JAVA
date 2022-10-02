package com.nissan.bean;

public class Grad extends Student {
	
	//instance variables
	private double grade;
	
	//default constructor
	public Grad() {
		super();
	}
   
	//parameterized constructor
	public Grad(double grade) 
	{
		super();
		this.grade = grade;
	}
	
	//custom method
	  boolean isPassed() 
	  {
		  if(grade>80)
			  return true;
		  else
			  return false;
	  }
	  void displaystudentDetails() {
			System.out.println("Result of graduate:"+isPassed());
		}

		 

}
