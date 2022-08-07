package com.indiabix.enum1;
enum Bike
{
	R15,Pulser,KTM,R3,Honda
}



public class Example3 
{

	public static void main(String[] args) 
	{
		Bike b=Bike.Pulser;
		switch(b)
		{
		case Pulser:
		System.out.println("You choose Pulser");
		break;
		
		case R15:
			System.out.println("You choose R15");
			break;
		
		
		case KTM:
			System.out.println("You choose KTM");
			break;
		
		
		case R3:
			System.out.println("You choose R3");
			break;
			
			default:
				System.out.println("Invalid name");
		}

}
}
