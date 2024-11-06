<jsp:useBean id="customer" scope="request" type="com.fit.se.springmvc.demo.Customer"/>
<%--
  Created by IntelliJ IDEA.
  User: trannguyenvu3482
  Date: 01/11/2024
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    The customer is confirmed: ${customer.firstName} ${customer.lastName}
    <br>
    <br>
    Free passes: ${customer.freePasses}
    <br>
    <br>
    Postal code: ${customer.postalCode}
    <br>
    <br>
    Course code: ${customer.courseCode}
    <br>
</body>
</html>
