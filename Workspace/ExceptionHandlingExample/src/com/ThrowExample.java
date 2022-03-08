package com;
class MyException extends Exception{
	public MyException() {
		super();
	}
	MyException(String msg){
		super(msg);				// calling super class parameter constructor 
	}
}
public class ThrowExample {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		try {
			if(a>b) {
				//throw new Exception(); // Generic Exception 
				//throw new ArithmeticException();
				//throw new ArithmeticException("a>b");
				//throw new MyException();
				throw new MyException("a>b");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
