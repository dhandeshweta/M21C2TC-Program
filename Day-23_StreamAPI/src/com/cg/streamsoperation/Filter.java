package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		List<Float>obj=Arrays.asList(12.5f,56.7f,61.5f);
		//system.out.println(obj);
		//filtering with condition: filter(predicates)
		obj.stream().filter(i->i>15.9f).forEach(System.out::println);

	}

	
}
