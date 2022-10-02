package com.nissan.bean;

public class AirthmeticOperations {
	
	     //addition int -input,float-op
		public float calculate(int num1,int num2)
		{
			float addition=0;
			addition=num1+num2;

			return addition;	
		}
		
       //addition float -in,int-op
		public int calculate(float num1,float num2) {
			int add;
			add = (int) (num1 + num2);
		 
		 return add;
		 
		}
}

