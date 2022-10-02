package com.nissan.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Formatter;

public class InheritenceAssign2Hospital {
	
	public static void main(String [] args) throws ParseException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		//user input
		InhertienceAssign2Patient patient=new InhertienceAssign2Patient(101);
		
		System.out.println("Enter name:");
		patient.setName("May");
		
		System.out.println("Enter age:");
		patient.setAge(23);
		
		System.out.println("Enter name of the hospital:");
		patient.setHospital("TCS");
		
		System.out.println("Enter YERA OF JOININg:");
		patient.setYearOfAdmission(formatter.parse("13/09/2000"));
		
		System.out.println("Enter Address:");
		patient.setAddress("May uriyiwerpo ieoioru");
		
		//Object oriented
		InheritenceAssign2Money money =new InheritenceAssign2Money(1200,50);
		patient.calculateMedicalFee(money);
		
		//output
		System.out.println(patient.toString());
		
	}

}
