package com.nissan.bean;

import java.math.BigInteger;
import java.util.Random;

public class Atm {
	//Instance variables
    long accountNum;
	String customerName;
	String typeOfAccount;
	int balance;
	double minimumBalance=1000;
	String emailId;
	int atmPin;
	long Mobileno;
	String pan;
	
	//default constructor
	public Atm() {
		
	}
	
	//parameterized constructor
	public Atm(int accountNum, String customerName, String typeOfAccount, int balance, double minimumBalance,long mobilenum,String emailId, int atmPin) {
		super();
		this.accountNum = accountNum;
		this.customerName = customerName;
		this.typeOfAccount = typeOfAccount;
		this.balance = balance;
		this.minimumBalance = minimumBalance;
	    this.Mobileno=mobilenum;
		this.emailId = emailId;
		this.atmPin = atmPin;
	}

  
	//getters and setters
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getTypeOfAccount() {
		return typeOfAccount;
	}

	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getAtmPin() {
		return atmPin;
	}

	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}
	  public long getMobileno() {
			return Mobileno;
		}
		public void setMobileno(long mobileno) {
			Mobileno = mobileno;
		}
 

		public String getPan() {
		return pan;
	     }

	    public void setPan(String pan) {
		   this.pan = pan;
	       }


	
	 //Generate AccountNumber
		public static  int generateAccountNumber() {
			Random rand =new Random();
			return rand.nextInt(999999999);
		}

	
		
		//override to string
		@Override
		public String toString() {
			return "Atm [accountNum=" + accountNum + ", customerName=" + customerName + ", typeOfAccount="
					+ typeOfAccount + ", balance=" + balance + ", minimumBalance=" + minimumBalance + ", emailId="
					+ emailId + ", atmPin=" + atmPin + ", Mobileno=" + Mobileno + "]";
		}
		
}
