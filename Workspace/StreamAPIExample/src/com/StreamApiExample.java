package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {

	public static void main(String[] args) {
		List<String> listOfStd = new ArrayList<>();
		listOfStd.add("Ravi");listOfStd.add("Vijay");listOfStd.add("Reeta");listOfStd.add("Balaji");listOfStd.add("Laximan");
		listOfStd.add("Ajay");listOfStd.add("Seeta");listOfStd.add("Meeta");listOfStd.add("Raju");listOfStd.add("Ram");

		//listOfStd.stream().forEach(v->System.out.println(v));
		//listOfStd.stream().filter(v->v.length()>4).forEach(v->System.out.println(v));
		//listOfStd.stream().map(v->v.toLowerCase()).forEach(v->System.out.println(v));
		//listOfStd.stream().map(v->"Welcome "+v).forEach(v->System.out.println(v));
		//long leng = listOfStd.stream().filter(v->v.contains("ee")).count();
		//System.out.println("Number of names are "+leng);
		//boolean res = listOfStd.stream().allMatch(v->v.startsWith("R"));
		//System.out.println(res);
		//listOfStd.stream().skip(3).forEach(v->System.out.println(v));
		
		//List<String> listOfNames = listOfStd.stream().filter(v->v.contains("ee")).collect(Collectors.toList());
		//System.out.println("Number of names "+listOfNames.size());
	}

}
