<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Hi
  Date: 19/05/2025
  Time: 4:17 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Upload Avatar</h2>
<form:form method="post" modelAttribute="userProfile"
           action="/uploadAvatar"
           enctype="multipart/form-data">

    <p>
        <form:label path="username">Tên người dùng:</form:label>
        <form:input path="username" />
    </p>

    <p>
        <form:label path="avatar">Chọn ảnh đại diện:</form:label>
        <form:input path="avatar" type="file" />
    </p>

    <p>
        <input type="submit" value="Upload"/>
    </p>

</form:form>

</body>
</html>
