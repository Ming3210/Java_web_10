<%--
  Created by IntelliJ IDEA.
  User: Hi
  Date: 19/05/2025
  Time: 5:38 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Đặt Vé</h2>

<form action="bookTicket" method="post">
  <p>Tên phim: <input type="text" name="movieTitle" required/></p>
  <p>Thời gian chiếu: <input type="datetime-local" name="showTime" required/></p>

  <p>Chọn ghế:</p>
  <label><input type="checkbox" name="seats" value="A1"> A1</label>
  <label><input type="checkbox" name="seats" value="A2"> A2</label>
  <label><input type="checkbox" name="seats" value="A3"> A3</label>
  <label><input type="checkbox" name="seats" value="B1"> B1</label>
  <label><input type="checkbox" name="seats" value="B2"> B2</label>

  <p><button type="submit">Đặt vé</button></p>
</form>
</body>
</html>
