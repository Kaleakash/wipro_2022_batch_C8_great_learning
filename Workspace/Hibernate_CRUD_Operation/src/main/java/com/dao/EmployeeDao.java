package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;

public class EmployeeDao {

	
	public int storeEmployee(Employee emp) {
		try {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");			// driver loaded successfully
		SessionFactory sf = con.buildSessionFactory();	// like a Connection con
		Session session = sf.openSession();					// Statement and PreparedStatement 
		
		Transaction tran = session.getTransaction();
		tran.begin();
				session.save(emp);
		tran.commit();
		

		return 1;
		}catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	public int updateEmployee(Employee emp) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");			// driver loaded successfully
		SessionFactory sf = con.buildSessionFactory();	// like a Connection con
		Session session = sf.openSession();					// Statement and PreparedStatement 		
		Transaction tran = session.getTransaction();
		Employee e = session.get(Employee.class, emp.getId());
		if(e==null) {
			return 0;
		}else {
			tran.begin();
				e.setSalary(emp.getSalary());
				session.update(e);
			tran.commit();
			return 1;
		}

	}
	public int deleteEmployee(int id) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");			// driver loaded successfully
		SessionFactory sf = con.buildSessionFactory();	// like a Connection con
		Session session = sf.openSession();					// Statement and PreparedStatement 		
		Transaction tran = session.getTransaction();
		Employee e = session.get(Employee.class, id);
		if(e==null) {
			return 0;
		}else {
			tran.begin();
					session.delete(e);
			tran.commit();
			return 1;
		}
	}
	
	public Employee findEmployeeById(int id) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");			// driver loaded successfully
		SessionFactory sf = con.buildSessionFactory();	// like a Connection con
		Session session = sf.openSession();					// Statement and PreparedStatement 		
		Employee e = session.get(Employee.class, id);
		if(e==null) {
			return null;
		}else {
				return e;
		}
	}
	// retrieve all object 
	public List<Employee> findAllEmployee() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");			// driver loaded successfully
		SessionFactory sf = con.buildSessionFactory();	// like a Connection con
		Session session = sf.openSession();
		//Query qry = session.createQuery("select emp from Employee emp");
		//Query qry = session.createQuery("from Employee");
		Query qry = session.createQuery("from Employee emp");
		List<Employee> listOfEmp = qry.list();
		return listOfEmp;
	}
	// retrieve only one property 
	public List<String> findAllEmployeeName() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");			// driver loaded successfully
		SessionFactory sf = con.buildSessionFactory();	// like a Connection con
		Session session = sf.openSession();	
		Query qry = session.createQuery("select emp.name from Employee emp");
		List<String> listOfEmp = qry.list();
		return listOfEmp;
	}
	// retrieve partial object 
	public List<Object[]> findNameAndSalary() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");			// driver loaded successfully
		SessionFactory sf = con.buildSessionFactory();	// like a Connection con
		Session session = sf.openSession();	
		Query qry = session.createQuery("select emp.name,emp.salary from Employee emp");
		List<Object[]> listOfEmp = qry.list();
		return listOfEmp;
	}
	
	
	public List<Employee> findEmployeeSalary(float salary, String name) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");			// driver loaded successfully
		SessionFactory sf = con.buildSessionFactory();	// like a Connection con
		Session session = sf.openSession();
		//Query qry = session.createQuery("select emp from Employee emp");
		//Query qry = session.createQuery("from Employee");
		Query qry = session.createQuery("from Employee emp where emp.salary = :a  and emp.name like :b");
		qry.setParameter("a", salary);
		qry.setParameter("b", name);
		List<Employee> listOfEmp = qry.list();
		return listOfEmp;
	}

	public List<Object[]> joinTable() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");			// driver loaded successfully
		SessionFactory sf = con.buildSessionFactory();	// like a Connection con
		Session session = sf.openSession();
		//Query qry = session.createQuery("select emp from Employee emp");
		//Query qry = session.createQuery("from Employee");
		Query qry = session.createSQLQuery("select t.tname,t.tech,s.sname from trainer t inner join student s on t.tid=s.tsid");
		List<Object[]> listOfEmp = qry.list();
		return listOfEmp;
	}
	
}
