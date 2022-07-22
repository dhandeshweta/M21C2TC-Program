package com.cg.array;



class Employee
{
	public int EmpId;
	public String Name;
	//constructor to initialize the value
	Employee(int id,String name)
	{
		EmpId=id;
		Name=name;
	}
}

public class NonPrimitiveArray {

	public static void main(String[] args) {
		// declares array of class type
		Employee arr[]=new Employee[3];
		arr[0]=new Employee(1,"SHWETA");
		arr[1]=new Employee(2,"SNEHA");
        arr[2]=new Employee(3,"SUKNYA");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println("Element at "+i+" index is "+arr[i].EmpId+" "+arr[i].Name);
        }
	}

}
