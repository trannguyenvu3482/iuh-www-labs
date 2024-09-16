package com.fit.se.lab03;

import com.fit.se.lab03.entity.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "Bai2Servlet", value = "/bai2-servlet")
public class Bai2 extends HttpServlet {
    private String message;
    private String connection = "jdbc:sqlserver://localhost:1433;databaseName=lab03;encrypt=false";
    private String dbUser = "sa";
    private String dbPassword = "!Nguyenvu123";

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String firstName = (String) req.getAttribute("firstName");
        String lastName = (String) req.getAttribute("lastName");
        String email = (String) req.getAttribute("email");
        String password = (String) req.getAttribute("password");
        String month = (String) req.getAttribute("month");
        String day = (String) req.getAttribute("day");
        String year = (String) req.getAttribute("year");
        String birthDate = day + "/" + month + "/" + year;
        String gender = (String) req.getAttribute("gender");

        User user = new User(firstName, lastName, email, password, birthDate, gender);

        // Save user to database
        Connection conn = null;
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            conn = DriverManager.getConnection(connection, dbUser, dbPassword);

            String sql = "INSERT INTO users (first_name, last_name, email, password, birth_date, gender) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, user.getFirstName());
            stmt.setString(2, user.getLastName());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getPassword());
            stmt.setString(5, user.getBirthDate());
            stmt.setString(6, user.getGender());

            int result = stmt.executeUpdate();
            if (result > 0) {
                message = "Insert user successfully";
            } else {
                message = "Insert user failed";
            }

            stmt.close();
            conn.close();
            req.setAttribute("message", message);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/bai2/result.jsp");
            dispatcher.forward(req, resp);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        req.setAttribute("user", user);

        req.getRequestDispatcher("/bai2/result.jsp").forward(req, resp);
    }

    public void destroy() {
    }
}