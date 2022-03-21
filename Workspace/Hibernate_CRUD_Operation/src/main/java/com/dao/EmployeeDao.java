package com.dao;

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
		
		//Transaction tran = session.getTransaction();
		//tran.begin();
		Transaction tran = session.beginTransaction();
				session.save(emp);
		tran.commit();
		
//		Transaction tran1 = session.beginTransaction();
//		session.delete(emp);
//		tran1.commit();
		return 1;
		}catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
}
