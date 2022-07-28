package com.cg.superkeyword;
//super keyword:- it is used to invoke parent class constructor

class Flower
{
	Flower()
	{
		System.out.println("Flower");
		
	}
}
class Rose extends Flower
{
	Rose()
	{
		//We are invoking parent class constructor
		//first give the preference to constructor call and then print the statement.
		super();
		System.out.println("Rose is Red");
		
	}
}


public class SuperConstructor {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		Rose r=new Rose();
	}

}
