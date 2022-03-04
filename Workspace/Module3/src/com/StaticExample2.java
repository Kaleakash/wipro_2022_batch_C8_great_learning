package com;
class Demo {
	int a;
	static int b;
	void dis1() {
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
}
public class StaticExample2 {
	public static void main(String[] args) {
					Demo obj1 = new Demo();
					Demo obj2 = new Demo();
					obj1.a=10;
						obj1.b=20;
							Demo.b=30;
								obj2.a=40;
									obj2.b=50;
										Demo.b=60;
	obj1.dis1();    // a= 10		, b= 60
	obj2.dis1();	// a= 40		, b= 60 
	}

}
