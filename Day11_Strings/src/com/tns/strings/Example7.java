package com.tns.strings;

import java.util.StringTokenizer;

public class Example7 {

	public static void main(String[] args) 
	{
		StringTokenizer st=new StringTokenizer("Lets try this");
		while(st.hasMoreTokens())
		{
		
		System.out.println(st.nextToken());
		//System.out.println(st.nextToken());
		//System.out.println(st.nextToken());

	}

}
}