package com.nissan.bean;

public class Evaluation { //virtual
	//properties/fields/data members/attributes
	
	//declare variables
     int evaluationId;
     int marksOne;
     int marksTwo;
     
     //default constructor
    public Evaluation()
    {
    	
    }
      
   //Parameterized-constructor
    public Evaluation(int mOne,int mTwo)
    {
    	this.marksOne=mOne;
    	this.marksTwo=mTwo;
    }
    
    //custom methods
    public void display() throws InValidValueException
    {
    	if(marksOne<0 || marksTwo<0) 
    	{
    		throw new InValidValueException();
    	}
    	else
    	{
    		System.out.println("MarkOne:"+marksOne);
    		System.out.println("MarkTwo:"+marksTwo);
    	    
    	}
    }
     
     
}
