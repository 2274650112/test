<%--
  Created by IntelliJ IDEA.
  User: 薛
  Date: 2019/12/20
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <style type="text/css">
        #d{
            width: 600px;
            height: 700px;
            margin: 10px auto;
        }
        #d2{
            float: right;
        }
        #d3{
            clear: both;
        }
        a{
            color: black;
            text-decoration: none;
        }
    </style>
</head>
<body>
<div id="d">
    <div>
        <div style="float: left">欢迎<%=session.getAttribute("loginName")%>登录</div>
        <div id="d2">
            <a href="quitLogin.do">退出</a>&nbsp;&nbsp;
            <a href="changepwdViwe.do">修改密码</a>
        </div>
    </div>
    <div align="center" id="d3">
        <h2><a href="queryRole.do">角色管理</a></h2>
        <h2><a href="queryAlldept.do">部门管理</a></h2>
    </div>
</div>
</body>
</html>
