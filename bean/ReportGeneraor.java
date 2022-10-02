package com.nissan.bean;

import java.util.Scanner;

public class ReportGeneraor {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Item Id: ");
		int itemid=s.nextInt();
		
		System.out.println("Enter Item Name: ");
		String itemName=s.next();
		
		System.out.println("Enter Item price: ");
		float itemPrice=s.nextFloat();
		
		Item item1=new Item(itemid,itemName,itemPrice);
		item1.display();
	
	}

}
