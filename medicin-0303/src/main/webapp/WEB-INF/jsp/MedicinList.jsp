<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/3/3
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="bootstrap2.3.2/css/bootstrap.min.css" rel="stylesheet" />
    <title></title>
    <link href="styles/Common.css" rel="stylesheet" />
    <link href="styles/Index.css" rel="stylesheet" />
    <link href="styles/Index2.css" rel="stylesheet" />
</head>
<body>
<div class="header">

    <img class="logo" src="images/logo.png" />
    <label class="logo-title">通用后台模板</label>
    <ul class="inline">
        <li>
            <img src="images/32/client.png" />&nbsp;&nbsp;欢迎您,Admin
        </li>
        <li class="dropdown">
            <a class="dropdown-toggle mymsg" data-toggle="dropdown" href="#"><img src="images/32/166.png" />&nbsp;&nbsp;修改个人信息<b class="caret"></b></a>
            <ul class="dropdown-menu">
                <li><a href="#">修改密码</a></li>
            </ul>

        </li>
        <li>
            <img src="images/32/200.png" />&nbsp;&nbsp;<a class="loginout" href="#">退出</a>
        </li>

    </ul>


</div>


<div class="nav">

    <ul class="breadcrumb">
        <li>
            <img src="images/32/5025_networking.png" />
        </li>
        <li><a href="index.html">首页</a> <span class="divider">>></span></li>
        <li class="active">数据列表</li>
    </ul>
</div>



<div class="container-fluid content">
    <div class="row-fluid">
        <div class="span2 content-left">
            <div class="accordion">
                <div class="accordion-group">
                    <div class="accordion-heading">
                        <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne">
                            <img class="left-icon" src="images/32/5026_settings.png" /><span class="left-title">系统设置</span>
                        </a>
                    </div>
                    <div id="collapseOne" class="accordion-body collapse in">
                        <div class="accordion-inner">
                            <img class="left-icon-child" src="images/32/4962_sitemap.png" /><span class="left-body"> 药品管理</span>
                        </div>

                        <div class="accordion-inner">
                            <a href="password.html">  <img class="left-icon-child" src="images/32/4992_user.png" /><span class="left-body"> 修改密码</span></a>

                        </div>
                        <div class="accordion-inner">
                            <a href="login.html">  <img class="left-icon-child" src="images/32/4958_login.png" /><span class="left-body"> 退出登陆</span></a>

                        </div>
                    </div>
                </div>
            </div>

        </div>

        <div class="span10 content-right">
            <div class="container-fluid">
                <div class="row-fluid">
                    <h4>数据列表</h4>
                    <div class="add">
                        <form class="form-horizontal">
                            药品名称：<input tyle="text" >
                            分类：<select >
                            <option value="">请选择</option>
                            <option value="">抗生素</option>
                            <option value="">清热解毒药品</option>
                            <option value="">心脑血管药</option>
                            <option value="">妇科用药</option>
                        </select>
                            处方药：<select >
                            <option value="">请选择</option>
                            <option value="">是</option>
                            <option value="">否</option>
                        </select>
                            <input type="submit" class="btn btn-info" value="提交">
                            <a class="btn btn-success" href="edit.html">+新增</a>
                        </form>

                    </div>
                    <div class="w">
                        <div class="span12">
                            <table class="table table-condensed table-bordered table-hover tab">
                                <thead>
                                <tr>
                                    <th>药品名称</th>
                                    <th>分类</th>
                                    <th>处方药</th>
                                    <th>厂家</th>
                                    <th>单价</th>
                                    <th>进货时间</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody id="tbody">
                                <tr>
                                    <td>阿莫西林胶囊</td>
                                    <td>抗生素</td>
                                    <td>是</td>
                                    <td>哈药六厂</td>
                                    <td>10.5</td>
                                    <td>2016-01-01</td>
                                    <td>
                                        <a href="#">修改</a> <a href="#">删除</a>
                                    </td>
                                </tr>
                                <tr>
                                    <td>小柴胡</td>
                                    <td>清热解毒药品</td>
                                    <td>否</td>
                                    <td>哈药三厂</td>
                                    <td>20.5</td>
                                    <td>2016-11-01</td>
                                    <td>
                                        <a href="#">修改</a> <a href="#">删除</a>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                            <div id="page" class="tr">
                                <a href="#">首页</a>
                                <a href="#">上一页</a> <a href="#">下一页</a>
                                <a href="#">末页</a>
                            </div>
                        </div>
                    </div>


                    <div id="addModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h3 id="myModalLabel">添加成绩</h3>
                        </div>
                        <div class="modal-body">
                            <form class="form-horizontal">
                                <div class="control-group">
                                    <label class="control-label" for="userName">姓名</label>
                                    <div class="controls">
                                        <input type="text" id="userName" placeholder="姓名">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" for="Chinese">语文</label>
                                    <div class="controls">
                                        <input type="text" id="Chinese" placeholder="语文">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" for="Math">数学</label>
                                    <div class="controls">
                                        <input type="text" id="Math" placeholder="数学">
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" for="English">英语</label>
                                    <div class="controls">
                                        <input type="text" id="English" placeholder="英语">
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
                            <button class="btn btn-primary" id="add" onclick="add();">保存</button>
                            <button class="btn btn-primary" id="edt" onclick="edt();">保存</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="clearfix"></div>
<div class="foot"></div>
<script src="scripts/jquery-1.9.1.min.js"></script>
<script src="bootstrap2.3.2/js/bootstrap.min.js"></script>
<script src="scripts/Index.js"></script>
<div style="text-align:center;">
    <p>来源:<a href="http://www.mycodes.net/" target="_blank">源码之家</a></p>
</div>

</body>
</html>

