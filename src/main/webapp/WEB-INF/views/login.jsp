<%@ page contentType="text/html;charset=UTF-8" %>
<style>
    <%@include file='/WEB-INF/views/css/table_dark.css' %>
</style>
<html>
<head>
    <title>Login</title>
</head>
<body>
<center><h1> Login page </h1></center>
<h4 style="color: red">${errorMsg}</h4>

<form method="post"  id = "drivers" action="${pageContext.request.contextPath}/login">

<table class="table_dark">
    <tr>
        <th>Login</th>
        <th>Password</th>
        <th>Login</th>
        <th>New Driver</th>
    </tr>
    <tr>
    <td>
        <label>
            <input type="text" name="login" form="drivers" required>
        </label>
    </td>
    <td>
        <label>
            <input type="text" name="password" form="drivers" required>
        </label>
    </td>
    <td>
        <input type="submit" name="LoginButton" form="drivers" title="Login">
    </td>
        <td>
            <a href="${pageContext.request.contextPath}/drivers/add">Register</a>
        </td>
    </tr>
</table>
</form>
</body>
</html>
