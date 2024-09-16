<%--
  Created by IntelliJ IDEA.
  User: trannguyenvu3482
  Date: 13/09/2024
  Time: 00:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }

        .container {
            width: 600px;
            border: black 1px solid;
        }

        h1 {
            text-align: center;
            margin-bottom: 8px;
        }

        .row {
            display: flex;
            width: 100%;
            margin-bottom: 4px;
        }


        .full {
            width: 100%;
        }

        .row label {
            display: flex;
            justify-content: center;
            padding: 8px;
            box-sizing: border-box;
        }

        .row label > select {
            width: auto;
            padding: 8px;
            box-sizing: border-box;
        }

        .row label input {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
        }

        p {
            color: gray;
            margin: 0;
        }

        button {
            width: 100%;
            padding: 8px;
            background: rebeccapurple;
            color: white;
            border: none;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <form class="container" method="post" action="${pageContext.request.contextPath}/bai2-servlet">
        <h1>User Registration Form</h1>
        <div class="row">
            <label class="full" for="firstName">
                <input type="text" name="firstName" id="firstName" placeholder="First Name">
            </label>
            <label class="full" for="lastName">
                <input type="text" name="lastName" id="lastName" placeholder="Last Name">
            </label>
        </div>
        <div class="row">
            <label class="full" for="email">
                <input type="email" name="email" id="email" placeholder="Your Email">
            </label>
        </div>
        <div class="row">
            <label class="full" for="emailReEnter">
                <input type="emailReEnter" name="emailReEnter" id="emailReEnter" placeholder="Re-Enter Email">
            </label>
        </div>
        <div class="row">
            <label class="full" for="password">
                <input type="password" name="password" id="password" placeholder="New Password">
            </label>
        </div>
        <div class="row">
            <p>Birthday</p>
        </div>
        <div class="row">
            <label for="month">
                <select class="mr-2" name="month" id="month">
                    <option value="" disabled selected>Month:</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                    <option value="10">10</option>
                    <option value="10">11</option>
                    <option value="10">12</option>
                </select>
            </label>
            <label for="day">
                <select class="mr-2" name="day" id="day">
                    <option value="" disabled selected>Day:</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                    <option value="10">10</option>
                </select>
            </label>
            <label for="year">
                <select name="year" id="year">
                    <option value="" disabled selected>Year:</option>
                    <option value="1999">1999</option>
                    <option value="2000">2000</option>
                    <option value="2001">2001</option>
                    <option value="2002">2002</option>
                    <option value="2003">2003</option>
                    <option value="2004">2004</option>
                </select>
            </label>
        </div>
        <div class="row">
            <label class="" for="female">
                <input type="radio" name="gender" id="female">
                Female
            </label>
            <label class="" for="male">
                <input type="radio" name="gender" id="male">
                Male
            </label>
        </div>
        <div class="row">
            <button type="submit">Sign Up</button>
        </div>
    </form>
</body>
</html>
