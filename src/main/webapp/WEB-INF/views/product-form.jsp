<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Hi
  Date: 19/05/2025
  Time: 2:28 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Form Nhập Thông Tin Sản Phẩm</h2>
<form:form method="POST" action="/addProduct" modelAttribute="product">
    Tên sản phẩm: <form:input path="name" /><br/><br/>
    Giá: <form:input path="price" /><br/><br/>
    Mô tả: <form:textarea path="description" rows="5" cols="30"/><br/><br/>
    <input type="submit" value="Thêm sản phẩm" />
</form:form>
</body>
</html>
