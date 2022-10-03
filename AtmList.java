package com.nissan.lib;

import java.util.ArrayList;

import java.util.Scanner;

import com.nissan.bean.Atm;





public class AtmList {
	
  //store all records
		static ArrayList<Atm> arrAtmLists =new ArrayList<Atm>();

		//instance variable
		static double amount; 

		//Menu Driven
		public static void menu()
		{
			
			System.out.println("-------------ATM--------------");
			System.out.println("1.AddCustomer\n2.Update Customer\n3.Deleting a customer\n4.Deposit\n5.Withdraw\n6.ShowBalance\n7.List of all customer\n8.seach a customer\n9.TransferMoney");
			
			//input from user
			Scanner s= new Scanner(System.in);
			
			switch(s.next().charAt(0))
			{
			case '1': 
				addCustomer();
				break;
			case '2':
				updateCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				deposit();
				break;
			case '5':
				withdraw();
				break;
			case '6':
				ShowBalance();
				break;
			case '7':
				listAllCustomer();
				break;
			case '8':
				searchCustomer();
				break;
			case '9':
				transfer();
				break;
				
			default: System.out.println("input format is not standardized");
			}
		}
		
		//searching customer details
		private static void searchCustomer() {
			System.out.println("Serach a customer");
			char choiceYN='y';
			int searchId;
			//search by Account number
			do {
		
				//search scanner
	         Scanner scSearch=new Scanner(System.in);
	         
	         //account number want to be search
	         System.out.println("Enter Accounct number to search");
	         searchId=Integer.parseInt(scSearch.nextLine());
	         
	         try
	         {
	        	 for(Atm atm: arrAtmLists)
	        	 {
	        		 
	        	 if(atm.getAccountNum()==searchId)
	        	 {
	     			System.out.println(atm.toString());
	        	 }
	        	 else
	        	 {
	        		 System.out.println("Account number not found..!!!");
	        	 }
	        	
	        	 System.out.println("Do you want to continue (y/n):");
					choiceYN=scSearch.next().charAt(0);
	        	 }		
	         }
	         catch(Exception e) 
	         {
	        	 System.out.println();
	         }
		}while(choiceYN=='y'||choiceYN=='Y');
	}

    //list of  all the available customers
		private static void listAllCustomer()
		{
	        System.out.println("listing all availble customer");
	    	for(Atm atm: arrAtmLists) {
				System.out.println(atm.toString());
			}
			menu();
				
		}
  
		//show balance
		private static void ShowBalance() {
			Atm atm=new Atm();
			System.out.println("Current balance is:"+amount);
			
		}

		//withdraw
		private static void withdraw() {
			System.out.println("Withdraw money");
		}

		//deposit
		private static void deposit() {
			
			Atm atm=new Atm();
			//Scanner class
			Scanner scDeposit=new Scanner(System.in);
			
			System.out.println("deposit the money");
			System.out.println("Enter the amount to be deposit:");
		    amount=scDeposit.nextDouble();
			if(amount>50000) {
				System.out.println("Enter pan number");
				String pan=scDeposit.next();
				if(pan.equals(pan)) {
					amount=amount+atm.getBalance();
					System.out.println("amount is deposited"+amount);
				}
				else {
					System.out.println("invali pan number");
				}		
			}
			else {
				amount=amount+atm.getBalance();
				System.out.println("amount is deposited"+amount);
			     }
		}
        

		private static void transfer() {
			System.out.println("money transfered");
			
		}


		//delete customer
		private static void deleteCustomer() {
			System.out.println("delete the customer");
			
			char choicedelete='y';
			long deleteAccountNo;
			do {
		      Scanner scDelete=new Scanner(System.in);
		         
		       //user input-account no for comparing
		         System.out.println("Enter Account number to delete");
		        deleteAccountNo=scDelete.nextLong();
		        try {
		        for(Atm atm: arrAtmLists)
	        	 {
	        		//check condition 
	        	 if(atm.getAccountNum()==deleteAccountNo)
	        	 { 
	        		 arrAtmLists.remove(atm);
	        		 System.out.println("Deleted successfully");
	             }
	        	}
		        }
		        catch(Exception e) {
		        	System.out.println();
		        }
		        System.out.println("Do you want to continue (y/n):");
				choicedelete=scDelete.next().charAt(0);
	
			}while(choicedelete=='y'||choicedelete=='Y');
		}
		
		//update customer
		private static void updateCustomer() {
			System.out.println("update the customer");
			
			
			char choiceupdate='y';//for continuing the loop
			long updateAccountNo; //for searching
			
			do {
		         Scanner scUpdate=new Scanner(System.in);
		         
		       //user input-account no for comparing
		         System.out.println("Enter Account number to update");
		         updateAccountNo=scUpdate.nextLong();
		         
		         //menu for update
		         System.out.println("1.Mobile Number/n2.EmailID");
		         
		         //choice update value
		        System.out.println("Enter the choice which one you want to update");
		        int choice=scUpdate.nextInt();
		        
		        if(choice==1) 
		        {    
		        	//user input -value to be updated 
		        	System.out.println("Enter the Mobile number want to be update:");
		        	long mobileno=scUpdate.nextLong();
		        	
		        	for(Atm atm: arrAtmLists)
		        	 {
		        		//check condition 
		        	 if(atm.getAccountNum()==updateAccountNo)
		        	 { 
		        		 atm.setMobileno(mobileno);
		     			System.out.println(atm.toString());
		        	 }
		            }
		        }
		        else 
		        {
		        	//user input -value to be updated 
		        	 System.out.println("Enter the Email Id want to be update");
		             String email=scUpdate.nextLine();
		              for(Atm atm: arrAtmLists)
	        	        { 
		            	  //check condition
	        	           if(atm.getAccountNum()==updateAccountNo)
	        	             { 
	        		               atm.setEmailId(email);
	     			               System.out.println(atm.toString());
	        	             }
	                    }   
		         }
		        
		        System.out.println("Do you want to continue (y/n):");
				choiceupdate=scUpdate.next().charAt(0);
		         
			}while(choiceupdate=='y'||choiceupdate=='Y');
				
		}

		private static void addCustomer() {
             System.out.println("adding a customer");
      
     		char choice='n';
     	try {
     		do {
     			//creating object
     			Atm atm=new Atm();
     			
     			//get input
     			Scanner obj =new Scanner(System.in);
     			
     			//auto generate Account Number
     			atm.setAccountNum(Atm.generateAccountNumber());
     			
     			System.out.println("Enter Customer name:");
     			atm.setCustomerName(obj.next());
     			
     			System.out.println("Enter type of account(saving/fixed)");
     			atm.setTypeOfAccount(obj.next());
     			
     			System.out.println("Enter Customer mobile number");
     			atm.setMobileno(obj.nextLong());
     			
     			System.out.println("Enter customer Emailid");
     			atm.setEmailId(obj.next());
     			
     			System.out.println("Enter pan number");
     			atm.setPan(obj.next());
     			
     			//add to global arrayList
     			arrAtmLists.add(atm);
     			
     			System.out.println("Do you want to continue(y/n):");
				choice=obj.next().charAt(0);
		
     		}while(choice=='y'||choice=='Y');
     	
     	}
     	catch(Exception e) {
			System.out.println("sorry something wrong1");
		}
		
		//go to menu
		menu();

		}
}

     		
		




