package com.nissan.bean;

public class BoxingAndUnBoxing {

	public static void main(String[] args) {
		
		//auto boxing
		Integer intRefNumber=new Integer(100);  //reference type
		int intPriNumber = intRefNumber;     //reference implicitly converted to primitive
		System.out.println("Ref to pri : "+intRefNumber);
		
		 //auto unboxing
		int intPriNumberTwo=200;
		Integer intRefNumberTwo=intPriNumberTwo; 
		System.out.println("pri to ref : "+intRefNumberTwo);
		
		//casting-(float to int)
		float fNumber=200.45f;
		int intNum=(int)fNumber;
		
		
		
		
	}

}
