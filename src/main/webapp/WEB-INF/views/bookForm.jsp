<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Hi
  Date: 19/05/2025
  Time: 5:44 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Thêm sách mới</h2>
<form:form action="/library/add" modelAttribute="book" method="post" enctype="multipart/form-data">
  <p>Tiêu đề: <form:input path="title"/></p>
  <p>Tác giả: <form:input path="author"/></p>
  <p>Mô tả: <form:textarea path="description"/></p>
  <p>File e-book: <input type="file" name="file"/></p>
  <p><input type="submit" value="Lưu sách"/></p>
</form:form>
</body>
</html>
