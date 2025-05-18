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
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Upload Tài Liệu</title>
</head>
<body>
<h2>Upload Tài Liệu</h2>
<form action="${pageContext.request.contextPath}/uploadDocument" method="post" enctype="multipart/form-data">
    <label>Tiêu đề:</label>
    <input type="text" name="title"/><br/>

    <label>Mô tả:</label>
    <textarea name="description"></textarea><br/>

    <label>Chọn file:</label>
    <input type="file" name="file"/><br/>

    <button type="submit">Upload</button>
</form>
</body>
</html>

</body>
</html>
