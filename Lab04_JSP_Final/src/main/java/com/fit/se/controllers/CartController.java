package com.fit.se.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import com.fit.se.beans.CartBean;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "CartControllerServlet", value = "/CartController")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String message;

	@Override
	public void init() {
		message = "Hello World!";
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");

		// Hello
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>" + message + "</h1>");
		out.println("</body></html>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		if (action != null && !action.equals("")) {
			if (action.equals("add")) {
				addToCart(request);
			} else if (action.equals("update")) {
				updateCart(request);
			} else if (action.equals("remove")) {
				deleteCart(request);
			}
		}

		response.sendRedirect("/demo/cart.jsp");
	}

	protected void addToCart(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		String model = request.getParameter("model");
		String price = request.getParameter("price");
		String quantity = request.getParameter("quantity");

		System.out.println("id: " + id);
		System.out.println("model: " + model);

		CartBean cartBean = null;
		Object objCartBean = session.getAttribute("cart");

		if (objCartBean != null) {
			cartBean = (CartBean) objCartBean;
		} else {
			cartBean = new CartBean();
			session.setAttribute("cart", cartBean);
		}

		cartBean.addCartItem(id, model, price, quantity);
	}

	protected void updateCart(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String index = request.getParameter("index");
		String quantity = request.getParameter("quantity");

		System.out.println("index: " + index);

		CartBean cartBean = null;
		Object objCartBean = session.getAttribute("cart");

		if (objCartBean != null) {
			cartBean = (CartBean) objCartBean;
			cartBean.updateCartItem(index, quantity);
		}
	}

	protected void deleteCart(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String index = request.getParameter("index");

		CartBean cartBean = null;
		Object objCartBean = session.getAttribute("cart");

		if (objCartBean != null) {
			cartBean = (CartBean) objCartBean;
			cartBean.removeCartItem(index);
		}
	}

	public void destroy() {
	}
}