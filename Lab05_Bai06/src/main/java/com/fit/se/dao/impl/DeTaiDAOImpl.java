package com.fit.se.dao.impl;

import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.fit.se.dao.DeTaiDAO;
import com.fit.se.entity.DeTai;
import com.fit.se.entity.GiangVien;
import com.fit.se.util.HibernateUtil;

public class DeTaiDAOImpl implements DeTaiDAO {
	private SessionFactory factory;

	public DeTaiDAOImpl() {
		factory = HibernateUtil.getSessionFactory();
	}

	@Override
	public List<DeTai> getAll() {
		Session session = factory.getCurrentSession();
		Transaction t = session.beginTransaction();

		try {
			List<DeTai> deTaiList = session.createQuery("from detai", DeTai.class).getResultList();
			t.commit();
			return deTaiList;
		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
			return Collections.emptyList();
		}
	}

	@Override
	public DeTai getByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNewDeTai(DeTai deTai, GiangVien giangVien) {
		// TODO Auto-generated method stub

	}

}
