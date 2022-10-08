package com.nissan.service;

import java.util.Optional;
import java.util.Scanner;

import com.nissan.model.Professor;
import com.nissan.repo.CrudRepositoryImpl;

public class ProfessorServiceImpl {
//constructor injection
	
	
	
	CrudRepositoryImpl crud=new CrudRepositoryImpl();
	
	Scanner s=new Scanner(System.in);
	char choice='y';

	//dc 
	public ProfessorServiceImpl() {
		
	}
	
	//menu driven
	public void menuDriven() {
		do{
			System.out.println("1.Add Professor \n2.Search Professor \n3.Edit Professor\n4.Delete professor\n5.Find All Professor\n6.Search by name\nEnter the Option:");
			int option=s.nextInt();
			
			switch(option) {
			case 1: crud.insertEntity();
			    break;
			case 2: crud.findEntity();
		    break;
			case 3: crud.updateEntity();
		    break;
			case 4: crud.deleteEntity();
		    break;
			case 5: crud.listofProfessor();
		    break;
			case 6: crud.findByName("ganga");
		    break;
           default:System.out.println("Invalid");
		
			}
			
			}while(choice=='y'||choice=='Y');
	}
	
	
}
