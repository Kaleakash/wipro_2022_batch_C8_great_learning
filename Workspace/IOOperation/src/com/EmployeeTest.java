package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import bean.Employee;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
//		Employee emp = new Employee(100, "Ravi", 120000);
//		System.out.println(emp);
//
//		FileOutputStream fos = new FileOutputStream("emp.txt");
//		
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(emp);
//		System.out.println("Object serialization done succesfully..");
		
		FileInputStream fis = new FileInputStream("emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Employee ee = (Employee)obj;
		System.out.println(ee);
		System.out.println("Object de-serialization done successfully");
	}

}
