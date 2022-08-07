package com.indiabix.regex;

import java.util.Scanner;

public class Example8 {

	
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		String str="M-21 @@  Shweta Dhande @@ Ankita @@ Sneha";
		String[] res=str.split("@@");
		for(String i:res)
		{
			System.out.println(i);
		}

	}

}
