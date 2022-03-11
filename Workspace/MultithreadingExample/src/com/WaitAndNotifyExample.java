package com;
class Operation implements Runnable{
	@Override
	public synchronized void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int i=0;i<10;i++) {
			System.out.println(name+" "+i);
			try {
				Thread.sleep(1000);
				if(i==4 && name.equals("Ravi")) {
					wait();
				}
				if(i==6 && name.equals("Vijay")) {
					notify();
					wait();
				}
				if(i==6 && name.equals("Ajay")) {
					notify();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class WaitAndNotifyExample {
	public static void main(String[] args) {
	Operation op = new Operation();
	Thread t1 = new Thread(op);
	Thread t2 = new Thread(op);
	Thread t3 = new Thread(op);
	t1.setName("Ravi"); t2.setName("Ajay"); t3.setName("Vijay");
	t1.start(); t2.start(); t3.start();
	}

}
