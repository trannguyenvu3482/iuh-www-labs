<jsp:useBean id="student" scope="request" type="com.fit.se.springmvc.demo.Student"/>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: trannguyenvu482
  Date: 1/10/2024
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/htmL; chorset=UTF-8">
    <title>Welcome to Spring Web MVC project</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        <table>
            <tr>
                <td>First Name</td>
                <td><form:input path="firstName"/>
                    <form:errors path="firstName"/></td>
            </tr>
            <tr>
                <td>Last Name
                <td><form:input path="lastName"/></td>
            </tr>
            <tr>
                <td>Country</td>
                <td>
                    <form:select path="country">
                        <form:options items="${student.countryOptions}"/>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td>Favorite Language</td>
                <td><form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/></td>
            </tr>
            <tr>
                <td>Operating Systems</td>
                <td>
                <form:checkboxes path="operatingSystems" items="${student.operatingSystemOptions}"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Submit"/>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
