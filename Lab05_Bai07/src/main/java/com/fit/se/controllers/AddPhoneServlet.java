package com.fit.se.controllers;

import java.io.IOException;
import java.util.Set;

import com.fit.se.dao.DienThoaiDAO;
import com.fit.se.dao.NhaCungCapDAO;
import com.fit.se.dao.impl.DienThoaiDaoImpl;
import com.fit.se.dao.impl.NhaCungCapDAOImpl;
import com.fit.se.entity.DienThoai;
import com.fit.se.entity.NhaCungCap;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;

/**
 * Servlet implementation class AddPhoneServlet
 */
@WebServlet("/add-phone-servlet")
public class AddPhoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DienThoaiDAO dienThoaiDAO;
	private NhaCungCapDAO nhaCungCapDAO;
	private Validator validator;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddPhoneServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		super.init(arg0);
		validator = Validation.buildDefaultValidatorFactory().getValidator();
		dienThoaiDAO = new DienThoaiDaoImpl();
		nhaCungCapDAO = new NhaCungCapDAOImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("add-phone.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String tenDienThoai = request.getParameter("tenDienThoai");
			String strNamSanXuat = request.getParameter("namSanXuat");
			String cauHinh = request.getParameter("cauHinh");
			String maNCC = request.getParameter("maNCC");

			int namSanXuat = 0;
			NhaCungCap ncc = null;
			try {
				ncc = nhaCungCapDAO.getNhaCungCapByID(Integer.parseInt(maNCC));
				namSanXuat = Integer.parseInt(strNamSanXuat);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			DienThoai dienThoai = new DienThoai(tenDienThoai, namSanXuat, cauHinh, ncc);

			System.out.println(dienThoai);

			Set<ConstraintViolation<DienThoai>> errors = validator.validate(dienThoai);
			if (errors.isEmpty()) {
				if (dienThoaiDAO.insertDienThoai(dienThoai)) {
					request.getRequestDispatcher("phone-list").forward(request, response);
				}
			} else {
				System.out.println(errors);
				request.setAttribute("errors", errors);
				request.getRequestDispatcher("add-phone.jsp").forward(request, response);
			}

			System.out.println("maDienThoai");
		} catch (Exception e) {
			e.printStackTrace();
			request.getRequestDispatcher("add-phone.jsp").forward(request, response);
		}
	}
}
