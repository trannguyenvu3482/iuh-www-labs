package com.fit.se.dao;

import java.util.List;

import com.fit.se.entity.DeTai;
import com.fit.se.entity.GiangVien;

public interface DeTaiDAO {
	public List<DeTai> getAll();

	public DeTai getByID(String id);

	public void addNewDeTai(DeTai deTai, GiangVien giangVien);

}
