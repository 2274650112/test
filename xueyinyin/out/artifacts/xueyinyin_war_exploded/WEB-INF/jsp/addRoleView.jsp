<%--
  Created by IntelliJ IDEA.
  User: 薛
  Date: 2019/12/20
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加角色</title>
</head>
<body>
    <form action="addRole.do" method="post">
        <table>
            <tr>
                <td>角色名称:</td>
                <td><input type="text" name="rolename" id="eml" value="" /> </td>
            </tr>
            <tr>
                <td>所属部门:</td>
                <td>
                    <select name="deptid">
                        <option value="">-------请选择-------</option>
                        <s:forEach var="dept" items="${depts }">
                            <option value="<s:out value='${dept.deptid}'></s:out>"> <s:out value="${dept.deptname}"></s:out> </option>
                        </s:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>权限:</td>
                <td>
                    <s:forEach var="menu" items="${menus }">
                        <input type="checkbox" name="menuids" value="<s:out value='${menu.menuid}'></s:out>"><s:out value="${menu.menuname}"></s:out>
                    </s:forEach>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" id="btn" value="添加">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
