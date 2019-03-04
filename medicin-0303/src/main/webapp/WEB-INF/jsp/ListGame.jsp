<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/3/4
  Time: 8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="">
    查询条件<input type="text" name="name" value="${param.name}">
    <input type="submit" value="查询">
    <table style="margin-top:20px">
        <tr>
            <td>游戏id</td>
            <td>游戏名字</td>
            <td>游戏状态</td>
            <td>下载地址</td>
            <td>创建时间</td>
            <td>其他操作</td>
        </tr>
        <c:forEach items="${requestScope.gameList}" var="gl">
            <tr>
                <td>${gl.id}</td>
                <td>${gl.name}</td>
                <td>${gl.status}</td>
                <td>${gl.downloadUrl}</td>
                <td>${gl.createdDate}</td>
                <td><a href=<%=request.getContextPath()%>"/updateGet.html?id=${gl.id}">修改</a></td>
                <td><a href=<%=request.getContextPath()%>"/delete.html?id=${gl.id}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
