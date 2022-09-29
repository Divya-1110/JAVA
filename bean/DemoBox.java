package com.nissan.bean;
//constructor-assignment-problem-1

import java.util.Scanner;

public class DemoBox {

	public static void main(String[] args) {
		
		//declare variables
	Scanner input = new Scanner(System.in);
	
 //user input for box1
	System.out.print("Enter box1 width");
	int width=Integer.parseInt(input.nextLine());
	  
	System.out.print("Enter box1 height");
	int height=Integer.parseInt(input.nextLine());
	
	System.out.print("Enter box1 depth");
	int depth=Integer.parseInt(input.nextLine());
	
  //create object1
	 Box box1=new Box(width,height,depth);	
	
  //display object1 result
	    System.out.println("The volume of Box1 is: "+box1.volume());
	
   //user input for box2
		System.out.print("Enter box2 width");
		int width2=Integer.parseInt(input.nextLine());
		  
		System.out.print("Enter box2 height");
		int height2=Integer.parseInt(input.nextLine());
		
		System.out.print("Enter box2 depth");
		int depth2=Integer.parseInt(input.nextLine());
	
  //create object2
	Box box2=new Box(width2,height2,depth2);
	
 //display object2 result
	System.out.println("The volume of Box2 is: "+box2.volume());
	
	
				
	}

}
