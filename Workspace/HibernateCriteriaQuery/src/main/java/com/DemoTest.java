package com;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class DemoTest {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
//		// Retrieve all object 
//		Criteria cr	= session.createCriteria(Employee.class);
//		List<Employee> listOfEmp = cr.list();
//		System.out.println("Number of Employee "+listOfEmp.size());
//		listOfEmp.forEach(e->System.out.println(e));
		
		
//		// Retrieve all object with condition 
//		Criteria cr	= session.createCriteria(Employee.class);
//		
//		//Criterion cc = Restrictions.gt("salary", 15000f);
//		//Criterion cc = Restrictions.between("id", 103, 104);
//		//Criterion cc = Restrictions.and(Restrictions.like("name", "Ram"),Restrictions.eq("id", 101));
//		Criterion cc = Restrictions.or(Restrictions.like("name", "Ram"),Restrictions.eq("id", 104));
//		cr.add(cc);
//		List<Employee> listOfEmp = cr.list();
//		System.out.println("Number of Employee "+listOfEmp.size());
//		listOfEmp.forEach(e->System.out.println(e));
		
		// Retrieve only one property ie name 
//		Criteria cr	= session.createCriteria(Employee.class);
//		cr.setProjection(Projections.property("name"));
//		List<String> listOfEmp = cr.list();
//		System.out.println("Number of Employee "+listOfEmp.size());
//		listOfEmp.forEach(e->System.out.println(e));
		
		// Retrieve two property name,salary 
//		Criteria cr	= session.createCriteria(Employee.class);
//		Projection p1 = Projections.property("name");
//		Projection p2 = Projections.property("salary");
//		ProjectionList pp = Projections.projectionList();
//		pp.add(p1); 
//		pp.add(p2);
//		cr.setProjection(pp);
//		List<Object[]> listOfEmp = cr.list();
//		System.out.println("Number of Employee "+listOfEmp.size());
//		listOfEmp.forEach(e->System.out.println("Name "+e[0]+" Salary "+e[1]));

		// Aggregate function using Criteria 
		Criteria cr	= session.createCriteria(Employee.class);
		//cr.setProjection(Projections.max("salary"));
		//cr.setProjection(Projections.min("salary"));
		cr.setProjection(Projections.sum("salary"));
		
		List<Float> ll =cr.list();
		System.out.println("salary "+ll.get(0));
		
	}

}
