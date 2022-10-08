package com.nissan.service;

import java.util.Scanner;

import com.nissan.repo.CrudRepository;


public class LoginAppServiceImpl {
	
  CrudRepository crud=new CrudRepository();
	
	Scanner s=new Scanner(System.in);
	char choice='y';

	//default constructor
	public LoginAppServiceImpl() {
		
	}
	
	//menu driven
	public void menuDriven() {
		do{
			System.out.println("1.Add User \n2.Edit User\n3.Disable User\n4.List Of Users\n5.Search by name\nEnter the Option:");
			int option=s.nextInt();
			
			switch(option) {
			case 1: crud.insertEntity();
			    break;
			case 2: crud.updateEntity();
		    break;
			case 3: crud.deleteEntity();
		    break;
			case 4: crud.listEntity();
		    break;
			case 5: crud.findByName("ganga");
		    break;
           default:System.out.println("Invalid");
		
			}
			
			}while(choice=='y'||choice=='Y');
	}
	
	


}
