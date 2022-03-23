package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session sesson = sf.openSession();
		Transaction tran = sesson.getTransaction();
		Person p = new Person();
		p.setPid(1);
		p.setPname("Ravi");
		
		Passport pp = new Passport();
		pp.setPpid(1122);
		pp.setDescription("Indian Passport");
		p.setPassport(pp);
		
		tran.begin();
				sesson.save(p);
				sesson.save(pp);
		tran.commit();
		System.out.println("Record saved succesfully");
	}

}
