<%@ page import="java.util.Calendar" %><%--
  Created by IntelliJ IDEA.
  User: trannguyenvu3482
  Date: 05/09/2024
  Time: 07:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP TailwindCSS</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
<div class="h-full w-full flex justify-center items-center flex-col">

    <h1 class="text-4xl font-bold">Test JSP</h1>
    <h2>Today is <%=Calendar.getInstance().getTime().toString()%>
    </h2>
    <button class="px-4 py-2 bg-gray-200 rounded-md" onclick={alert("Hi")}>
        Test
    </button>
</div>
</body>
</html>
