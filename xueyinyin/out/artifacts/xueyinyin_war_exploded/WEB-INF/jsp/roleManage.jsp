<%--
  Created by IntelliJ IDEA.
  User: 薛
  Date: 2019/12/20
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>角色管理</title>
    <style type="text/css">
        table{
            width: 800px;
            height: auto;

        }
        .td{
            width: 160px;
        }
    </style>
</head>
<body>
    <table border="1px" align="center">
        <tr>
            <td colspan="5"><a href="addRoleView.do">增加角色</a></td>
        </tr>
        <tr>
            <th>角色编号</th>
            <th>角色名称</th>
            <th>所属部门</th>
            <th>拥有权限</th>
            <th>操作</th>
        </tr>
        <s:forEach var="role" items="${rolelist }">
            <tr>
                <td><s:out value="${role.roleid}"></s:out></td>
                <td><s:out value="${role.rolename}"></s:out></td>
                <td><s:out value="${role.deptname}"></s:out></td>
                <td><s:out value="${role.jurisdiction}"></s:out></td>
                <td class="td"><a href="selectRoleByid.do?roleid=<s:out value='${role.roleid}'></s:out>">修改</a>&nbsp;<a href="deleteRole.do?roleid=<s:out value='${role.roleid}'></s:out>">删除</a>&nbsp;<a href="allocation.do?roleid=<s:out value='${role.roleid}'></s:out>">分配权限</a></td>
            </tr>
        </s:forEach>
    </table>

</body>
</html>
