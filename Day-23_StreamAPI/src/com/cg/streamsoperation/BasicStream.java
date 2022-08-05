package com.cg.streamsoperation;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream 
{

	public static void main(String[] args) 
	{
		//stream can be created with static data
		Stream<String>obj=Stream.of("Shabnam","Shweta","Sneha");
        obj.forEach((i)->System.out.print(i+ " "));  //forEach 
        System.out.println();
        
        //stream can be accquired from array or collection
        List<String>obj1=Arrays.asList(new String[] {"Mumbai","Pune","Nanded"}); //pass the arrays list - Arrays.asList
        obj=obj1.stream();
        obj.forEach(System.out::println);
        
	} 

}
