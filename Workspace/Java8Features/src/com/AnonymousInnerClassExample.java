package com;
interface A {
	void dis1();
	//void dis2();
}
class B implements A {
	public void dis1() {
		System.out.println("B class provided body for dis1() method");
	}
}
public class AnonymousInnerClassExample {
	public static void main(String[] args) {
		//1st approach 
		A obj1 = new B();
		obj1.dis1();
		//2nd appoach 
		
		A obj2 = new A() {
			public void dis1() {
				System.out.println("A interface method override by anonymous inner class - Logic 1 ");
			}
			
		};
		obj2.dis1();
		
		A obj3 = new A() {
			public void dis1() {
				System.out.println("A interface method override by anonymous inner class - Logic 2");
			}
		};
		obj3.dis1();
		//3rd approach 
		
		A obj4 = ()->System.out.println("This is lambda expression");
		obj4.dis1();
	}

}
