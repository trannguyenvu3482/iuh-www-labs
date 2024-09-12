<%@ page import="com.fit.se.lab03.entity.Student" %>
<%@ page import="java.util.Arrays" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Result submit</title>
</head>
<body>
    <%
        Student student = new Student();
        student = (Student) request.getAttribute("student");
        out.println("First name:" + student.getFirstName()
                + "<br/> Last name: " + student.getLastName()
                + "<br/> Email : " + student.getEmail()
                + "<br/> Gender: " + student.getGender()
                + "<br/> Hobbies: " + Arrays.toString(student.getHobbies())
                + "<br/> Birthday: " + student.getDay() + "/" + student.getMonth() + "/" + student.getYear()
        );
    %>
</body>
</html>