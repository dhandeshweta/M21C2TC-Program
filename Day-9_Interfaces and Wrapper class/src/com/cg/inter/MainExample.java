package com.cg.inter;

interface Vehicle
{
	//abstract method
	void speed();
	
}
//when we use two interface and we are going to access one interface from another interface
//then always use extends keyword
interface car extends Vehicle

{
	void engine();
	
}
class bus implements car
{
	public void engine()
	{
		System.out.println("petrol");
	}
	
	@Override
	public void speed()
	{
		System.out.println("speed is 70km/hr");
	}
	
}


public class MainExample {

	public static void main(String[] args) {
		bus b=new bus();
		b.engine();
		b.speed();

	}

}
