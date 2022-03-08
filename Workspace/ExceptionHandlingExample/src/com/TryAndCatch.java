package com;

public class TryAndCatch {

	public static void main(String[] args) {
		System.out.println("Welcome to Java");
		int a=10;
		int b=0;
			try {
			int res = a/b;
			System.out.println("REsult is "+res);
			}catch (Exception e) {
				//System.out.println("I Take Care!");
				System.err.println(e.toString());
				//System.out.println(e.getMessage());
			}
		System.out.println("bye....");
		System.out.println("bye....");
		System.out.println("bye....");
		System.out.println("bye....");
	}

}
