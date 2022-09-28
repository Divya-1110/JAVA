package com.nissan.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DemoDate {

	public static void main(String[] args) throws ParseException {
		//declare scanner 
		Scanner input=new Scanner(System.in);
		//Emp-name,id,salary,Depid,joindate
		System.out.print("Enter thre name:");
		String empName=input.nextLine();
		
		System.out.print("Enter DeptId:");
		int empId=Integer.parseInt(input.nextLine());
		
		System.out.print("Enter salary");
		double empSalary=Double.parseDouble(input.nextLine());
		
		System.out.print("Enter join date");
		
		Date dateJoinDate=null;     //Hungarian notation
		String joinDate=input.nextLine();
		
		dateJoinDate=dateConversion(joinDate);
		System.out.println(dateConversion(joinDate));
		
		//display info
		System.out.println(empName);
        System.out.println(empId);
        System.out.println(empSalary);
        String joinDateToString=new SimpleDateFormat("dd/mm/yyyy").format(dateJoinDate);
        System.out.println(joinDateToString);

	}
	private static Date dateConversion(String joinDate) throws ParseException {
		//string to date
		Date utilDate=new SimpleDateFormat("dd/mm/yyyy").parse(joinDate);
			//covert to ssql date
		java.sql.Date SqlDate =new java.sql.Date(utilDate.getTime());
		return  utilDate;
	}
	

}
