<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style><%@include file="../style/calc.css" %> </style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<jsp:include page="_header.jsp"/>
<div id="main">
    <div id="information">
        <h4>Enjoy the Calculator!</h4>

    </div>
</div>

<form name="calculator" action="/calc" method="post">

    <label for="num1">First number:</label>
    <input class="calc" id="num1" name="num1" placeholder="Num 1">
    <label for="num2">Second number:</label>
    <input class="calc" id="num2" name="num2" placeholder="Num 2"><br>

    <button class="btn btn-warning" id="type1" name="type" value="SUM">+</button>
    <button class="btn btn-warning" id="type2" name="type" value="SUB">-</button>
    <button class="btn btn-warning" id="type3" name="type" value="MUL">*</button>
    <button class="btn btn-warning" id="type4" name="type" value="DIV">/</button><br>
</form>

<div class="result">
    <input type="textfield"  id="res1" disabled selected placeholder="Result" value="${result}">
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js" integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N" crossorigin="anonymous"></script>
</body>
</html>

