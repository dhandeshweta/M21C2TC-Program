package com.capgemini.annotations;
class A
{
	//@Deprecated - it allows any element no longer to be used
	@Deprecated
	public void print()
	{
		System.out.println("Welcome to the C2TC program");
	}
}
public class DeprecatedAnnotation {

	public static void main(String[] args) {
		A a=new A();
		a.print();
	}

}
