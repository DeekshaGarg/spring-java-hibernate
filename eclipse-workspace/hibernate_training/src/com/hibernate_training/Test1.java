package com.hibernate_training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate_training.model.Employee;

public class Test1 {

	public static void main(String[] args) {
		SessionFactory sf = null;
		Session s = null;
		
		sf = new Configuration().configure().buildSessionFactory();
		s = sf.openSession();
		
		Employee emp1=(Employee)s.get(Employee.class, 5555); //doesnot throw exception if record not present in DB, returns null
		Employee emp2=(Employee)s.load(Employee.class, 5555); //throws ObjectNotFoundException if record not present in DB

	}

}
