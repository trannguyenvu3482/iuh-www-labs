package com.fit.se.controllers;

import java.io.IOException;

import javax.sql.DataSource;

import com.fit.se.dao.BookDAO;
import com.fit.se.dao.impl.BookDAOImpl;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookController
 */
@WebServlet("/book-controller")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name = "jdbc/postgres")
	private DataSource dataSource;
	private BookDAO bookDAO;

	@Override
	public void init(ServletConfig conf) throws ServletException {
		// TODO Auto-generated method stub
		super.init(conf);
		try {
			System.out.println(this.dataSource.getConnection());
		} catch (Exception e) {
			throw new ServletException(e);
		}
		bookDAO = new BookDAOImpl(dataSource);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("books", bookDAO.getAllBooks());
		request.getRequestDispatcher("DanhSachSanPham.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
