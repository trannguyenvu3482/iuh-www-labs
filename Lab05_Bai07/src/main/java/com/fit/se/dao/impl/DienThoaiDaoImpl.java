package com.fit.se.dao.impl;

import java.util.Collections;
import java.util.List;

import com.fit.se.dao.DienThoaiDAO;
import com.fit.se.entity.DienThoai;
import com.fit.se.util.HibernateUtil;

import jakarta.persistence.EntityManager;

public class DienThoaiDaoImpl implements DienThoaiDAO {
	private EntityManager em;

	public DienThoaiDaoImpl() {
		em = new HibernateUtil().getEntityManager();
	}

	@Override
	public boolean insertDienThoai(DienThoai dt) {
		try {
			em.getTransaction().begin();
			em.persist(dt);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteDienThoaiByID(int id) {
		try {
			em.getTransaction().begin();
			DienThoai dt = em.find(DienThoai.class, id);
			em.remove(dt);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public DienThoai getDienThoaiByID(int id) {
		try {
			em.getTransaction().begin();
			DienThoai dt = em.find(DienThoai.class, id);
			em.getTransaction().commit();
			return dt;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<DienThoai> getAllDienThoai() {
		try {
			em.getTransaction().begin();
			List<DienThoai> list = em.createQuery("FROM DienThoai", DienThoai.class).getResultList();
			em.getTransaction().commit();
			return list;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			return Collections.emptyList();
		}
	}

}
