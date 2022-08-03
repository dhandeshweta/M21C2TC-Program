package com.capgemini.annotations;
class Animal
{
	Animal()
	{
		System.out.println("Lion");
		
	}
	/*public void sound()
	 * {
	 * 
	 */
}


public class SupressWarningAnnotation {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		//will remove the 
		Animal a=new Animal();

	}

}
