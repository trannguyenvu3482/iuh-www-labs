package com.fit.se.controllers;

import java.io.IOException;
import java.util.List;

import com.fit.se.dao.DeTaiDAO;
import com.fit.se.dao.impl.DeTaiDAOImpl;
import com.fit.se.entity.DeTai;
import com.fit.se.util.HibernateUtil;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeController
 */

@WebServlet("/home-controller")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DeTaiDAO deTaiDAO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeController() {
		super();
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		super.init(arg0);
		HibernateUtil.getSessionFactory();
		deTaiDAO = new DeTaiDAOImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Set deTaiList in session scope
		List<DeTai> listDeTai = deTaiDAO.getAll();
		System.out.println(listDeTai.size());
		request.setAttribute("listDeTai", listDeTai);
		request.getRequestDispatcher("DeTai.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
