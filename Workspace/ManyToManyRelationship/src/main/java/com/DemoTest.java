package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
//		SkillSet ss = new SkillSet();
//		ss.setSkillid(2);
//		ss.setSkillname("Python");
//		
//		EmployeeDetails ed1 = new EmployeeDetails();
//		ed1.setId(102);
//		ed1.setName("Ramesh");
//		
//		EmployeeDetails ed2 = new EmployeeDetails();
//		ed2.setId(103);
//		ed2.setName("Rajesh");
//		
//		List<EmployeeDetails> listOfemp = new ArrayList<>();
//		listOfemp.add(ed1); listOfemp.add(ed2);
//		ss.setListOfEmp(listOfemp);
//		tran.begin();
//				session.save(ss);
//		tran.commit();
//		System.out.println("Record saved successfully");
		
		SkillSet ss = session.get(SkillSet.class, 1);
		if(ss==null) {
			System.out.println("Skill Details not present");
		}else {
			List<EmployeeDetails> listOfemp = ss.getListOfEmp();
			System.out.println(" "+listOfemp.size());
		}
	}

}
