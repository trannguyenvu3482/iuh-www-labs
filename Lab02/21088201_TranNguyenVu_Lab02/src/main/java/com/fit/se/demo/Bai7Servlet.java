package com.fit.se.demo;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(name = "bai7Servlet ", value = "/bai7-servlet")
@MultipartConfig(maxFileSize = 16177215)
public class Bai7Servlet extends HttpServlet {
    public static final int BUFFER_SIZE = 4096;
    public static final String UPLOAD_PATH = "upload";
    private String message;

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

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        Part filePart = request.getPart("photo");
        InputStream inputStream = null;
        String fileUploadName = "";
        if (filePart != null) {
            fileUploadName = filePart.getName();
            inputStream = filePart.getInputStream();
        }

        Connection conn = null;
        String message = null;

        String filePath = getServletContext().getRealPath("") + UPLOAD_PATH;

        if (!new File(filePath).exists()) {
            boolean result = new File(filePath).mkdir();

            if (result) {
                System.out.println("Directory created");
            } else {
                System.out.println("Directory not created");
            }
        }

        try {
            DriverManager.registerDriver(new SQLServerDriver());
            String dbUser = "sa";
            String dbPass = "!Nguyenvu123";
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=UploadFileServletDB;encrypt=false";
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);

            String sql = "INSERT INTO contacts (first_name, last_name, photo) values (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, firstName);
            statement.setString(2, lastName);

            if (inputStream != null) {
                statement.setBlob(3, inputStream);
            }
            int row = statement.executeUpdate();
            if (row > 0) {
                message = "File uploaded and saved into database";
            }

            // Read
            String sql1 = "SELECT photo FROM contacts WHERE first_name=? AND last_name=?";
            PreparedStatement statement1 = conn.prepareStatement(sql1);
            statement1.setString(1, firstName);
            statement1.setString(2, lastName);

            ResultSet result = statement1.executeQuery();
            if (result.next()) {
                InputStream inputStream1 = result.getBinaryStream("photo");
                OutputStream outputStream = new FileOutputStream(filePath + File.separator + fileUploadName);

                System.out.println("filePath: " + filePath + File.separator + fileUploadName);
                byte[] buffer = new byte[BUFFER_SIZE];
                int bytesRead = -1;

                while ((bytesRead = inputStream1.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

                inputStream1.close();
                outputStream.close();
            }
        } catch (Exception ex) {
            message = "ERROR: " + ex.getMessage();
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/message.jsp").forward(request, response);
        }
    }

    public void destroy() {
    }
}