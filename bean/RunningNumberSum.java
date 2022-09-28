package com.nissan.bean;

public class RunningNumberSum {

	public static void main(String[] args) {
		//declare the variables
		int lowerBound=1;
		int upperBound=1000;
		int  number=lowerBound;
		int  sum=0;
		
		//find sum and average
		while(number<=upperBound) {
			
			//Accumulate number into sum
			sum+=number;
			
			//increment number
			number++;
			
		}
		//print the result
		System.out.println("The Sum from "+lowerBound +" to "+ upperBound+" is :"+sum);
	

	}

}
