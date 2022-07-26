package com.cg.AnynomousClass;
//Anynomous class

abstract class Anynomous
{
	public abstract void method();
	
}


public class Demo {

	public static void main(String[] args) {
		Anynomous a=new Anynomous()
				{
			        public void method()
			{
				System.out.println("This is an example of an Anynomous class");
			}
				};
				a.method();

	}

}
