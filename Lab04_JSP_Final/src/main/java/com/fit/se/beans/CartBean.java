package com.fit.se.beans;

import java.util.ArrayList;

public class CartBean {
	private ArrayList<CartItemBean> cartItems = new ArrayList<CartItemBean>();
	private double orderTotal = 0;

	public int getLineItemCount() {
		return cartItems.size();
	}

	public void addCartItem(String id, String name, String price, String quantity) {
		double totalCost = 0.0;
		double unitCost = 0.0;
		int qty = 0;
		CartItemBean cartItem = new CartItemBean();
		try {
			unitCost = Double.parseDouble(price);
			qty = Integer.parseInt(quantity);

			if (qty > 0) {
				totalCost = unitCost * qty;
				cartItem.setModelID(id);
				cartItem.setModelDescription(name);
				cartItem.setQuantity(qty);
				cartItem.setModelPrice(unitCost);
				cartItem.setTotal(totalCost);
				cartItems.add(cartItem);
				calculateOrderTotal();
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public void updateCartItem(String index, String quantity) {
		double totalCost = 0.0;
		double unitCost = 0.0;
		try {
			int itemQuantity = Integer.parseInt(quantity);

			if (itemQuantity > 0) {
				CartItemBean cartItem = findByModelID(index);
				unitCost = cartItem.getModelPrice();
				totalCost = unitCost * itemQuantity;
				cartItem.setQuantity(itemQuantity);
				cartItem.setTotal(totalCost);
				calculateOrderTotal();
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public CartItemBean findByModelID(String modelID) {
		for (CartItemBean cartItem : cartItems) {
			if (cartItem.getModelID().equals(modelID)) {
				return cartItem;
			}
		}
		return null;
	}

	public void removeCartItem(String index) {
		try {
			CartItemBean cartItem = findByModelID(index);
			cartItems.remove(cartItem);
			calculateOrderTotal();

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<CartItemBean> getCartItems() {
		return cartItems;
	}

	public void setCartItems(ArrayList<CartItemBean> cartItems) {
		this.cartItems = cartItems;
	}

	public void calculateOrderTotal() {
		double total = 0;
		for (CartItemBean cartItem : cartItems) {
			total += cartItem.getTotal();
		}
		setOrderTotal(total);
	}

	public double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}
}
