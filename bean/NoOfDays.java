package com.nissan.bean;

import java.util.Scanner;

public class NoOfDays {

	public static void main(String[] args) {
		
		//declare variable
		char inputYesNo;
		Scanner input=new Scanner(System.in);
		
		//1-Menu Driven --DoWhile(y/n)
		do {
			System.out.print("Enter the month (1-12):");
			int month=input.nextInt();
			
			System.out.print("Enter the year:");
			int year=input.nextInt();
			
		    //get Days In Month
		     int daysInMonth=getDayInMonth(month,year);
			
		    //get month name
		     String monthname=getMonthName(month);
			
		    //print result
                     System.out.println(month)
			     
		}while(inputYesNo=='y' || inputYesNo=='Y');
			
	         //get month name
		Private static String getMonthName(int month)
		{
			String output="";
			if(month<1||month>12) 
			{
				output="Invalid Entry";
			}
			else 
			{
				switch(month) 
				{
				  case 1:
					  output="January";
					  break;
				  case 2:
					  output="February";
					  break;
				  case 3:
					  output="March";
					  break;
				  case 4:
					  output="April";
					  break;
				  case 5:
					  output="May";
					  break;
			          case 6:
				         output="June";
				          break;
			          case 7:
					  output="July";
					  break;
			          case 8:
					  output="August";
					  break;
			          case 9:
					  output="September";
					  break;
			          case 10:
					  output="October";
					  break;
			          case 11:
					  output="November";
					  break;
			           case 12:
					  output="December";
					  break;
				}
				return output;	
			}
					
		}
		
		private static int getDayInMonth(int month,int year)
		{
			int days=-1;
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
				days=31;
			}
			else if(month==4||month==6||month==9||month==11) {
				days=30;
			}
			else if(month==2) {
				//ternary operator
				days=isLeapYear(year)?29 : 28;
			}
			return days;
		}
		
		//leap year
		private static boolean isLeapYear(int year) {
			return (year%4==0 && year%100==0) || year%400==0;
		}
		
		
		
		
	}

}
