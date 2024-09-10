package com.fit.se.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;

@WebServlet(name = "bai6Servlet", value = "/bai6-servlet")
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 3,
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 50
)
public class Bai6Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final int THRESHOLD_SIZE = 1024 * 1024 * 3; // 3MB
    private static final int MAX_FILE_SIZE = 1024 * 1024 * 10; // 10MB
    private static final int REQUEST_SIZE = 1024 * 1024 * 50; // 50MB
    private static final String UPLOAD_PATH = "files";
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String uploadPath = getServletContext().getRealPath("") + UPLOAD_PATH;

        for (Part part : request.getParts()) {
            if (part.getSize() == 0) return;
            String filePath = uploadPath + File.separator + part.getSubmittedFileName();
            System.out.println("Path:" + filePath);
            part.write(filePath);
        }

        request.setAttribute("message", "Upload has been done successfully!");
    }

    public void destroy() {
    }
}