package com.nissan.bean;

import java.util.Scanner;

public class DemoCustomerAccount
{

	public static void main(String[] args)
	{
		//scanner class
		Scanner input=new Scanner(System.in);
		
		CustomerAccount[] custAccount =new CustomerAccount[5];
		int i=0;
		
		do {
			  System.out.println("Enter customer Account number");
			  int accountNum=Integer.parseInt(input.nextLine());
			  
			  System.out.println("Enter customer Age");
			  int age=Integer.parseInt(input.nextLine());
			  
			  System.out.println("Enter customer name");
			  String name=input.nextLine();
			  
			  System.out.println("Enter customer place");
			  String place=input.nextLine();
			  
			  System.out.println("Enter customer account type");
			  String typeOfAccount=input.nextLine();
			  
			  custAccount[i]= new CustomerAccount(accountNum,age,name,place,typeOfAccount);
			  
			  i++;
		}while(i<5);

System.out.println(String.format("\n%-20s%-20s%-20s%-20s%-20s\n","Account Number","Age","Name","Place","TypeOfAccount"));

		  
			for(int j=0;j<i;j++)
			{
				custAccount[j].display();
				System.out.println();
			}
			
			System.out.println("Enter customer Account number want to be search");
			 int searchaccountNum=input.nextInt();
			 
			

			//close scanner
			input.close();

		
	}

}
