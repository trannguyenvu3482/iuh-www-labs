<%--
  Created by IntelliJ IDEA.
  User: trannguyenvu3482
  Date: 05/09/2024
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bài 6</title>
    <script src="https://cdn.tailwindcss.com/"></script>

</head>
<body>
<div class="flex justify-center items-center flex-col">
    <h1 class="text-2xl font-bold mb-4">Upload multi-files</h1>

    <form class="flex flex-col justify-center items-center" action="${pageContext.request.contextPath}/bai6-servlet"
          enctype="multipart/form-data"
          method="post">
        <div class="flex gap-2">
            <span>File #1: </span>
            <input type="file" id="file1" name="filename">
        </div>
        <div class="flex gap-2">
            <span>File #2: </span>
            <input type="file" id="file2" name="filename">
        </div>
        <div class="flex gap-2">
            <span>File #3: </span>
            <input type="file" id="file3" name="filename">
        </div>
        <div class="flex gap-2">
            <span>File #4: </span>
            <input type="file" id="file4" name="filename">
        </div>
        <div class="flex gap-2">
            <span>File #5: </span>
            <input type="file" id="file5" name="filename">
        </div>
        <div class="flex gap-2 mt-4">
            <button type="submit"
                    class="text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 me-2 mb-2 dark:bg-blue-600 dark:hover:bg-blue-700 focus:outline-none dark:focus:ring-blue-800">
                Submit
            </button>

            <button type="button"
                    class="text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 me-2 mb-2 dark:bg-blue-600 dark:hover:bg-blue-700 focus:outline-none dark:focus:ring-blue-800">
                Reset
            </button>
        </div>
    </form>
</div>
</body>
</html>
