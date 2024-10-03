package com.fit.se.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "detai")
public class DeTai {
	@Id
	private String maDeTai;

	private String tenDeTai;

	private int namDangKy;

	private String moTaDeTai;

	@ManyToOne
	@JoinColumn(name = "maGV")
	private GiangVien giangVien;

	public DeTai() {
		super();
	}

	public String getMaDeTai() {
		return maDeTai;
	}

	public void setMaDeTai(String maDeTai) {
		this.maDeTai = maDeTai;
	}

	public String getTenDeTai() {
		return tenDeTai;
	}

	public void setTenDeTai(String tenDeTai) {
		this.tenDeTai = tenDeTai;
	}

	public int getNamDangKy() {
		return namDangKy;
	}

	public void setNamDangKy(int namDangKy) {
		this.namDangKy = namDangKy;
	}

	public String getMoTaDeTai() {
		return moTaDeTai;
	}

	public void setMoTaDeTai(String moTaDeTai) {
		this.moTaDeTai = moTaDeTai;
	}

	public GiangVien getGiangVien() {
		return giangVien;
	}

	public void setGiangVien(GiangVien giangVien) {
		this.giangVien = giangVien;
	}

	public DeTai(String maDeTai, String tenDeTai, int namDangKy, String moTaDeTai, GiangVien giangVien) {
		super();
		this.maDeTai = maDeTai;
		this.tenDeTai = tenDeTai;
		this.namDangKy = namDangKy;
		this.moTaDeTai = moTaDeTai;
		this.giangVien = giangVien;
	}

	@Override
	public String toString() {
		return "DeTai [maDeTai=" + maDeTai + ", tenDeTai=" + tenDeTai + ", namDangKy=" + namDangKy + ", moTaDeTai="
				+ moTaDeTai + ", giangVien=" + giangVien + "]";
	}

}
