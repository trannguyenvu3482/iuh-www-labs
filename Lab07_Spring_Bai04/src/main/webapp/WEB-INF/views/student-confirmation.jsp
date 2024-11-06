<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="student" scope="request" type="com.fit.se.springmvc.demo.Student"/>
<%--
  Created by IntelliJ IDEA.
  User: trannguyenvu3482
  Date: 31/10/2024
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    The student is confirmed: ${student.firstName} ${student.lastName}
    <br>
    <br>
    Country: ${student.country}
    <br>
    <br>
    Favorite language: ${student.favoriteLanguage}
    <br>
    <br>
    Operating systems:
    <ul>
        <c:forEach var="os" items="${student.operatingSystems}">
            <li>${os}</li>
        </c:forEach>
        <a href="showForm">Back to form</a>
    </ul>
</body>
</html>
