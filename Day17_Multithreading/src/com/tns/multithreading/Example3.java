package com.tns.multithreading;
//Mutual Exclusive
//      | sub part
//(static synchronization)
class TestName
{
	public static synchronized void display()//using static keyword
	{
		System.out.println("current thread " + Thread.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName() + "i- " +i);
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Valueof implements Runnable
{
	Thread t;
	TestName val;
	Valueof(TestName Val)
	{
		this.val = Val;
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		TestName.display();
	}
}
public class Example3

{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		TestName obj1 = new TestName();
		TestName obj2 = new TestName();
		Valueof t1 = new Valueof(obj1);
		Valueof t2 = new Valueof(obj2);

	}

}
