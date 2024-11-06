<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: trannguyenvu3482
  Date: 01/11/2024
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <i>
        Fill out the form. Asterisk (*) means required.
    </i>
    <br>
    <table>
        <form:form action="processForm" method="post" modelAttribute="customer">
            <tr>
                <td>First Name</td>
                <td><form:input type="text" path="firstName" />
                </td>
            </tr>
            <tr>
                <td>Last Name (*)</td>
                <td><form:input type="text" path="lastName" />
                    <form:errors path="lastName" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <td>Free passes</td>
                <td><form:input type="text" path="freePasses"/>
                    <form:errors path="freePasses" cssClass="error"/>
                </td>
            <tr>
                <td>Postal code</td>
                <td><form:input type="text" path="postalCode"/>
                    <form:errors path="postalCode" cssClass="error"/>
                </td>
            </tr>
            <tr>
                <td>Course code</td>
                <td><form:input type="text" path="courseCode"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Submit"/>
                </td>
            </tr>
        </form:form>
    </table>
</body>
</html>
