package com.nissan.bean;

public class BankA extends MainBank{
	
	//instance variable
	private int principle;
	private int time;
	private double rate;
	
	//default constructor
	public BankA() {
		super();
	}

	 //Parameterized constructor
	public BankA(int principle, int time,double rate) {
		super();
		this.principle = principle;
		this.time = time;
		this.rate = rate;
	}
		//custom methods
	public double simpleIntrest() 
	{
		return this.principle*this.time*this.rate / 100;
		
    }
	

}
