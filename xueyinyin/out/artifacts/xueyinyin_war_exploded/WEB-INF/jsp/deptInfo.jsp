<%--
  Created by IntelliJ IDEA.
  User: 薛
  Date: 2019/12/20
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>部门信息</title>
</head>
<body>
<table  align="center" border="1px">

    <tr>
        <td>部门id</td>
        <td>部门名称</td>
    </tr>
    <s:forEach var="list" items="${depts}">
        <tr>
            <td><s:out value="${list.deptid}" /></td>
            <td><s:out value="${list.deptname}" /></td>
        </tr>
    </s:forEach>
</table>
</body>
</html>
