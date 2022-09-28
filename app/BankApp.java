package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.Customer;

public class BankApp
{

	public static void main(String[] args)
	{
		//declare variable
		Scanner input=new Scanner(System.in);
		
		//input from user
		String [] customerNames=new String[20];
		double [] openingBalances=new double[20];
		
		//choice
		char choice ='n';
		String enterCustomerName="";
		int counter=0;
		Customer cust=new Customer();
		 boolean isDuplicateCustomer = false;

		//menu
		do {
			System.out.println("Enter customer:");
			enterCustomerName =input.nextLine();
			
			isDuplicateCustomer=cust.checkCustomerExists(enterCustomerName,customerNames);
			
			
			if(isDuplicateCustomer) {
				System.out.println("Customer alreay exist");
				continue;
			}
			else {
				customerNames[counter]=enterCustomerName;
			}
			
			//other details
			System.out.println("Enter bank balance: ");
			openingBalances[counter] = Double.parseDouble( input.nextLine() );
			counter++;
			
			System.out.println("Do you want to enter more(y/n): ");
			choice=input.nextLine().charAt(0);
			
		}while(choice=='y'||choice=='Y');
		
		

	}
	/*private static boolean checkCustomerExists(String customerName,String [] customerNames)
	{
	  //check condition
		for (String customer:customerNames) 
		{
			if(customerName.equals(customer))
			{
				return true;
			}
		}
		return false;
	}
     */
	}
