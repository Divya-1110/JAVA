package com.nissan.bean;

public class InheritenceAssign2Money {
	//instance variables
	private double basicfee;
	private double tax;
	
	//dc
	public InheritenceAssign2Money() {
		super();
	}

	
	//pc
	public InheritenceAssign2Money(double basicfee, double tax) {
		super();
		this.basicfee = basicfee;
		this.tax = tax;
	}


		//set
	public double getBasicfee() {
		return basicfee;
	}


	public void setBasicfee(double basicfee) {
		this.basicfee = basicfee;
	}


	public double getTax() {
		return tax;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}
  
	

	
}
