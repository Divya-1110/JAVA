package com.nissan.bean;

import java.util.Scanner;

 public class ExceptionHandlingQ1
    {  
	   int age;
	   
	   public ExceptionHandlingQ1() {
		   
	   }
	  
	   //parameterized constructor
        public ExceptionHandlingQ1(int a)
        {
        	this.age=a;
        }
	 
      // method to check the age  
     public void validateAge() throws AgeException
     {    
        if(age<18 && age>60)
        {  
              throw new AgeException();    
        }  
        else 
        {   
              System.out.println("The age is: "+age);   
        }   
     }    

 } 

	   



