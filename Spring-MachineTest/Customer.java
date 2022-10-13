package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblCustomer")
public class Customer {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long accountNo;
    private String customerName;
	private String accountType;
	private int balance;
	private int minBalance;
	private long mobileNo;
	private String emailId;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int aTMPin;
	
    private boolean isActive;
    
    //default Constructor
    public Customer() {
    	
    }

    //parameterized constructor
	public Customer(long accountNo, String customerName, String accountType, int balance, int minBalance, long mobileNo,
			String emailId, int aTMPin,boolean isActive) {
		super();
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.accountType = accountType;
		this.balance = balance;
		this.minBalance = minBalance;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.aTMPin = aTMPin;
		this.isActive=isActive;
		
	}

	//getters and setters
	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
	public int getaTMPin() {
		return aTMPin;
	}

	public void setaTMPin(int aTMPin) {
		this.aTMPin = aTMPin;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	//override to string
	@Override
	public String toString() {
		return "Customer [accountNo=" + accountNo + ", customerName=" + customerName + ", accountType=" + accountType
				+ ", balance=" + balance + ", minBalance=" + minBalance + ", mobileNo=" + mobileNo + ", emailId="
				+ emailId + ", aTMPin=" + aTMPin + ", isActive=" + isActive + "]";
	}

	
	
	
    
}
