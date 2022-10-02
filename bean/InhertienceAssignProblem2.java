package com.nissan.bean;

import java.util.Scanner;

public class InhertienceAssignProblem2 {
	//instance variables
	private String name;
	private int age;
	
	//default constructor
	public InhertienceAssignProblem2() 
	{
		super();
	}
	
	//parameterized constructor
	public InhertienceAssignProblem2(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//custom methods
	public void readData()
	{
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter name:");
		this.name=input.nextLine();
		
		System.out.println("Enter age:");
		this.age=input.nextInt();	
	}
	
	public void displayData()
	{
		System.out.println("name:"+this.name);
		System.out.println("age:"+this.age);
	}
	
	//override
	@Override
	public String toString() {
		return "InhertienceAssignProblem2 [name=" + name + ", age=" + age + "]";
	}
	


}
