package com.cg.streamsoperation;

import java.util.LinkedList;

public class CollectionLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<Integer>obj=new LinkedList<>();
        obj.add(35);
        obj.add(50);
        obj.add(45);System.out.println(obj);
        //obj.forEach(i->System.out.println(i)); //1st method
        obj.forEach(System.out::println);        //2nd method
        
	}

}
