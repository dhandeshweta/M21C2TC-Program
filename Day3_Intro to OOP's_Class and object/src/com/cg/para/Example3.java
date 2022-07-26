package com.cg.para;
class C 
{
	int rollno;
	String name;
	C(int r,String n)
	{
		rollno=r;
		name=n;
		
	}
	void print()
	{
		System.out.println("Roll NO is:"+rollno+" and Name is:"+name);
	}
}
public class Example3 {

	public static void main(String[] args) 
	{
		C obj=new C(11,"Shweta");
		C obj1=new C(12,"Neha");
		obj.print();
		obj1.print();
		

	}

}
