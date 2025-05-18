<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Hi
  Date: 19/05/2025
  Time: 3:23 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Form Đăng Ký</h2>
<form:form method="POST" action="/register" modelAttribute="account">
    Tên đăng nhập: <form:input path="username" /><br/><br/>
    Mật khẩu: <form:password path="password" /><br/><br/>
    Email: <form:input path="email" /><br/><br/>
    <input type="submit" value="Đăng Ký" />
</form:form>
</body>
</html>
