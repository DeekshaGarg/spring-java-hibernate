package com.hibernate_training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate_training.model.Employee;

public class Test {

	public static void main(String[] args) {

		SessionFactory sf = null;
		Session s = null;
		Transaction tx = null;

		sf = new Configuration().configure().buildSessionFactory();
		s = sf.openSession();

		Employee emp = new Employee();
		emp.setEmail("a@gmail.com");
		emp.setName("aaa");
		try {
			tx = s.beginTransaction();

			emp.setId(5555);
			s.save(emp);

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

}
