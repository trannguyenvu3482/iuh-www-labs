package com.fit.se.demo;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

@WebServlet(name = "bai8Servlet", value = "/bai8-servlet")
public class Bai8 extends HttpServlet {

    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String to = "trannguyenvu3483@gmail.com";
        String username = "trannguyenvu3482@gmail.com";
        String smtp = "smtp.gmail.com";
        String port = "587";
        String password = "zyqq aqkk syhd ohen";

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", smtp);
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.smtp.port", port);
        properties.setProperty("mail.smtp.user", username);
        properties.setProperty("mail.smtp.password", password);

        // Authenticator
        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        };

        Session session = Session.getDefaultInstance(properties, authenticator);

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Test mail");

            // MimeBodyPart 1: Body
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("This is message body");

            // MimeBodyPart 2: Attachment
            MimeBodyPart attachmentBodyPart = new MimeBodyPart();
            attachmentBodyPart.attachFile(new File("/home/trannguyenvu3482/Documents/IUH/WWW_Java/Labs/Lab02/21088201_TranNguyenVu_Lab02/file.txt"));

            // Multipart
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(attachmentBodyPart);

            message.setContent(multipart);
            Transport.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
    }
}