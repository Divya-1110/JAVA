package com.nissan.app;

import java.util.Scanner;

import com.nissan.lib.AtmList;



public class AtmApp {

	public static void main(String[] args) {
		
		
		mainMenu();
	}
	
	
		public static void mainMenu()
		{
		
		System.out.println("--Welcome to Atm--");
		System.out.println("1.Use Atm\n2.Exit");
		
		//input
		Scanner s =new Scanner(System.in);
		System.out.println("Enter your choice:");
		int choice=s.nextInt();
		
		switch(choice) {
		case 1 :
			AtmList.menu();
			break;
		case 2: System.out.println("Thanks for using ATM App");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid input");
		}
		
      }	


	

}
