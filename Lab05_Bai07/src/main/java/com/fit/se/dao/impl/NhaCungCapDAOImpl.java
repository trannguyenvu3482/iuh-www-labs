package com.fit.se.dao.impl;

import com.fit.se.dao.NhaCungCapDAO;
import com.fit.se.entity.NhaCungCap;
import com.fit.se.util.HibernateUtil;

import jakarta.persistence.EntityManager;

public class NhaCungCapDAOImpl implements NhaCungCapDAO {
	private EntityManager em;

	public NhaCungCapDAOImpl() {
		em = new HibernateUtil().getEntityManager();
	}

	@Override
	public NhaCungCap getNhaCungCapByID(int id) {
		try {
			return em.find(NhaCungCap.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
