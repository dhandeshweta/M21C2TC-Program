package com.cg.exception;

import java.util.Scanner;

public class ArithemeticExceptionClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int x=S.nextInt();
		//if any exception will be there in a try block
		//that exception will handle by catch block
		try
		{
			int res=15/x;
			System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}

}
