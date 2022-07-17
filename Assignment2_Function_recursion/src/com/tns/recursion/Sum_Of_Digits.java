package com.tns.recursion;





 class Sum_Of_Digits {
	 
	 static int Sum_Of_Digit(int n)
	 {
		 
		 if(n == 0)
			 return 0;
		 return(n % 10 + Sum_Of_Digit(n/10));
		 
	 }
 




	
	
	
	
	
	
	public static void main(String[] args )
	
	{
		int num = 1234567;
		int result = Sum_Of_Digit(num);
		System.out.println("Sum of digits in " +num + " is " + result);

	}
}
