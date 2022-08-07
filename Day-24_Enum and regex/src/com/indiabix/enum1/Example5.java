package com.indiabix.enum1;

public class Example5 
{
	
	 enum EmpType
	    {
	    	Contract,Permanant,Temporary;
	    }
	 static void print(EmpType e)
	 {
		 if(e==EmpType.Permanant)
		 {
			 System.out.println("Permanant Employee");
		 }
		 else if(e==EmpType.Contract)
		 {
			 System.out.println("Contract-Based Employee");
		 }
		 else
		 {
			 System.out.println("Temporary Employee");
		 }
	 }

	public static void main(String[] args) 
	{
		EmpType e =EmpType.Temporary;
		print(e);

	}

}
