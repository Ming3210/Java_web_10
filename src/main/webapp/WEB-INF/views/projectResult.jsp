<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hi
  Date: 19/05/2025
  Time: 5:35 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Kết quả Upload</h2>

<p><strong>Tên dự án:</strong> ${project.name}</p>
<p><strong>Mô tả:</strong> ${project.description}</p>
<p><strong>Tiêu đề tài liệu:</strong> ${project.documentTitle}</p>
<p><strong>Mô tả tài liệu:</strong> ${project.documentDescription}</p>
<p><strong>Trạng thái:</strong> ${message}</p>

<c:if test="${not empty fileUrl}">
  <p><a href="${fileUrl}" target="_blank">Xem tài liệu</a></p>
</c:if>

</body>
</html>
