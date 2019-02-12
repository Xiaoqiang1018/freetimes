<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/1/19
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"></link>
    <link rel="stylesheet" href="css/bootstrap-datetimepicker.css"></link>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="jquery-1.10.2.min.js"></script>
    <script src="bootstrap.min.js"></script>
    <script src="bootstrap-datetimepicker.min.js" charset="UTF-8"></script>
</head>
<body>
<h1>1. 列表查询</h1>
<p>1.请完成条件查询</p>
<p>2.完成翻页功能，翻页必须带条件，导航栏保持5个</p>
<p>3.当前页是选中状态。第一页的时候首页和上一页不能点，最后一页的时候末页和下一页不能点</p>
<p>4.请准备足够多的测试数据</p>
<p>5.公司下拉列表从数据库中获取</p>
<hr/>
<div class="row">
    <div class="col-lg-6">
        <form action="carschool.html" method="post" class="form-inline" id="searchForm">
            <div class="form-group">
                <input type="hidden" name="pn" id="pageNum">
                <label>公司</label>
                <select class="form-control" name="comId">
                    <option value="">请选择</option>
                    <c:forEach items="${requestScope.companyList}" var="comlist">
                        <option value="${comlist.id}" ${comlist.id eq param.comId?'selected':''}>${comlist.name}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="form-group">
                <label>科目</label>
                <input type="text" name="subject" value="${param.subject}" class="form-control">
            </div>
            <div class="form-group span6">
                <label>开课时间</label>
                <input class="form-control" name="date" size="10" type="text" id="startTime"> -
                <input class="form-control" name="sdate" size="10" type="text" id="endTime">
            </div>
            <div class="form-group">
                <label>状态</label>
                <select class="form-control" name="status">
                    <option value="">请选择</option>
                    <option value="1" ${param.status eq '1'?'selected':''}>开课</option>
                    <option value="0" ${param.status eq '0'?'selected':''}>结课</option>
                </select>
            </div>
            <div class="form-group">
                <button type="submit" class="btn">查询</button>
            </div>
        </form>
        <table class="table table-striped table-bordered" style="margin-top:20px">
            <tr>
                <td>ID</td>
                <td>科目</td>
                <td>公司</td>
                <td>费用</td>
                <td>开课时间</td>
                <td>状态</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${requestScope.carSchoolList.list}" var="carschool">
                <tr>
                    <td>${carschool.id}</td>
                    <td>${carschool.subject}</td>
                    <td>${carschool.company.name}</td>
                    <td>${carschool.price}</td>
                    <td><fmt:formatDate value="${carschool.date}" pattern="yyyy-MM-dd"></fmt:formatDate> </td>
                    <td>${carschool.status==1?'开课':'结课'}</td>
                    <td><a href="edit.html?act=modify&id=${carschool.id}">修改</a></td>
                </tr>
            </c:forEach>
        </table>
        <ul class="pagination">
            <!--不可点击的样式-->
            <li><a href="#" onclick="change(1)">首页</a></li>
            <li><a href="#" onclick="change(${carSchoolList.pageNum}-1)">上一页</a></li>
            <li><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <!--当前页-->
            <li class="active"><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li><a href="#" onclick="change(${carSchoolList.pageNum}+1)">下一页</a></li>
            <li><a href="#" onclick="change(${carSchoolList.pages})">末页</a></li>
        </ul>
    </div>
</div>
<script>
    function change(pn) {
        $("#pageNum").val(pn);
        $("#searchForm").submit();
    }

    $(function () {
        $('#startTime').datetimepicker({
            format: 'yyyy-mm-dd',
            autoclose: true,
            minView: 2
        });
        $('#endTime').datetimepicker({
            format: 'yyyy-mm-dd',
            autoclose: true,
            minView: 2
        });
    })
</script>
<hr/>
<h1>2.修改</h1>
<p>1.回填数据</p>
<p>2.日期不能修改</p>
<p>3.修改成功回列表页，修改失败还在当前页</p>
<div class="row">
    <div class="col-lg-4">
        <form method="post" id="registForm" class="form-horizontal">
            <div class="form-group">
                <label class="col-sm-3 control-label">公司：</label>
                <div class="col-sm-9">
                    <select class="form-control">
                        <option>请选择</option>
                        <option selected>龙腾驾校</option>
                        <option>海淀驾校</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-3 control-label">科目：</label>
                <div class="col-sm-9">
                    <input type="text" class="form-control" value="周末班">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-3 control-label">费用：</label>
                <div class="col-sm-9">
                    <input type="text" class="form-control" value="4999.5">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-3 control-label">开课日期：</label>
                <div class="col-sm-9">
                    <input type="text" class="form-control" value="2019-01-01" readonly>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-3 control-label">状态：</label>
                <div class="col-sm-9">
                    <label class="control-label"><input type="radio" name="status" checked>开课</label>
                    <label class="control-label"><input type="radio" name="status">结课</label>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-2">
                    <button type="submit" id="btn" class="btn btn-success">提交</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
