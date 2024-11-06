<%--
  Created by IntelliJ IDEA.
  User: trannguyenvu3482
  Date: 31/10/2024
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World - Input Form</title>
</head>
<body>
    <form action="processForm" method="post">
        <label for="studentName">Student Name:</label>
        <input type="text" name="studentName" id="studentName" placeholder="What's your name?">
        <input type="submit" value="Submit">
    </form>
</body>
</html>
