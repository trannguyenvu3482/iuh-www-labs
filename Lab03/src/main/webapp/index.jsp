<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <div>
        <h1><%= "Hello World!" %>
        </h1>
        <br/>
        <a href="${pageContext.request.contextPath}/bai1">Bài 1</a>
    </div>
</body>
</html>