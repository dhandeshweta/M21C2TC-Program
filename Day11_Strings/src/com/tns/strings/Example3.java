package com.tns.strings;

public class Example3 {

	public static void main(String[] args) {
		//String str="Hello";
		//String str1="Hello";
		String str1=new String("Hello");
		String str2=new String("Hello");
		//System.out.println(str == str2);
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

	}

}
