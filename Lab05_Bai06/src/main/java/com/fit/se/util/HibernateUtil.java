package com.fit.se.util;

import org.hibernate.SessionFactory;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}

	public static void shutdown() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
