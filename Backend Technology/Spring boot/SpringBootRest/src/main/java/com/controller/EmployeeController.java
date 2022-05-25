package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController
public class EmployeeController {

	// http://localhost:9090/say 
	@RequestMapping(value = "say")
	public String sayHello() {
		return "Welcome to Spring Spring boot with rest API";
	}
	// http://localhost:9090/html 
	@RequestMapping(value = "html",produces = MediaType.TEXT_HTML_VALUE)
	public String sayHtml() {
		return "<h1>Welcome to Simple spring boot with html format data</h1>";
	}
	// http://localhost:9090/text 
	@RequestMapping(value = "text",produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayPlain() {
		return "<h1>Welcome to Simple spring boot with plain format data</h1>";
	}
	// http://localhost:9090/xml
	@RequestMapping(value = "xml",produces = MediaType.TEXT_XML_VALUE)
	public String sayXml() {
		return "<h1>Welcome to Simple spring boot with xml format data</h1>";
	}
	// http://localhost:9090/empInfo
	@RequestMapping(value = "empInfo",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee() {
		Employee emp = new Employee(1,"Ravi",12000);
		return emp;
	}
	// http://localhost:9090/employeeDetails
	@RequestMapping(value = "employeeDetails",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployee() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(1, "Ajay", 12000));
		listOfEmp.add(new Employee(2, "Vijay", 15000));
		listOfEmp.add(new Employee(3, "Ramesh", 18000));
		return listOfEmp;
	}
	
	// http://localhost:9090/query?name=Ravi
	@RequestMapping(value = "query")
	public String queryParam(@RequestParam("name") String name) {
		return "Welcome user to query param "+name;
	}
	
	// http://localhost:9090/query?name=Ravi&pass=123s
		@RequestMapping(value = "query")
		public String queryParamMultiple(@RequestParam("name") String name,@RequestParam("pass") String pass) {
			return "Welcome user to query param "+name;
		}
		
	// http://localhost:9090/path/Ravi
	
	@RequestMapping(value = "path/{name}")
	public String pathParam(@PathVariable("name") String name) {
		return "Welcome user to path param "+name;
	}
	
	// http://localhost:9090/path/Ravi/123
	
		@RequestMapping(value = "path/{name}/{pass}")
		public String pathParamMultiple(@PathVariable("name") String name,@PathVariable("pass") String pass) {
			return "Welcome user to path param "+name;
		}
}
