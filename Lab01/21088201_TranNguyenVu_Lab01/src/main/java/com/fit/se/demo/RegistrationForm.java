package com.fit.se.demo;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "registrationForm", value = "/registration-form/result")
public class RegistrationForm extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>Registration Form</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Registration Form</h1>\n" +
                "<p>Username: " + username + "</p>\n" +
                "<p>Password: " + password + "</p>\n" +
                "</body>\n" +
                "</html>";

        out.println(html);
    }

    public void destroy() {
    }
}