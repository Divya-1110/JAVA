package com.nissan.bean;

public class Undergrad extends Student{
	
	private double grade;
	
	//default constructor
	public Undergrad() {
		super();
	}
	
 
	public Undergrad(double grade) {
		super();
		this.grade = grade;
	}


	//custom method
	  boolean isPassed() {
		  if(grade>70) {
			  System.out.println("Result of undergraduate is Pass");
			   return true;}
		  else {  
			  System.out.println("Result of under graduate is Fail");  
			  return false;
		 }
	  }
  
	  void displaystudentDetails() {
		  System.out.println("Result of under graduate:"+isPassed());

		}

}
