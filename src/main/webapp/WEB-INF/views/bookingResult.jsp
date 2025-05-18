<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hi
  Date: 19/05/2025
  Time: 5:39 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Kết quả Đặt Vé</h2>

<p><strong>Phim:</strong> ${ticket.movieTitle}</p>
<p><strong>Thời gian:</strong> ${ticket.showTime}</p>
<p><strong>Ghế:</strong>
    <c:forEach var="seat" items="${ticket.seats}">
        ${seat}
    </c:forEach>
</p>
<p><strong>Tổng tiền:</strong> ${ticket.totalAmount}$</p>

<p><strong>Trạng thái:</strong> ${message}</p>
</body>
</html>
