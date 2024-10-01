package com.fit.se.beans;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<CartItem> cartItems = new ArrayList<>();
	private double orderTotal = 0;

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public void addCartItem(Book book) {
		// Check if the book is already in the cart, if so, increase the quantity
		for (CartItem cartItem : cartItems) {
			if (cartItem.getBook().getId() == book.getId()) {
				cartItem.setQuantity(cartItem.getQuantity() + 1);
				calculateOrderTotal();
				return;
			}
		}

		// If the book is not in the cart, add it
		CartItem cartItem = new CartItem(book, 1);
		cartItems.add(cartItem);
		calculateOrderTotal();
	}

	public void deleteCartItem(int index) {
		cartItems.remove(index);
		calculateOrderTotal();
	}

	public void calculateOrderTotal() {
		double total = 0;
		for (CartItem cartItem : cartItems) {
			total += cartItem.getBook().getPrice() * cartItem.getQuantity();
		}
		orderTotal = total;
	}
}
