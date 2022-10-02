package com.nissan.bean;

import java.util.Date;
import java.text.SimpleDateFormat;

public class InhertienceAssign2Patient extends InhertienceAssignProblem2 {
	
	//instance variable
	private int patientNo;
	private String hospital;
	private Date yearOfAdmission;
	private String address;
	private double fee;
	
   //default constructor
	public InhertienceAssign2Patient()
	{
		super();
	}
	
	//parameterized
	public InhertienceAssign2Patient(int patientNo) {
		super();
		this.patientNo = patientNo;
			}
	
	//getter and setter

	public int getPatientNo() {
		return patientNo;
	}

	public void setPatientNo(int patientNo) {
		this.patientNo = patientNo;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public Date getYearOfAdmission() {
		return yearOfAdmission;
	}

	public void setYearOfAdmission(Date yearOfAdmission) {
		this.yearOfAdmission = yearOfAdmission;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	
   //override toString()
	@Override
	public String toString() {
		
		//format the date
		SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		
		return "InhertienceAssign2Patient [patientNo=" + patientNo + ", hospital=" + hospital + ", yearOfAdmission="
				+ formatter.format(yearOfAdmission) + ", address=" + address + ", fee=" + fee + "]"+super.toString();
	}
	
	//calcuta medical fee--injection
	public void calculateMedicalFee(InheritenceAssign2Money money) {
		this.fee=money.getBasicfee() +money.getTax();
	}
	
	
}
