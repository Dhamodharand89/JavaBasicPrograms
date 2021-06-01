package com.au.firstmaven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StringReverse {

	public static void usingStringBuffer()
	{
		//1st way
				String name="Vijay";
				StringBuffer bf=new StringBuffer();
				bf.append(name);
				System.out.println("Name is:"+ name);
				System.out.println("Reverse name is:" + bf.reverse());
			
	}
	
	public static void usingForLoop()
	{
		String name="I love Vijay";
		String reverse="";
		char[] charArray=name.toCharArray();
		//int length=name.length();
		int length1=charArray.length;
		System.out.println("Size of Char array:"+length1);
		for (int i=length1-1;i>=0;i--)
		{
			reverse=reverse+charArray[i];
			
			
		}
		System.out.println("Reverse String is:"+reverse);
	}
	
	public static void usginCollection()
	{
		String name="Arun";
		String s="";
		char[] arayName=name.toCharArray();
		
		List<Character> l=new ArrayList<Character>();
		
		for (Character character : arayName) {
			l.add(character);
		}
		System.out.println("List value is :"+ l);
		Collections.reverse(l);
		//Collections.sort(l);
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			
			System.out.print(it.next());
		}
		
	}
	public static void main(String[] args) {
		
		//usingStringBuffer();
		//usingForLoop();
		usginCollection();
		

	}

}
