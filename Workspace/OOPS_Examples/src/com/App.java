package com;
public class App {

	public static void main(String[] args) {
		//start();
//		Car innova = new Car();
//		innova.start();
//		innova.stop();
//		
//		Car ertiga = new Car();
//		ertiga.start();
//		ertiga.stop();
		
//		Car innova = new Car();
//		innova.displayCarInfo();
//		innova.color="Gray";
//		innova.price=2000000;
//		innova.wheel=4;
//		innova.displayCarInfo();
		
//		Abc obj1 = new Abc();
//		obj1.display();
//		obj1.display();
//		obj1.display();
//		Employee emp = new Employee();
//		//emp.name = "Ravi";
//		//emp.salary = -12000;
//		emp.setValue("Raj",-12000);
//		emp.display();
		
		Customer c1 = new Customer();
		c1.setCid(100);
		c1.setCname("Ravi");
		c1.setCage(21);
		
		System.out.println("id is "+c1.getCid());
		System.out.println("name is "+c1.getCname());
		System.out.println("age is "+c1.getCage());
		
		Customer c2 = new Customer(101, "Ramesh", 22);
		System.out.println("id is "+c2.getCid());
		System.out.println("name is "+c2.getCname());
		System.out.println("age is "+c2.getCage());
		
		Customer c3 = new Customer(102, "Lokesh", 23);
		System.out.println(c3);
		
	}
}
