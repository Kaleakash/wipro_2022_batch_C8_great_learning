package com.main;

import java.util.Scanner;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		EmployeeService es = new EmployeeService();
		int id;
		String name;
		float salary;
		int choice;
		String con;
		String res;
		do {
			System.out.println("1:Add Employee, 2: Update Employee 3:Delete Employee 4:FindEmployee 5 :REtrieve all 6: Join");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter the id");
			     id = sc.nextInt();
			     System.out.println("Enter the name");
			     name = sc.next();
			     System.out.println("Enter the salary");
			     salary = sc.nextFloat();
			     Employee emp = new Employee(id, name, salary);
			     res = es.storeEmployee(emp);
			     System.out.println(res);
			     break;
			case 2:System.out.println("Enter the id");
			    	id = sc.nextInt();
			    	System.out.println("Enter the salary");
			    	salary= sc.nextFloat();
			    	Employee emp2 = new Employee();
			    	emp2.setId(id);
			    	emp2.setSalary(salary);
			    	res = es.updateEmployee(emp2);
			    	System.out.println(res);
			    	break;
			case 3:System.out.println("Enter the id ");
			       id = sc.nextInt();
			       res = es.deleteEmployee(id);
			       System.out.println(res);
			       break;
			case 4:System.out.println("Enter the id ");
		       		id = sc.nextInt();
		       		Employee ee = es.findEmployee(id);
		       		if(ee==null) {
		       			System.out.println("Record not present");
		       		}else {
		       			System.out.println(ee);		// toString()
		       		}
		       		break;      
			case 5:System.out.println("All Employee Records");
			        es.findAllEmployee().forEach(e->System.out.println(e));
					break;
			 default:System.out.println("Wrong choice");
			         break;
			 case 6:System.out.println("Join Table");
			 		es.joinTable().forEach(e1->System.out.println("TName "+e1[0]+"Tech "+e1[1]+"SName"+e1[2]));
			 		break;
			}
			System.out.println("Do you want to continue?");
			con = sc.next();
		} while (con.equals("y"));
	}

}
