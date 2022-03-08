package com;

public class NestedTryAndCatch {

	public static void main(String[] args) {
		String str = "";
		int abc[]= {10,20,30,40};
		try {
			// code can generate arithmetic 
				try {
					int res = abc[Integer.parseInt(str)]/1;	
					System.out.println("Res "+res);
				} catch (ArithmeticException e) {
					System.out.println("Inner catch");
				}
			// code can generate arithmetic 
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("Outer catch");
		}
		System.out.println("Fininsh");
	}

}
