package com;
class Outer {
	int a; 
	void dis1() {
		System.out.println("Dis1 is a outer class method");
	}
	class Inner1 {
		void dis2() {
			System.out.println("Dis2 is a inner non static class method");
		}
	}
	static class Inner2 {
		void dis3() {
			System.out.println("Dis3 is a inner static class method");
		}
	}
}
public class InnerClassExample {
	public static void main(String[] args) {
		Outer out = new Outer();
		out.dis1();
		// 1st approach 
		//Inner1 obj = new Inner1();
		
		Outer.Inner1 in1 = out.new Inner1();
		in1.dis2();
		
		//2nd approach 
		Outer.Inner1 in2 = new Outer().new Inner1();
		in2.dis2();
		
		Outer.Inner2 in3 = new Outer.Inner2();
		in3.dis3();
	}

}
