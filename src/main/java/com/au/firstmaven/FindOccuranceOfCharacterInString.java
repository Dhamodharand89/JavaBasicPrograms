package com.au.firstmaven;

import java.util.Scanner;

public class FindOccuranceOfCharacterInString {

	public static void main(String[] args) {
		
		String name="dhamodharan";
		name=name.toLowerCase();
		int count=0;
		System.out.println("Enter character:");
		Scanner s=new Scanner(System.in);
		
		char a=s.next().charAt(0);
		
		char findChar[]=name.toCharArray();
		
		for(int i=0;i<findChar.length;i++)
		{
			if(findChar[i]==a)
			{
				count++;
			}
		}
		
		System.out.println("Count is:"+count);

	}

}
