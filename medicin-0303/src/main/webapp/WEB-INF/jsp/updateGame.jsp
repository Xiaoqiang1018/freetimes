<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/3/4
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action=<%=request.getContextPath()%>"/updateGame.html" method="post">
    <input type="hidden" name="id" value="${requestScope.gameListById.id}">
    游戏名称<input type="text" name="name" value="${requestScope.gameListById.name}">
    游戏状态<input type="text" name="status" value="${requestScope.gameListById.status}">
    下载地址<input type="text" name="downloadUrl" value="${requestScope.gameListById.downloadUrl}">
    创建时间<input type="text" name="createdDate" value="${requestScope.gameListById.createdDate}">
    <input type="submit" value="修改">
    ${message}
</form>
</body>
</html>
