package com.cg.bufferreader;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;


public class BufferReader {

	public static void main(String[] args, Object system )  throws IOException 
	
	{
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		String str=obj.readLine();

		system.out.println(str);
		
		
		
		
		
		

	}
}