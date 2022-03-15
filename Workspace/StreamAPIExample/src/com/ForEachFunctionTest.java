package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

//class MyConsumer implements Consumer<Integer>{
//	@Override
//	public void accept(Integer t) {
//	System.out.println("Value of t is "+t);	
//	}
//}
public class ForEachFunctionTest {
	public static void main(String[] args) {
//	Consumer<Integer> c1 = new MyConsumer();
//	c1.accept(100);
//	
//	Consumer<Integer> c2 = (v)->System.out.println("Value of t using lambda expression "+v);
//	c2.accept(200);
	
	List<Integer> list = new ArrayList<>();
	list.add(100); list.add(200); list.add(300); list.add(400);
//	System.out.println("Retrieve value using enhanced loop");
//	for(int n:list) {
//		System.out.print(" "+n);
//	}
//	System.out.println("using Iterator");
//	Iterator<Integer> li = list.iterator();
//	while(li.hasNext()) {
//		int n = li.next();
//		System.out.print(" "+n);
//	}
//	System.out.println("Using For each function ");
//	Consumer<Integer> c3 = new MyConsumer();
//	list.forEach(c3);
	System.out.println("Retreive using lambda expression");
	list.forEach((v)->System.out.println(v));
//	Consumer<Integer> c4 = (v)->System.out.println("Value of v using lambda expression"+v);
//	list.forEach(c4);
	}

}
