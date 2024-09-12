<%--
  Created by IntelliJ IDEA.
  User: trannguyenvu3482
  Date: 11/09/2024
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bài 7</title>
    <link rel="stylesheet" href="./style.css">
</head>
<body>
<div class="container">
    <h1 class="title">File Upload to Database
        <br>(multipart/form-data)
    </h1>

    <form action="${pageContext.request.contextPath}/bai7-servlet" method="post" enctype="multipart/form-data">
        <div class="input-control">
            <label for="firstName">First name:</label>
            <input type="text" id="firstName" name="firstName">
        </div>
        <div class="input-control">
            <label for="lastName">Last name:</label>
            <input type="text" id="lastName" name="lastName">
        </div>
        <div class="input-control">
            <label for="photo">Portrait photo:</label>
            <input type="file" id="photo" name="photo">
        </div>
        <input type="submit" value="Save">
    </form>
</div>
</body>
</html>
