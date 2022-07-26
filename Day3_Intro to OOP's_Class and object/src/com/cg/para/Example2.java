package com.cg.para;
class B
{
	
		public int x;
		//Parameterized constructor
		B(int a)
		{
			System.out.println("The value of a is: "+a);
		}
}




public class Example2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		B obj=new B(15);
		

	}

}
