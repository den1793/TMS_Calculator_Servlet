<%--
  Created by IntelliJ IDEA.
  User: Denis
  Date: 28.03.2023
  Time: 09:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<style><%@include file="../style/reg.css" %> </style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

<html>
<head>
    <title>Registration</title>
</head>
<body>
<jsp:include page="_header.jsp"/>

<div id="main">
    <div id="information">
        <h4>To register, enter your name, create a username and password: </h4>
    </div>
</div>


<form action="/reg" method="post">
    <div class="mb-3">
        <label for="exampleInputName" class="form-label">Name</label>
        <input type="text" class="form-control" id="exampleInputName" name="name">
    </div>
    <div class="mb-3">
        <label for="exampleInputUserName" class="form-label">UserName</label>
        <input type="text" class="form-control" id="exampleInputUserName" name="username">
    </div>
    <div class="mb-3">
        <label for="exampleInputPassword" class="form-label">Password</label>
        <input type="password" class="form-control" id="exampleInputPassword" name="password">
    </div>
    <div class="d-grid gap-2">
        <button id ="submit" type="submit" class="btn btn-secondary">Submit</button>
    </div>
</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
        crossorigin="anonymous"></script>
</body>
</html>
