package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")

public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	
	private String empName;
	private String designation;
	private LocalDate doj;
	//private int deptId;
	private int salary;
	private long phone;
	
	@JoinColumn(name="deptId")   //Employee.deptId=Department.deptId
	@ManyToOne
	private Department dept;
	
	//default constructor
	public Employee()
	{
		super();
	}

	//Parameterized constructor
	public Employee(int empId, String empName, String designation, LocalDate doj, int salary,long phone,
			Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.doj = doj;
		//this.deptId = deptId;
		this.salary = salary;
		this.phone=phone;
		this.dept = dept;
		
	}

	//getters and setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

//	public int getDeptId() {
//		return deptId;
//	}
//
//	public void setDeptId(int deptId) {
//		this.deptId = deptId;
//	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	//override
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", doj=" + doj
				 + ", salary=" + salary + ", phone=" + phone + ", dept=" + dept + "]";
	}

	
	
}
