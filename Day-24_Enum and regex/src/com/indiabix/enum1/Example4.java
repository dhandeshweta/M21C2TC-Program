package com.indiabix.enum1;
interface Pizza
{
	void display();
	
}
enum size implements Pizza
{
	small,medium,large,extralarge;

	@Override
	public void display() {
		System.out.println("size is:" +this);
		
	}
	
}

public class Example4 {

	public static void main(String[] args) {
		size.large.display();

	}

}
