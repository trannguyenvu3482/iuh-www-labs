package com.fit.se.controllers;

import java.io.IOException;
import java.util.List;

import com.fit.se.dao.DienThoaiDAO;
import com.fit.se.dao.impl.DienThoaiDaoImpl;
import com.fit.se.entity.DienThoai;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PhoneLítServlet
 */
@WebServlet("/phone-list")
public class PhoneListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DienThoaiDAO dienThoaiDAO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PhoneListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		super.init(arg0);
		dienThoaiDAO = new DienThoaiDaoImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<DienThoai> listDienThoai = dienThoaiDAO.getAllDienThoai();
		request.setAttribute("listDienThoai", listDienThoai);
		request.getRequestDispatcher("phone-list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);

		String search = request.getParameter("search");
		List<DienThoai> listDienThoai = dienThoaiDAO.findDienThoaiByTenDT(search);
		request.setAttribute("listDienThoai", listDienThoai);
		request.getRequestDispatcher("phone-list.jsp").forward(request, response);
	}

}
