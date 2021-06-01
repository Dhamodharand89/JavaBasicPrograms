package com.au.firstmaven;

public class NumberSwap {

	public static void additionSub()
	{
		int a=20;
		int b=10;
		
		System.out.println("Value of a:"+a + "value of b:"+b);
		
		a=a-b;
		b=a+b;
		a=b-a;
				
		System.out.println("Value after swap a:"+a + "value of b:"+b);
		
	}
	
	public static void multiDiv()
	{
		int a=20;
		int b=10;
		
		System.out.println("Value of a:"+a + "value of b:"+b);
		
		a=a*b;
		b=a/b;
		a=a/b;
				
		System.out.println("Value after swap a:"+a + "value of b:"+b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//additionSub();
		multiDiv();
	
	
	}

}
