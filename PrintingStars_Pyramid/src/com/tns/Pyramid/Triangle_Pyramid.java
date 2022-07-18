package com.tns.Pyramid;

public class Triangle_Pyramid 
{
	static void PrintSpace(int space)
	{
		
		
		if (space == 0)
			return;
		System.out.print(" ");
		PrintSpace(space - 1);
		
	}
	
	
	static void PrintStar(int asterisk)
	{
		
		if (asterisk == 0)
			return;
		System.out.print("* ");
		PrintStar(asterisk - 1);
		
	}
	
	static void pattern(int n, int num)
	{
		
		if (n == 0)
			return;
		PrintSpace(n-1);
		PrintStar(num - n + 1);
		System.out.println("");
		pattern(n - 1, num);
		
		
	}




	public static void main(String[] args) 
	
	{
		int n = 5;
		pattern(n, n);
		

	}

}
