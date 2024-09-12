<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <script src="https://cdn.tailwindcss.com/"></script>
</head>
<body class="p-8 flex flex-col">
<h1 class="font-bold text-2xl">Trần Nguyên Vũ - 21088201 - Lab 02</h1>
<a href="bai6" class="font-medium text-blue-600 dark:text-blue-500 hover:underline block">Bài 6</a>
<a href="bai7" class="font-medium text-blue-600 dark:text-blue-500 hover:underline block">Bài 7 </a>
<a href="${pageContext.request.contextPath}/bai8-servlet"
   class="font-medium text-blue-600 dark:text-blue-500 hover:underline block">Bài 8</a>
</body>
</html>