package com.fit.se.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "giangvien")
public class GiangVien {
	@Id
	private String maGV;

	private String tenGV;

	private String linhVuc;

	private String soDienThoai;

	public GiangVien() {
		super();
	}

	public GiangVien(String maGV, String tenGV, String linhVuc, String soDienThoai) {
		super();
		this.maGV = maGV;
		this.tenGV = tenGV;
		this.linhVuc = linhVuc;
		this.soDienThoai = soDienThoai;
	}

	public String getMaGV() {
		return maGV;
	}

	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}

	public String getTenGV() {
		return tenGV;
	}

	public void setTenGV(String tenGV) {
		this.tenGV = tenGV;
	}

	public String getLinhVuc() {
		return linhVuc;
	}

	public void setLinhVuc(String linhVuc) {
		this.linhVuc = linhVuc;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	@Override
	public String toString() {
		return "GiangVien [maGV=" + maGV + ", tenGV=" + tenGV + ", linhVuc=" + linhVuc + ", soDienThoai=" + soDienThoai
				+ "]";
	}

}
