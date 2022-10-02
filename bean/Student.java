package com.nissan.bean;

public class Student {
	
	//instance variables
	private String studentName;
	private int studentId;
	private double grade;
	private int age;
	private String address;
	
	//default constructor
	public Student() {
		
	}
	
	//Parameterized constructor
	public Student(String studentName, int studentId, int age, String address) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.age = age;
		this.address = address;
	}

	 //getters and setters
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	//custom method
	  boolean isPassed() {
		   return true;
		
		}
	  void displaystudentDetails() {
		System.out.println("Student Name:"+this.studentName);
		System.out.println("Student Id:"+this.studentId);
		System.out.println("Student age:"+this.age);
		System.out.println("Student Address:"+this.address);
	  }
	
	//override
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", grade=" + grade + ", age=" + age
				+ ", address=" + address + "]";
	}
	
}
