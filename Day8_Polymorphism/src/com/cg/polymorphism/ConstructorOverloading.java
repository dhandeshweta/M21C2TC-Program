package com.cg.polymorphism;

//program on constructor overloading
class Triber
{
	int speed;
	String engine;
	//zero parameter
	Triber()
	{
		System.out.println("Renault-Kiger");
		
	}
	//Two parameter
	Triber(int speed, String engine)
	{
		this.speed=speed;
		this.engine=engine;
		System.out.println("speed is: "+speed +" and the engine is on:"+engine);
		
	}
}




public class ConstructorOverloading {

	public static void main(String[] args) {
		Triber t=new Triber();
		Triber t1=new Triber(45, "Disel");

	}

}
