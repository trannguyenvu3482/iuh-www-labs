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
 * Servlet implementation class ManagePhoneServlet
 */

@WebServlet("/manage-phone")
public class ManagePhoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DienThoaiDAO dienThoaiDAO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ManagePhoneServlet() {
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
		String action = request.getParameter("action");

		System.out.println("ManagePhoneServlet: action = " + action);

		if (action != null && action.equals("delete")) {
			int id = -1;
			try {
				id = Integer.parseInt(request.getParameter("id"));
				if (dienThoaiDAO.deleteDienThoaiByID(id)) {
					System.out.println("ManagePhoneServlet: Xóa thành công");
					request.setAttribute("message", "Xóa thành công");
				} else {
					System.out.println("ManagePhoneServlet: Xóa thất bại");
					request.setAttribute("message", "Xóa thất bại");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		List<DienThoai> listDienThoai = dienThoaiDAO.getAllDienThoai();
		request.setAttribute("listDienThoai", listDienThoai);
		request.getRequestDispatcher("manage.jsp").forward(request, response);
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
