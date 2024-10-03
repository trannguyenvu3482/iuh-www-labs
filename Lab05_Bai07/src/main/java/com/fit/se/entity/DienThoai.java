package com.fit.se.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DienThoai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "madt")
	private int maDienThoai;

	@Column(name = "tendt")
	private String tenDienThoai;
	private int namSanXuat;
	private String cauHinh;

	@ManyToOne
	@JoinColumn(name = "mancc")
	private NhaCungCap nhaCungCap;

	public DienThoai() {
	}

	public DienThoai(String tenDienThoai, int namSanXuat, String cauHinh, NhaCungCap nhaCungCap) {
		super();
		this.tenDienThoai = tenDienThoai;
		this.namSanXuat = namSanXuat;
		this.cauHinh = cauHinh;
		this.nhaCungCap = nhaCungCap;
	}

	public DienThoai(int maDienThoai, String tenDienThoai, int namSanXuat, String cauHinh, NhaCungCap nhaCungCap) {
		super();
		this.maDienThoai = maDienThoai;
		this.tenDienThoai = tenDienThoai;
		this.namSanXuat = namSanXuat;
		this.cauHinh = cauHinh;
		this.nhaCungCap = nhaCungCap;
	}

	public int getMaDienThoai() {
		return maDienThoai;
	}

	public void setMaDienThoai(int maDienThoai) {
		this.maDienThoai = maDienThoai;
	}

	public String getTenDienThoai() {
		return tenDienThoai;
	}

	public void setTenDienThoai(String tenDienThoai) {
		this.tenDienThoai = tenDienThoai;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public String getCauHinh() {
		return cauHinh;
	}

	public void setCauHinh(String cauHinh) {
		this.cauHinh = cauHinh;
	}

	public NhaCungCap getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(NhaCungCap nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "DienThoai [maDienThoai=" + maDienThoai + ", tenDienThoai=" + tenDienThoai + ", namSanXuat=" + namSanXuat
				+ ", cauHinh=" + cauHinh + ", nhaCungCap=" + nhaCungCap + "]";
	}

}
