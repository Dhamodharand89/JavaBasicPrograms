package com.au.firstmaven;

import java.util.Scanner;

public class FindANumberInArray {

	public static void findNumber()
	{
		int arrVal[]= {4,5,3,7,8};
		boolean found=false;
		System.out.println("Enter a number to find in array:");
		Scanner num=new Scanner(System.in);
		int a=num.nextInt();
		
		for(int i=0;i<arrVal.length;i++)
		{
			if(arrVal[i]==a)
			{
				found=true;
				break;
				
			}
			
		}
		if(found)
		{
			System.out.println("Number is present in array");
		}
		else 
		{
			System.out.println("Number Not present in array");
		}
		
	}
	public static void main(String[] args) {
		findNumber();

	}

}
