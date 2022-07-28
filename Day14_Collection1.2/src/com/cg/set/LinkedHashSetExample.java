package com.cg.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
      Set<Object>obj=new LinkedHashSet<Object>();
		
		//1.Hashset/set is  unordered 
		obj.add("Prena");
		obj.add('p');
		obj.add(7);
		obj.add(5.8);
		System.out.println(obj);
		


	}

}
