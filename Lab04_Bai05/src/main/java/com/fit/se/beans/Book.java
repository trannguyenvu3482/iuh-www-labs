package com.fit.se.beans;

public class Book {
	private int id;
	private String title;
	private double price;
	private int quantity;
	private String imgURL;

	public Book() {
	}

	public Book(int id, String title, double price, int quantity, String imgURL) {
		this.id = id;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
		this.imgURL = imgURL;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + ", quantity=" + quantity + ", imgURL="
				+ imgURL + "]";
	}

}
