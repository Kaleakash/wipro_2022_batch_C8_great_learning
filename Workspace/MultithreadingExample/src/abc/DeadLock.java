package abc;
class A implements Runnable{
	String s1,s2;
	A(String s1, String s2){
		this.s1=s1;
		this.s2=s2;
	}
	@Override
	public void run() {
			synchronized (s1) {
				System.out.println("s1 object lock by A class");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}	
			}
			
			synchronized (s2) {
				System.out.println("waiting for s2 object lock");
			}
	}
}
class B implements Runnable{
	String s1,s2;
	B(String s1, String s2){
		this.s1=s1;
		this.s2=s2;
	}
	@Override
	public void run() {
		synchronized (s2) {
			System.out.println("s2 object lock by B class");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		synchronized (s1) {
			System.out.println("waiting for s1 object lock");
		}
		
	}
}
public class DeadLock {
	public static void main(String[] args) {
	A obj1 = new A("Raj","Deep");
	B obj2 = new B("Raj","Deep");
	Thread t1 = new Thread(obj1);
	Thread t2 = new Thread(obj2);
	t1.start();
	t2.start();
	}

}
