package com.nissan.bean;

import java.util.Scanner;

public class ArrayOutOfBounds {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		
		Scanner input=new Scanner(System.in);
		
		//Declare variables
		int[] exceptionArray=new int[10];
		try 
		{
		     for(int i=0;i<11;i++) 
		    {
			exceptionArray[i]=input.nextInt();
		    }
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter only ten numbers");
		}

	}

}
