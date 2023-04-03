<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Home</title>
    <style><%@include file="../style/home.css" %> </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<jsp:include page="_header.jsp"/>

<div id="main">
    <div id="information-block">

        <c:if test="${sessionScope.user == null}">
            <h1>Welcome to Calculator!</h1>
            <h2>Please login or register</h2>
            <img class="my-img" src= https://www.blogs.unicamp.br/zero/wp-content/uploads/sites/187/2022/04/calculator-gd4637ddb5_1280-757x1024.png" alt="">
        </c:if>

        <c:if test="${sessionScope.user != null}">
            <h1>In this simple calculator, you can perform four types of operations:</h1>
            <ul class="types">
                <li>summation</li>
                <li>subtraction</li>
                <li>multiplication</li>
                <li>division</li>
            </ul>
        </c:if>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js" integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N" crossorigin="anonymous"></script>
</body>
</html>

