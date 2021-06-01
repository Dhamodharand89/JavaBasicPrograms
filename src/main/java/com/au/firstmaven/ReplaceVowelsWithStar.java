package com.au.firstmaven;

import java.util.Scanner;


public class ReplaceVowelsWithStar {

	public static void usginLoop()
	{
		System.out.println("Enter the name:");
		Scanner s= new Scanner(System.in);
		String name=s.nextLine();
		
		char[] splitName=name.toCharArray();
		
		for(int i=0;i<splitName.length;i++)
		{
			if(splitName[i]=='A' || splitName[i]=='E' || splitName[i]=='I' || splitName[i]=='O' ||splitName[i]=='U')
			{
				splitName[i]='*';
			}
			
		}
		for (char c : splitName) {
			System.out.print(c);
		}
	}
	
	public static void usingRegularExp()
	{
		String name="Dhamodharan";
		name= name.replaceAll("[AEIOUaeiou]", "*");
		System.out.println(name);
	}
	
	public static void switchCase()
	{
		String name="Dhamodharan";
		char[] splitName=name.toCharArray();
		int length=splitName.length;
		
		for(int i=0; i<length; i++)
		{
			//switch (i)
			//case "A":
			//case "A":
				
		}
	}
	public static void main(String[] args) {
		//usginLoop();
		//usingRegularExp();
		switchCase();
		
	}

}
