package com.fit.se.dao;

import java.util.List;

import com.fit.se.beans.Product;

public interface ProductDAO {
	public List<Product> getAllProducts();

	public Product getProductById(int id);

	public void addProduct(Product product);

	public void updateProduct(Product product);

	public void deleteProduct(int id);
}
