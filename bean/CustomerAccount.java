package com.nissan.bean;

public class CustomerAccount {
	
	//instance variables
	private int _accountNum;
	private int _age;
	private String _name;
	private String _place;
	private String _accountType;
	
	//default constructor
	public CustomerAccount() {
		super();
	}
   
	//parameterized constructor
	public CustomerAccount(int _accountNum, int _age, String _name, String _place, String _accountType) {
		super();
		this._accountNum = _accountNum;
		this._age = _age;
		this._name = _name;
		this._place = _place;
		this._accountType = _accountType;
	}
	
	//custom method
	public void display()
	{
		System.out.println(String.format("%-20s%-20s%-20s%-20s%-20s",
		        this._accountNum,
		        this._age,
		        this._name,
		        this._place,
		        this._accountType));
	}
    
	//override toSrting
	@Override
	public String toString() {
		return "CustomerAccount [_accountNum=" + _accountNum + ", _age=" + _age + ", _name=" + _name + ", _place="
				+ _place + ", _accountType=" + _accountType + "]";
	}
	
	}

