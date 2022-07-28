package com.cg.generics;
//Generic class 

public class GenericClass<T>{
   // T is a type
	T Num;
     public void display()
     {
    	 System.out.println(Num.getClass().getName());
     }


	public static void main(String[] args) 
	{
		
		GenericClass<Character>obj=new GenericClass<Character>();//Generic advantage
		obj.Num='z';
		obj.display();
	}

}
