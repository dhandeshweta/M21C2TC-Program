package com.capgemini.annotations;

class car
{
	public void speed(int s)
	{
		System.out.println("speed is : "+s+"km/hr");
	}
}
class BMW extends car
{
	//@Override annotations is giving the extra information about the method
	@Override
	public void speed(int str)
	{
		System.out.println("speed is : "+str+"km/hr");
	}
}



public class OverideAnnotation 
{

	public static void main(String[] args) 
	{
		BMW b=new BMW();
		b.speed(60);

	}

}
