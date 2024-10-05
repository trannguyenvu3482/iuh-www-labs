package com.fit.se.entity;

import java.util.ArrayList;
import java.util.List;

public class ListDienThoai {
	private List<DienThoai> listDienThoai;

	public ListDienThoai() {
		setListDienThoai(new ArrayList<>());
	}

	public List<DienThoai> getListDienThoai() {
		return listDienThoai;
	}

	public void setListDienThoai(List<DienThoai> listDienThoai) {
		this.listDienThoai = listDienThoai;
	}

	public void addDienThoai(DienThoai dt) {
		listDienThoai.add(dt);
	}

	public void removeDienThoai(DienThoai dt) {
		listDienThoai.remove(dt);
	}

	public void removeDienThoai(int index) {
		listDienThoai.remove(index);
	}

	@Override
	public String toString() {
		return "ListDienThoai [listDienThoai=" + listDienThoai + "]";
	}

}
