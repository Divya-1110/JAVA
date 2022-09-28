package com.nissan.bean;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//user input-array size
		System.out.println("Enter size of array:");
		int size =input.nextInt();
		int arr[]=new int[size];
		
		//user input--array values
		for(int i=0;i<size;i++) {
			arr[i]=input.nextInt();
		  }
		
		//display the array values
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		  }
		

	}

}
