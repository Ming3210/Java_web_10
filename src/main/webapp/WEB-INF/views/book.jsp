<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Hi
  Date: 16/05/2025
  Time: 4:41 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>Book Form</h4>

<form:form action="book-save" modelAttribute="book" method="post"  >
    <p>Title</p>
    <form:input path="title"/>

    <p>ISBN</p>
    <form:input path="ISBN"/>

    <p>Price</p>
    <form:input path="price"/>

<%--    <p>File Image</p>--%>
<%--    <form:input path="fileImage" type="file"/>--%>

<%--    <p>Publish Date</p>--%>
<%--    <form:input path="publishedDate" type="date"/>--%>

    <button type="submit">Submit</button>
</form:form>

</body>
</html>
