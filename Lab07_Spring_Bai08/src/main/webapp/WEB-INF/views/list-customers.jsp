<jsp:useBean id="customers" scope="request" type="java.util.List"/>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
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
            <input type="button" value="Add customer"
                   onclick="window.location.href = 'showFormForAdd'; return false;" class="btn btn-secondary">

            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>

                    <c:forEach var="customer" items="${customers}">
                        <c:url value="/customer/showFormForUpdate" var="updateLink">
                            <c:param name="customerId" value="${customer.id}"/>
                        </c:url>
                        <c:url value="/customer/delete" var="deleteLink">
                            <c:param name="customerId" value="${customer.id}"/>
                        </c:url>
                        <tr>
                            <td>${customer.firstName}</td>
                            <td>${customer.lastName}</td>
                            <td>${customer.email}</td>
                            <td>
                                <a class="btn btn-primary" href="${updateLink}">Update</a>
                                <a class="btn btn-danger" href="${deleteLink}" onclick="if (!(confirm('Are you sure you want to delete this customer'))) return false">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>