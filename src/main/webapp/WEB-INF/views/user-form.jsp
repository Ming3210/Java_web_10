<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Hi
  Date: 19/05/2025
  Time: 1:47 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Nhập Thông Tin Cá Nhân</h2>
<form:form method="POST" action="/submitForm" modelAttribute="user">
  Tên: <form:input path="name" /><br/><br/>
  Tuổi: <form:input path="age" /><br/><br/>
  Địa chỉ: <form:input path="address" /><br/><br/>
  <input type="submit" value="Gửi" />
</form:form>
</body>
</html>
