<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/3/4
  Time: 8:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action=<%=request.getContextPath()%>"/addGame.html" method="post">
    游戏名称<input type="text" name="name">
    游戏状态<input type="text" name="status">
    下载地址<input type="text" name="downloadUrl">
    创建时间<input type="text" name="createdDate">
    <input type="submit" value="添加">
    ${message}
</form>
</body>
</html>
