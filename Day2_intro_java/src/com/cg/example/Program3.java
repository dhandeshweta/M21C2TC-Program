package com.cg.example;

import java.util.Scanner;

public class Program3 
{

	
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("@"+" ");
			}
			System.out.println();
		}

	}

}
