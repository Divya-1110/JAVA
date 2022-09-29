package com.nissan.bean;
/*
 Write a program that defines two classes – one is Person and another is main method class.
Person class should have instance variables like name, age, salary of type string , int and float.
Use new operator to create a Person object and call constructor to initialize the instance
variables and display its value.

 */
public class Person {

	//instance variables
	private String personName;
	private int personAge;
	private float salary;
	
	//default constructor
	public Person() 
	{
		
	}

	//parameterized constructor
	public Person(String personName, int personAge, float salary)
	{
		super();
		this.personName = personName;
		this.personAge = personAge;
		this.salary = salary;
	}
	
	//custom method
	public void display()
	{
		System.out.println("Person Name: "+this.personName);
		System.out.println("Person Age: "+this.personAge);
		System.out.println("Salary: "+this.salary);
		
	}
	
	
}
