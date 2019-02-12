<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/1/20
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="jquery-1.10.2.min.js">
    </script>
</head>
<body>
省份<select name="province" id="selId" onchange="change()">
    <option value="">请选择</option>
    <option value="1">黑龙江</option>
    <option value="3">吉林</option>
    <option value="2">辽宁</option>
</select>
城市<select id="city">
    <option value="">请选择</option>
</select>
</body>
<script>
    function change() {
        $.ajax({
            url: "city.html",
            method: "post",
            data: "id=" + $("#selId").val(),
            success: function (result) {
                $("#city").html("");
                for(key in result){
                        $("#city").append("<option >" + result[key].name + "</option>")
                    }

            }
        })
    }
</script>
</html>
