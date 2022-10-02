package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.Bank;

public class NewBankApp
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String typeAccount="";
		
		System.out.println("enter principal amount");
		int principle=Integer.parseInt(s.nextLine());
		
		System.out.println("Enter time");
		int time=Integer.parseInt(s.nextLine());
		
		System.out.println("type of account");
		System.out.println("1.Savings\n2.Fixed");
		int typeInt=Integer.parseInt(s.nextLine());
		
		if(typeInt==1) {
			typeAccount="Savings";
		}
		else {
			typeAccount="Fixed";

		}
		//create an object
		Bank bank =new Bank();
		bank.set_prinicipal(principle);
		bank.set_time(time);
		bank.set_typeOfAccount(typeAccount);
		bank.set_typeOfAccount(typeAccount);
		//System.out.print(bank.toString());
		System.out.print(bank.calculateIntrest());

	}

}
