package com;
class Abc {
	int a;		// instance variable 
	static int b;	// static varaible 
	void dis1() {
		System.out.println("non static method");
	}
	static void dis2() {
		System.out.println("static method");
	}
}
public class StaticExample {
	public static void main(String[] args) {
		Abc obj1 = new Abc();
		obj1.a=10;
		Abc.b=20;	// it is a static 
		obj1.b=30;		// through object also. 
		obj1.dis1();
		Abc.dis2();			// through class name 
		obj1.dis2();		// object also 
	}

}
