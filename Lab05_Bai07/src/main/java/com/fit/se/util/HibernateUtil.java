package com.fit.se.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtil {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	public HibernateUtil() {
		entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		entityManager = entityManagerFactory.createEntityManager();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void close() {
		entityManager.close();
		entityManagerFactory.close();
	}
}
