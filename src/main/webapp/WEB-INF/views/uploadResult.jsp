<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<h2>Kết quả Upload</h2>
<p><strong>Tên người dùng:</strong> ${username}</p>
<p><strong>Trạng thái:</strong> ${message}</p>

<c:if test="${not empty avatarUrl}">
    <img src="${avatarUrl}" width="200" alt=""/>
</c:if>
</body>
</html>
