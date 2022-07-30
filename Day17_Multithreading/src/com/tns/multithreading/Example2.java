package com.tns.multithreading;

public class Example2 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("current Thread :" + t);
		t.setName("XYZ");
		System.out.println("current Thread :" + t);
		try
		{
			Thread.sleep(1);
		}
	    catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		
	}

}
