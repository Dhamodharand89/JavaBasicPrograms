package com.au.firstmaven;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		int count =0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
			count++;
			}
		
		}
		if(count==2)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}

	}

}
