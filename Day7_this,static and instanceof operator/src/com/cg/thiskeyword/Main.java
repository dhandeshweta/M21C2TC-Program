package com.cg.thiskeyword;



public class Main

{
int a;
int b;
//Default constructor

void main()
{
	a=10;
	b=20;
	
}
//Method that returns current class instance
  Main get()
{
	return this;
	
}
  
//Displaying value of variables a and b
  
void display()
{
	System.out.println("a="+a+"b="+b);
	
}

	public static void main(String[] args) 
	{
		Main Object = new Main();
	 Object.get().display();
		

	}

}
