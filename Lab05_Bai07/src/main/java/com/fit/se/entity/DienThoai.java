package com.fit.se.entity;

import java.io.Serializable;

import org.hibernate.validator.constraints.Range;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class DienThoai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "madt")
	@NotNull(message = "Mã điện thoại không được để trống")
	private int maDienThoai;

	@Column(name = "tendt")
	@NotEmpty(message = "Tên điện thoại không được để trống")
	@Pattern(regexp = "^[A-Za-z0-9 ]+$", message = "Tên điện thoại không hợp lệ")
	private String tenDienThoai;

	@Range(min = 1000, max = 9999, message = "Năm sản xuất phải có 4 chữ số")
	private int namSanXuat;

	@NotEmpty(message = "Cấu hình không được để trống")
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
