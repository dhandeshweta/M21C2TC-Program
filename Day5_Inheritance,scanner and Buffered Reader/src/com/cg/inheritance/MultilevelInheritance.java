package com.cg.inheritance;

class car
{
  void carType()
  {
	  System.out.println("Engine is on petrol");
	  
  }
}
 class Renault extends car
 {
	 public  string brand="Renault";
	 void brand()
	 {
		 System.out.println("Brand is:"+brand);
		 
	 }
 }
 
 class KWID extends Renault
 {
	 public int speed=50;
	 void average()
	 {
		 System.out.println("The average speed is:"+speed+"km/hr");
		 
	 }
 }







public class MultilevelInheritance {

	public static void main(String[] args) {
		KWID k=new KWID();
		k.average();
		k.brand();
		k.carType();

	}

}
