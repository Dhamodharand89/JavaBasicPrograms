package com.au.firstmaven;

public class ReversingASentence {

	public static void reverseSentence()
	{
		//input : I love Tamilnadu
		//Output: Tamilnadu love I
		
		String name="I love Tamilnadu";
		String reverse="";
		String[] splitName=name.split(" ");
		
		System.out.println("Vlue of split string is:"+splitName.length);
		
		for(int i=splitName.length-1;i>=0;i--)
		{
			reverse=reverse+splitName[i]+" ";
		}
		System.out.println("After reverse:"+reverse);
		
		
		
	}
	public static void main(String[] args) {
		
		reverseSentence();
	}

}
