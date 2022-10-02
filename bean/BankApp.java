package com.nissan.bean;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) 
	{
		
		MainBank a=new BankA(2000,2,10);
		
		System.out.println("BankA simple intrest is:"+a.simpleIntrest());
	}

}
