<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Hi
  Date: 19/05/2025
  Time: 5:34 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Form Tạo Dự Án</h2>

<form:form action="createProject" method="post" modelAttribute="project" enctype="multipart/form-data">
    <p>Tên dự án: <form:input path="name"/></p>
    <p>Mô tả dự án: <form:textarea path="description"/></p>
    <p>Tiêu đề tài liệu: <form:input path="documentTitle"/></p>
    <p>Mô tả tài liệu: <form:textarea path="documentDescription"/></p>
    <p>Tệp tài liệu: <input type="file" name="file"/></p>
    <button type="submit">Gửi</button>
</form:form>
</body>
</html>
