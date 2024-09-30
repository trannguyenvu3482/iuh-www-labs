package com.fit.se.beans;

public class CartItemBean {
	private String modelID;
	private String modelDescription;
	private double modelPrice;
	private int quantity;
	private double total;

	public CartItemBean() {
	}

	public CartItemBean(String modelID, String modelDescription, double modelPrice, int quantity) {
		this.modelID = modelID;
		this.modelDescription = modelDescription;
		this.modelPrice = modelPrice;
		this.quantity = quantity;
		this.total = modelPrice * quantity;
	}

	public String getModelID() {
		return modelID;
	}

	public void setModelID(String modelID) {
		this.modelID = modelID;
	}

	public String getModelDescription() {
		return modelDescription;
	}

	public void setModelDescription(String modelDescription) {
		this.modelDescription = modelDescription;
	}

	public double getModelPrice() {
		return modelPrice;
	}

	public void setModelPrice(double modelPrice) {
		this.modelPrice = modelPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "CartItemBean{" + "modelID='" + modelID + '\'' + ", modelDescription='" + modelDescription + '\''
				+ ", modelPrice=" + modelPrice + ", quantity=" + quantity + ", total=" + total + '}';
	}
}
