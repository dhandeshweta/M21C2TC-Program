package com.cg.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) 
	{
	
		//Set<Integer>obj=new HashSet<Integer>();
		Set<Object>obj=new HashSet<Object>();
		
		//1.set is an unordered
		obj.add("Prena");
		obj.add('p');
		obj.add(7);
		obj.add(5.8);
		System.out.println(obj);
		
	}

}
