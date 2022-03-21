package com.main;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		Employee emp = new Employee(104, "Dinesh", 16000);
		EmployeeService es = new EmployeeService();
		String res = es.storeEmployee(emp);
		System.out.println(res);
	}

}
