package com.fit.se.dao;

import java.util.List;

import com.fit.se.entity.DienThoai;

public interface DienThoaiDAO {
	public boolean insertDienThoai();

	public boolean deleteDienThoaiByID(int id);

	public DienThoai getDienThoaiByID(int id);

	public List<DienThoai> getAllDienThoai();
}
