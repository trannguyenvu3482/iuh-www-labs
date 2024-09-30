package com.fit.se.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.fit.se.beans.Product;
import com.fit.se.dao.ProductDAO;

public class ProductDAOImpl implements ProductDAO {
	private DataSource dataSource;

	public ProductDAOImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Product> getAllProducts() {
		String sql = "SELECT * FROM product";
		List<Product> products = new ArrayList<Product>();

		try {
			Connection con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("id"));
				product.setModel(rs.getString("model"));
				product.setDescription(rs.getString("description"));
				product.setQuantity(rs.getInt("quantity"));
				product.setPrice(rs.getDouble("price"));
				product.setImgURL(rs.getString("imgurl"));
				products.add(product);
			}

			return products;
		} catch (Exception e) { // SQLException
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Product getProductById(int id) {
		return null;
	}

	@Override
	public void addProduct(Product product) {
		String sql = "INSERT INTO postgres.public.product (model, description, quantity, price, imgurl) VALUES (?, ?, ?, ?, ?)";

		try {
			Connection con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, product.getModel());
			ps.setString(2, product.getDescription());
			ps.setInt(3, product.getQuantity());
			ps.setDouble(4, product.getPrice());
			ps.setString(5, product.getImgURL());
			ps.executeUpdate();
		} catch (Exception e) { // SQLException
			e.printStackTrace();
		}
	}

	@Override
	public void updateProduct(Product product) {

	}

	@Override
	public void deleteProduct(int id) {

	}
}
