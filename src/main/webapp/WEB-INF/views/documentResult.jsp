<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hi
  Date: 19/05/2025
  Time: 4:51 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Kết quả Upload</h2>
<p><strong>Tiêu đề:</strong> ${title}</p>
<p><strong>Mô tả:</strong> ${description}</p>
<p><strong>Trạng thái:</strong> ${message}</p>

<c:if test="${not empty fileUrl}">
    <p><a href="${fileUrl}">Xem tài liệu đã upload</a></p>
</c:if>
</body>
</html>
