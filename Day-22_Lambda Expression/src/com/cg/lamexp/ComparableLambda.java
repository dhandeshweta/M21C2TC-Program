package com.cg.lamexp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparableLambda {

	public static void main(String[] args) {
		//lambda expression
		Comparator<String>obj=(s1,s2)->Integer.compare(s1.length(),s2.length());
		String str[]= {"abd","Shweta","Sampada"};
        Collections.sort(Arrays.asList(str),obj);
        for(String i:str)    //Enhance for-loop
        {
        	System.out.println(i);
        }
	}

}
