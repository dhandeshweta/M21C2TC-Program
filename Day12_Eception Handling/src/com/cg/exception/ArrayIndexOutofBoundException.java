package com.cg.exception;




public class ArrayIndexOutofBoundException {

	public static void main(String[] args) {
		System.out.println("First Line");
		System.out.println("Second Line");
		int[] myIntArray = new int[] {1,2,3};
		try
		{
			print( myIntArray);
			System.out.println("Third Line");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
	public static void print(int[] arr)
	{
		System.out.println(arr[3]);
		System.out.println("Fourth element successfully displayed");
		
	}

}
