package com.cg.superkeyword;

//super keyword:- it is used to access parent class instance variable

class Mobile{
	
	public String name="samsung";
	
}

class samsung extends Mobile
{
	String name="Galaxy M31s";
	void display()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
}

public class SuperVariable {

	public static void main(String[] args) 
	{
		samsung s=new samsung();
		s.display();

	}

}
