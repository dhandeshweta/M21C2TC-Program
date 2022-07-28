package com.cg.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) 
	{
		//Map<Integer,String>obj=new HashMap<Integer,String>();
		Map<Integer,String>obj=new LinkedHashMap<Integer,String>();
		//1.HashMap is unordered
		//1.LinkHashMap is ordered
		obj.put(2, "Shweta");
		obj.put(3, "Sneha");
		obj.put(7, "Surekha");
		
        System.out.println(obj);
        System.out.println(obj.get(2));
	}

}
