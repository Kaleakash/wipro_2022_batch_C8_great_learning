package com.service;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {

	public String storeEmployee(Employee emp) {
		if(emp.getSalary()<12000) {
			return "Salary > 12000";
		}else {
			EmployeeDao ed = new EmployeeDao();
			if(ed.storeEmployee(emp)>0) {
				return "Record inserted successfully";
			}else {
				return "Record didn't store";
			}
		}
	}
}
