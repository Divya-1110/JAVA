package com.nissan.bean;

//constructor -assignment -3problem
import java.util.Scanner;

public class DemoEmployeee 
{
	public static void main(String [] args)
	{
	  //declare variables
		Scanner input = new Scanner(System.in);
		
	  Employeee[] employees=new Employeee[5];
	  
	  //menu
	  char choice='n';
	  int i=0;
	  do {
		  System.out.println("Enter employee id");
		  int empCode=Integer.parseInt(input.nextLine());
		  
		  System.out.println("Enter employee name");
		  String empName=input.nextLine();
		  
		  System.out.println("Enter employee designation");
		  String designation=input.nextLine();
		  
		  System.out.println("Enter employee salary");
		  String salary=input.nextLine();
		  
 //condition if sal is empty,it should accept sal based on sedign
		  if(salary.equals("")) {
			  employees[i]= new Employeee(empCode,empName,designation);
		  }
		  else {
			  employees[i]= new Employeee(empCode,empName,designation,Double.parseDouble(salary));			  
		  }
		  
		  //increment counter
		  i++;
		  
		  //continue
		  System.out.println("Do you want to continue(y/n):");
		  choice=input.nextLine().charAt(0);
		  
	  }while(choice=='y'||choice=='Y');
		
	  //print the employee details
	  //print header
	  System.out.println(String.format("\n%-20s%-20s%-20s%-20s\n","Epmloyee Code","Name","Designation","Salary"));

	  
		for(int j=0;j<i;j++)
		{
			employees[j].displayDetails();
			System.out.println();
		}
		
		//close scanner
		input.close();
	}

}
