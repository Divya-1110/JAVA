package com.nissan.bean;

import java.util.Random;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
        System.out.print("Name");
        String name=input.nextLine();
        System.out.print("Gender");
        char gender=input.next().charAt(0);
        System.out.print("DateofBirth");
        short dob=input.nextShort();
        System.out.print("MartialStatus");
        boolean martialStatus=input.nextBoolean();
        System.out.print("Weight");
        double weight=input.nextDouble();
        System.out.print("GPA");
        float GPA=input.nextFloat();
        
        input.close();
        
	}
	private static void display(String name,char gender,short dob,boolean martialStatus,double weight,float GPA) {
		System.out.println("-----------------");
		System.out.println("Employee Details");
		System.out.println("-----------------");
		System.out.println("EmployeeID:"+EmpId());
		System.out.println("Name:"+name);
		System.out.println("Gender:"+gender);
		System.out.println("Date of Birth:"+dob);
		System.out.println("MartialStatus:"+martialStatus);
		System.out.println("Weight:"+weight);
		System.out.println(String.format("GPA:"+GPA));
		
		
	}
	private static int EmpId() {
		Random random=new Random();
		int empid=100000+random.nextInt(900000);
		return empid;
	}

}
