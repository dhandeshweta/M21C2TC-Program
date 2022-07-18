package com.cg.inheritance;

class Bike

	
{

public int speed=50;
void speed()
{
	System.out.println("The speed of the Bike is: "+speed+"km/hr");
	
}

}

class pulser extends Bike
{
	public int Spped=70;
}








public class SingleInheritance
{


	public static void main(String[] args) 
	
	{
		pulser p=new pulser();
		p.speed();

	}
}


