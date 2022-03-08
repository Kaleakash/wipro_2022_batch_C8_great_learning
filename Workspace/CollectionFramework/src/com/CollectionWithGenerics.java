package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenerics {

	public static void main(String[] args) {
	// Collection framwework without generics 
		List ll = new ArrayList();
//		ll.add(10);		// auto-boxing : converting primitive to object. 
//		ll.add(10.20);
//		ll.add("Ravi");
//		ll.add(true);
//		
//		Object obj= ll.get(2);
//		Integer ii = (Integer)obj;
//		int n = ii.intValue();
//		System.out.println(n);
		// collection framework with generics 
		// CollectionClassName <Type>referecneName= new ClassName<Type>();
		// type can be Integer, Float, Double, User-defined class object. 
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);			// auto-boxing 
		list.add(20);
		list.add(30);
		
		int n  = list.get(0);			// auto-unboxing : converting object to primitive 
		System.out.println(n);
	}

}
