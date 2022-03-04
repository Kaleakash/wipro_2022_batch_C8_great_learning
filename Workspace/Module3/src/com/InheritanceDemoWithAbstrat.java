package com;
abstract class Bike {
		abstract void speed();
		void mailage() {
			System.out.println("50km/lt");
		}
}
abstract class Honda extends Bike {
	
	void color() {
		System.out.println("Gray");
	}
}
class Pulsar extends Bike {
	void speed() {
		System.out.println("90km/hr");
	}
	void color() {
		System.out.println("Black");
	}
}
public class InheritanceDemoWithAbstrat {
	public static void main(String[] args) {
	//Honda hh = new Honda();		hh.color(); hh.speed();
	Pulsar pu = new Pulsar(); 	pu.color();  pu.speed();
	}
}
