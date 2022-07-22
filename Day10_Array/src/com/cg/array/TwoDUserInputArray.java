package com.cg.array;

import java.util.Scanner;

public class TwoDUserInputArray {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the outside array size: ");
		int n=s.nextInt();
		int arr[][]=new int[n] [n];
		//to enter the element in the array
		for(int i=0;i<arr.length;i++)
			
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=s.nextInt();
			}
			
		}
		//to print the elements in the 2d array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				
			{
				System.out.print(arr[i][j]+" ");
				s.close();
			}
		}

	}

}
