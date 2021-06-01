package com.au.firstmaven;

import java.util.Arrays;

public class FindingSmallestNumberinArray {

	public static void usingForLoop()
	{
		int arrayVal[]= {6,2,5,3,9,5};
		int smallestNum= Integer.MAX_VALUE;
		
		for(int i=0; i<arrayVal.length;i++)
		{
			if(arrayVal[i]<smallestNum)
			{
				smallestNum=arrayVal[i];
			}
		}
		System.out.println("Smallest number in array is:"+smallestNum);
	}
	
	public static void usginArrayMethod()
	{
		int arrVal[]= {4,1,8,4,5};		
		Arrays.sort(arrVal);
		System.out.println(arrVal[0]);
		
	}
	
	public static void sortingArray()
	{
		int arrVal[]= {5,7,1,2,9,8};
		int temp=0;
		for(int i=0; i<arrVal.length; i++)
		{
			for(int j=i;j<arrVal.length;j++)
			{
				if(arrVal[i]>arrVal[j])
				{
					temp=arrVal[i];
					arrVal[i]=arrVal[j];
					arrVal[j]=temp;
				}
			}
		}
		for (int val : arrVal) {
			System.out.println(val);
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//usingForLoop();
		//usginArrayMethod();
		sortingArray();

	}

}
