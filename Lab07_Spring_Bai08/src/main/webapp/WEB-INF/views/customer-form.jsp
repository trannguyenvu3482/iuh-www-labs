<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>Document</title>
</head>
<body class="container">
    <div id="header">
        <h2 style="text-align: center;padding-top: 10px">CRM - Customer Relationship Manager</h2>
    </div>
    <div id="container">
        <div id="content">
            <%--@elvariable id="customer" type="com.fit.se.demo.entity.Customer"--%>
            <form:form action="saveCustomer" modelAttribute="customer" method="post" class="form-horizontal">
                <form:hidden path="id"/>
                <table>
                    <tbody>
                        <tr>
                            <td>First Name:</td>
                            <td><form:input path="firstName" class="form-control"/></td>
                        </tr>
                        <tr>
                            <td>Last Name:</td>
                            <td><form:input path="lastName" class="form-control"/></td>
                        </tr>
                        <tr>
                            <td>Email:</td>
                            <td><form:input path="email" class="form-control"/></td>
                        </tr>
                    </tbody>
                </table>
                <input type="submit" value="Save" class="btn btn-primary mt-2 "/>
                <a class="btn btn-secondary mt-2" href="${pageContext.request.contextPath}/customer/list">Back to list</a>
            </form:form>
        </div>
    </div>
</body>
</html>