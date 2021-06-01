package com.au.firstmaven;

public class ShiftAllZerosToOneSide {

	public static void shiftLeftSide()
	{
		int arrNum[]= {5,4,0,5,8,1,0,9,7};
		int temp=0;
		
		for(int i=0;i<arrNum.length;i++)
		{
			for(int j=i;j<arrNum.length;j++)
			{
			if(arrNum[i]>arrNum[j])
			{
				temp=arrNum[i];
				arrNum[i]=arrNum[j];
				arrNum[j]=temp;
			}
			}
		}
		for (int i : arrNum) {
			System.out.print(i);
		}
		
	}
	public static void main(String[] args) {
		shiftLeftSide();

	}

}
