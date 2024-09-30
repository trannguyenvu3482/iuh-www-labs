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

@WebServlet(name = "CartItemControllerServlet", value = "/cart")
public class CartItemController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name = "jdbc/postgres")
	private DataSource dataSource;
	private ProductDAO productDAO;

	public CartItemController() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		productDAO = new ProductDAOImpl(dataSource);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		String action = request.getParameter("action") != null ? request.getParameter("action") : "";

		switch (action) {
		case "buy":
			break;
		case "remove":
			break;
		case "update":
			break;
		default:
			break;
		}
	}

	public void destroy() {
	}
}