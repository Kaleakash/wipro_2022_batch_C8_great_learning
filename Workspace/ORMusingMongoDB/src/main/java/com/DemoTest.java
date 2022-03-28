package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DemoTest {

	public static void main(String[] args) {
		/*
		 * Configuration con = new Configuration();
		 * con.configure("hiberante.cfg.xml");
		 * SessionFactory sf= con.buildSessionFactory();
		 * Session session  = sf.openSession();
		 * Transaction tran = session.getTransaction();
		 * tran.begin();
		 * 		session.save(emp);
		 * tran.commit();
		 */
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Project pp = new Project();
		pp.setPid(100);
		pp.setProject("Python");
		tran.begin();
				manager.persist(pp);			// save method;
		tran.commit();
		System.out.println("Record inserted successfully");
		
		/*
		 * 
		 * manager.merge(pp);		it is like a update 
		 * manager.remove(pp); 		it is like a delete 
		 * manager.find(Project.class,100);				it is like a get method 
		 * manager.createQuery("select p from Project p);		like a HQL 
		 * 
		 */
	}

}
