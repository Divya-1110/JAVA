package com.nissan.model;

import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblCustomer")
public class Customer {
   
	@Id
	private String accountNo;
	
    private String customerName;
	private String accountType;
	private int balance;
	private int minBalance;
	private long mobileNo;
	private String emailId;
    private int aTMPin;
    private boolean isActive;
    
    //default Constructor
    public Customer() {
    	
    }

    //parameterized constructor
	public Customer(String accountNo, String customerName, String accountType, int balance, int minBalance, long mobileNo,
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
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
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
	
	// Generate Account number
    public static String generateAccountNo() {
        Random random = new Random();
        int number = random.nextInt(999999999);
        return String.format("%06d", number);

    }

   // Generate ATM Pin
    public static int generateAtmPin() {
        Random random = new Random();
        int number = random.nextInt(9999);
        return number;
    }
	
	//override to string
	@Override
	public String toString() {
		return "Customer [accountNo=" + accountNo + ", customerName=" + customerName + ", accountType=" + accountType
				+ ", balance=" + balance + ", minBalance=" + minBalance + ", mobileNo=" + mobileNo + ", emailId="
				+ emailId + ", aTMPin=" + aTMPin + ", isActive=" + isActive + "]";
	}

	
	
	
    
}
