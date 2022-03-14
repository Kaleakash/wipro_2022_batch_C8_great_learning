package com;

@FunctionalInterface
interface Sample {
	void dis1();
	//void dis2();
	default void dis3() {
		
	}
	default void dis4() {
		
	}
	static void dis5() {
		
	}
	static void dis6() {
		
	}
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
