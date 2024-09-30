package com.fit.se.controllers;

import java.io.IOException;

import javax.sql.DataSource;

import com.fit.se.dao.ProductDAO;
import com.fit.se.dao.impl.ProductDAOImpl;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ProductController", value = "/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name = "jdbc/postgres")
	private DataSource dataSource;
	private ProductDAO productDAO;

	public ProductController() {
		super();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		try {
			System.out.println(this.dataSource.getConnection());
		} catch (Exception e) {
			throw new ServletException(e);
		}

		productDAO = new ProductDAOImpl(dataSource);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Product p1 = new Product(1, "iPhone 12", "Apple iPhone 12", 10, 1000, "iphone12.jpg");
//		Product p2 = new Product(2, "Samsung Galaxy S21", "Samsung Galaxy S21", 20, 900, "s21.jpg");
//		Product p3 = new Product(3, "Google Pixel 5", "Google Pixel 5", 15, 800, "pixel5.jpg");
//
//		productDAO.addProduct(p1);
//		productDAO.addProduct(p2);
//		productDAO.addProduct(p3);

		req.setAttribute("products", productDAO.getAllProducts());
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
