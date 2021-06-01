package com.au.firstmaven;

public class StarPattern {

	public static void leftTriangle()
	{
		System.out.println("Print number from 1 to 10");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
	}
	
	public static void rightTriangle()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void leftTriangleMirror()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
	
	public static void rightTriangleMirror()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void triangle()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void triangleMirror()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print("*");
			}
			for(int k=i;k<n;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		//leftTriangle();
		//rightTriangle();
		//leftTriangleMirror();
		//rightTriangleMirror();
		//triangle();
		triangleMirror();
	}

}

