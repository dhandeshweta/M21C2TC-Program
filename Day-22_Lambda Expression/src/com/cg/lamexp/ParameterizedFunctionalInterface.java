package com.cg.lamexp;
//functional Interface = which contains only one abstract method 

interface B
{
	//parameterized abstract method
	String print(String str);
}

public class ParameterizedFunctionalInterface {

	public static void main(String[] args) {
		//Lambda expression
		B obj=(String str)->
		{
			//System.out.println("Lambda Expression");
			return str;
		};
		System.out.println(obj.print("Lambda Expression"));

	}

}
