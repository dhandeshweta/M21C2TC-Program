package com.cg.thiskeyword;


public class CurrentClassConstructor
{
	int a;
	CurrentClassConstructor()
	{
		this(10);
		System.out.println("Inside default constructor \n");
	}
	CurrentClassConstructor(int a)
			{
		this.a = a;
		System.out.println("Inside parameterised constructor");
			}
	




	public static void main(String[] args) 
	{
		
CurrentClassConstructor object = new CurrentClassConstructor();
	}

}
