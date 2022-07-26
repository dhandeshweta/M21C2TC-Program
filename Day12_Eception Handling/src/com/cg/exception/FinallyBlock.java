package com.cg.exception;
//program on finally block

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner S=new Scanner(System.in);
		int x=S.nextInt();
		//if any exception will be there in a try block
		//that exception will handle by catch block
		try
		{
			int res=15/x;
			System.out.println(res);
			//finally block will not execute if you call below statement
			//system.exit(0);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Whether any exception occur or not,the finally block is always excuted");
		}
		System.out.println("M-21 Batch-Angular");

	}

}
