package com.cg.testing;

import org.junit.jupiter.api.Test;

public class FirstUnitTestingProgram 
{
	@Test
void accept()
{
	System.out.println("Welcome to Core java program");
}
	@Test          //Annotation before method only
	void display()
	{
		int x=5;
		System.out.println(x);
		
	}
}
