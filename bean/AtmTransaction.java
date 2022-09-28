package com.nissan.bean;

import java.util.Scanner;

public class AtmTransaction
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
        int choice;
		double minimumBalance=5000;
		double totalamount =0;
		do {
		//choice	
			System.out.println("Enter your choice");
			choice=input.nextInt();	
			
	  //for calling deposit,withdraw
		switch(choice) 
		{
		   case 1: System.out.print("Enter the amount to deposit: ");
	               double amount=input.nextDouble();
		           deposit(amount,minimumBalance,totalamount);
			       break;
		   case 2: System.out.print("Enter the amount to withdraw: ");
	               double amount1=input.nextDouble();
		           withdraw(amount1,minimumBalance,totalamount);
		           break;
		   case 3:  System.out.println(totalamount);
		           break;
		   case 4: exit(0);
			       break;
		   default: System.out.println("Invalid choice");
		}
		}while(choice<4);
	
	}
	
	//exit 
	private static void exit(int i) {
		System.out.print("exit");
	}

	//deposit
	public static void deposit(double amount,double minimumBalance,double totalamount) 
	{   
	     totalamount = amount+totalamount+minimumBalance;
	     System.out.println(totalamount);
	}
	
	//withdraw
	public static void withdraw(double amount,double minimumBalance,double totalamount) 
	{
		 if(totalamount>minimumBalance) 
		 {
	     double remainingbalance =totalamount-amount;	
	     System.out.println(remainingbalance);
		 }
		 else {
			 System.out.println("InSufficient Funds..!!!");
		 }
	}

}
