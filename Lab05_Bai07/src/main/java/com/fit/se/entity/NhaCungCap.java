package com.fit.se.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NhaCungCap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mancc")
	private int maNhaCungCap;

	@Column(name = "tennhacc")
	private String tenNhaCungCap;
	private String diaChi;
	private String soDienThoai;

	public NhaCungCap() {
	}

	public NhaCungCap(int maNhaCungCap, String tenNhaCungCap, String diaChi, String soDienThoai) {
		this.maNhaCungCap = maNhaCungCap;
		this.tenNhaCungCap = tenNhaCungCap;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}

	public NhaCungCap(String tenNhaCungCap, String diaChi, String soDienThoai) {
		this.tenNhaCungCap = tenNhaCungCap;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}

	public int getMaNhaCungCap() {
		return maNhaCungCap;
	}

	public void setMaNhaCungCap(int maNhaCungCap) {
		this.maNhaCungCap = maNhaCungCap;
	}

	public String getTenNhaCungCap() {
		return tenNhaCungCap;
	}

	public void setTenNhaCungCap(String tenNhaCungCap) {
		this.tenNhaCungCap = tenNhaCungCap;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "NhaCungCap [maNhaCungCap=" + maNhaCungCap + ", tenNhaCungCap=" + tenNhaCungCap + ", diaChi=" + diaChi
				+ ", soDienThoai=" + soDienThoai + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(maNhaCungCap);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhaCungCap other = (NhaCungCap) obj;
		return maNhaCungCap == other.maNhaCungCap;
	}

}
