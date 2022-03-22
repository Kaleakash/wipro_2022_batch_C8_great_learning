package com.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
	
	public String updateEmployee(Employee emp) {
		EmployeeDao ed = new EmployeeDao();
		if(ed.updateEmployee(emp)>0) {
			return "Record updated successfully";
		}else {
			return "Record not updated";
		}
	}
	
	public String deleteEmployee(int id) {
		EmployeeDao ed = new EmployeeDao();
		if(ed.deleteEmployee(id)>0) {
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
	}
	
	public Employee findEmployee(int id) {
		EmployeeDao ed = new EmployeeDao();
		return ed.findEmployeeById(id);
	}
	
	public List<Employee> findAllEmployee() {
		EmployeeDao ed = new EmployeeDao();
		return ed.findAllEmployee();
		//return ed.findAllEmployee().stream().filter(e->e.getSalary()>15000).collect(Collectors.toList());
	}
	
	public List<Object[]> joinTable() {
		EmployeeDao ed = new EmployeeDao();
		return ed.joinTable();
	}
}
