package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String>obj=Arrays.asList(new String[] {"Apple","Banana","Mango","Lichi"});
		System.out.println("Word length for object-fruits");
		obj.stream().map(String::length).forEach(i->System.out.println(i+" "));
		
		List<Integer>obj1=Arrays.asList(new Integer[] {12,56,89,67});
		
         List<Integer>obj2=obj1.stream().map(i->i*i).collect(Collectors.toList());
		 System.out.print(obj1+" ");
		
	}
	

}
