package com.fit.se.demo;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ex3Servlet", value = "/ex3-servlet")
public class Ex3 extends HttpServlet {
    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("Name");
        String email = request.getParameter("Email");
        String facebook = request.getParameter("Facebook");
        String shortBio = request.getParameter("ShortBio");
        String html = "<br>"
                + "<html>"
                + "<head>"
                + "<title>Result Page</title>"
                + "</head>"
                + "<body>"
                + "First Name: " + name + "<br>"
                + "Email: " + email + "<br> Facebook URL: " + facebook + "<br>"
                + "Short Bio: " + shortBio + "<br>"
                + "</body>"
                + "</html>";
        out.println(html);
    }

    public void destroy() {
    }
}