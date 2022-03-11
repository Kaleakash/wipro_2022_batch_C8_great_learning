package com;




//class A extends Thread{
//		@Override
//		public void run() {
//			for(int i=0;i<10;i++) {
//				System.out.println("i "+i);
//			}
//		}
//}
//class B extends Thread{
//		@Override
//		public void run() {
//			for(int j=0;j<10;j++) {
//				System.out.println("j "+j);
//			}
//		}
//}
class A implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i "+i);
		}
	}
}
class B implements Runnable{
	int a;
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j "+j);
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();	// thread is ready 
		//obj1.start();
		//obj2.start();      // thread is ready to run 
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
		obj2.a=10;
	}

}
