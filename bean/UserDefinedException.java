package com.nissan.bean;

public class UserDefinedException {

	public static void main(String[] args) {
		
		//create an object
		Evaluation eval=new Evaluation(80,-1);
		
		try {
			eval.display();
		}
		catch(InValidValueException ive) {
			System.out.print("Invalid entry!");
		}
      catch(Exception e)
		{
			System.out.print("Message"+e);
		}
	}

}
