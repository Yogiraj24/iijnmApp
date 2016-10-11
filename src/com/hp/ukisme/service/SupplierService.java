package com.hp.ukisme.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SupplierService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction().commit();
		//session.close();
		System.out.println("Tables created for u");
	}

}
