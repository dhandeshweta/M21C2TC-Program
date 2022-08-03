package com.capgemini.annotations;
//custom annotation
@interface custom
{
	//abstract method
	//multi-value annotation
	String print();
	int speed();
	float percentage();
	
}
class B 
{
	@custom (print="Hello students",speed=50,percentage=88.9f)
	public void display()
	  {
	       System.out.println("Hurrah!It's Holiday");
	 }
}

public class CustomAnnotation {

	public static void main(String[] args) {
		B b=new B();
		b.display();

	}

}
