<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/1/20
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
    <div class="col-lg-4">
        <form action="edit.html?act=update&id=${requestScope.cs.id}" method="post" id="registForm" class="form-horizontal">
            <div class="form-group">
                <label class="col-sm-3 control-label">公司：</label>
                <div class="col-sm-9">
                    <select class="form-control" name="comId">
                        <option value="">请选择</option>
                        <c:forEach items="${companyList}" var="comList">
                        <option ${comList.id} ${comList.id eq cs.comId?'selected':''}>${comList.name}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-3 control-label">科目：</label>
                <div class="col-sm-9">
                    <input type="text" name="subject" class="form-control" value="${requestScope.cs.subject}">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-3 control-label">费用：</label>
                <div class="col-sm-9">
                    <input type="text" name="price" class="form-control" value="${requestScope.cs.price}">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-3 control-label">开课日期：</label>
                <div class="col-sm-9">
                    <input type="text" name="date" class="form-control" value="<fmt:formatDate value="${requestScope.cs.date}" pattern="yyyy-MM-dd"></fmt:formatDate>" readonly>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-3 control-label">状态：</label>
                <div class="col-sm-9">
                    <label class="control-label"><input type="radio" value="1" ${cs.status eq '1'?'checked':''} name="status">开课</label>
                    <label class="control-label"><input type="radio" value="0" ${cs.status eq '0'?'checked':''} name="status">结课</label>
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
