package com.nissan.bean;

/*
 Write a program that creates two classes – one is Employee and another is main method class.
Employee class contain emp_code, name, designation and salary fields and three constructors
– default constructor, second constructor contains three fields emp_code, name and
designation and if the designation is clerk set salary of Rs.5000, Rs.2000 for peon , Rs.10000
for manager and Rs.1000 for others. Third constructor contains four fields emp_code, name,
salary and designation. Display information of employee using display method.
 */

public class Employeee
{
	//instance variable
	 private int _empCode;
	 private String _empName;
	 private String _designation;
	 private double _salary;
	 
	//default constructor
     public Employeee()
     {
    	 
     }
	
	
	//parma const1
	public Employeee(int eCode,String eName,String designation,double salary)
	{
		this._empCode=eCode;
		this._empName=eName;
		this._designation=designation;
		this._salary=salary;
	}
	
	//param const2
	public Employeee(int _empCode, String _empName, String _designation)
	{
		super();
		this._empCode = _empCode;
		this._empName = _empName;
		this._designation = _designation;
		
		//check condition
		if(_designation.equalsIgnoreCase("clerk")) {
			this._salary=5000;}
		else if(_designation.equalsIgnoreCase("Peon")) {
				this._salary=2000;}
		else if(_designation.equalsIgnoreCase("Manager")) {
			this._salary=10000;}
		else {
			this._salary=2000;}
		
	}
	//custom method
	public void displayDetails()
	{
//		System.out.println("Employee Id: "+this._empCode);
//		System.out.println("Employee Name: "+this._empName);
//		System.out.println("Employee designation: "+this._designation);
//		System.out.println("Employee salary: "+this._salary);
		
		System.out.println(String.format("%-20s%-20s%-20s%-20s",
		        this._empCode,
		        this._empName,
		        this._designation,
		        this._salary));
	}

	
   //override tostring()
	@Override
	public String toString() {
		return "Employeee [_empCode=" + _empCode + ", _empName=" + _empName + ", _designation=" + _designation
				+ ", _salary=" + _salary + "]";
	}
	
	
	

	
}
		
	
	
