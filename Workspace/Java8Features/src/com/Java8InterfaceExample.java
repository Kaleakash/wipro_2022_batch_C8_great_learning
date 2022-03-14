package com;
interface Abc {
	void dis1();		// by default public and abstract consider 
	public default void dis2() {
		System.out.println("dis2 is a Abc interface default method");
	}
	public default void dis3() {
		System.out.println("dis3 is a Abc interface default method");
	}
	public static void dis4() {
		System.out.println("dis4 is a Abc interface static method");
	}
}
class Xyz implements Abc {
	@Override
	public void dis1() {
		System.out.println("For Abc interface dis1() method body providedd by Xyz class");
	}
	@Override
	public void dis2() {
		System.out.println("Xyz class overrided dis2() default method");
	}
	//@Override
	public static void dis4() {
		System.out.println("It is static Xyz own method");
	}
}
public class Java8InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xyz obj = new Xyz();
			obj.dis1();		// overrided method 
		obj.dis2();		// overrided but optional 
		obj.dis3();		// default method 
		obj.dis4();	// calling Xyz class methodd 
		Abc.dis4();  // calling interface method 
	}

}
