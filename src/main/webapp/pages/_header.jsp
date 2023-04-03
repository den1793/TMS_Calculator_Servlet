<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">
            <img src="https://cdn-icons-png.flaticon.com/512/564/564429.png" alt="Logo" width="30" height="25"
                 class="d-inline-block align-text-top">
            Simple Calculator
        </a>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">


                <c:if test="${sessionScope.user == null}">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/reg">Registration</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/auth">Log in</a>
                </li>
                    <a class="nav-link disabled">Hi Guest!</a>
                </c:if>

                <c:if test="${sessionScope.user != null}">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="/calc">Calculator</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="/history">History</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="/logout">Logout</a>
                    </li>
                    <a class="nav-link disabled">Hello ${sessionScope.user.name}!</a>
                </c:if>
                </li>
            </ul>
        </div>
    </div>
</nav>



