package com.cg.generics;





public class GenericMethod {

	public static void main(String[] args) {
		
		Integer arr[]= {11,33,44};
		
		Character ch[]= {'p' , 's' , 'z'};
		System.out.println("Integer Array: ");
		
		print(arr);
		
		
         System.out.println("Character Array: ");
		
		 print(ch);
	}
		
        //Generic Method: We can pass any type of Arguments
		//E is a Element
		public static <E>void print(E[] elements)
		{
			for(E elem:elements)
			{
				System.out.println(elem);
			}
			System.out.println();
		}

	}


