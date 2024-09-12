package com.fit.se.lab03;

import com.fit.se.lab03.entity.Student;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Bai1Servlet", value = "/bai1-servlet")
public class Bai1 extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        String fname = request.getParameter("firstName");
        String lname = request.getParameter("lastName");
        String day = request.getParameter("day");
        String month = request.getParameter("month");
        String year = request.getParameter("year");
        String email = request.getParameter("email");
        String mobileNum = request.getParameter("mobile");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String pinCode = request.getParameter("pin");
        String state = request.getParameter("state");
        String country = request.getParameter("country");
        String[] hobbies = request.getParameterValues("hobbies");
        String course = request.getParameter("course");

        Student student = new Student(fname, lname, day, month, year, email, mobileNum, gender, address, city, pinCode, state, country, hobbies, course);
        request.setAttribute("student", student);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/bai1/result.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
    }
}