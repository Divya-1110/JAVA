package com.nissan.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class BillingSystem {

	public static void main(String[] args) throws ParseException
	{
		//scanner object
		Scanner input=new Scanner(System.in);
		
		//user input-country,amount,joindate
		System.out.print("Enter Country Name:(usa/india/japan/france): ");
		String country=input.nextLine();
		
	        System.out.print("Enter amount:");
		double amount = Double.parseDouble( input.nextLine() );
		
                System.out.print("Enter join date");
		String joinDate=input.nextLine();
		
		//converting in date format
		Date utilDate=new SimpleDateFormat("dd/MM/yyyy").parse(joinDate);
		      
		//display datails
		System.out.println("Country Name: "+country);
		System.out.println("Country Language :"+getLang(country));
		System.out.println("The CustomerId is:"+customerId());
		System.out.println("Amount Outstanding: "+amount);
		System.out.println(utilDate);
		
	
	}  
	
	//get Language based on country
       public static String getLang(String country)
      {
	   String lang="";
	   switch(country)
	   {
	   case "usa":
		         lang="english";
	        break;
	   case "france": 
		          lang="french";
	        break;
	   case "japan":
		      lang="japanese";
	       break;
	   case "india":
		      lang="Hindi";
	        break;
	   default : 
		   return "English(default)";		 
	   }
	   
	  return lang;
   }
   
    //automatic Random customerId
   private static int customerId()
    {
		Random random=new Random();
		int custid=100000+random.nextInt(900000);
		return custid;
    }
  	
   
  }
