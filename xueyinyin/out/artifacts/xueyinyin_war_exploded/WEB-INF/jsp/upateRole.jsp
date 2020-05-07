<%--
  Created by IntelliJ IDEA.
  User: 薛
  Date: 2019/12/20
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改角色</title>
</head>
<body>
<form action="upateRole.do" method="post">
    <input type="hidden"/>
    <table>
        <tr>
            <td>角色编号:</td>
            <td><input type="text" readonly="readonly" name="roleid"  value=" <s:out value='${role.roleid}'></s:out>"/> </td>
        </tr>
        <tr>
            <td>角色名称:</td>
            <td><input type="text" name="rolename" id="eml" value=" <s:out value='${role.rolename}'></s:out>"/> </td>
        </tr>
        <tr>
            <td>所属部门:</td>
            <td>
                <select name="deptid">
                    <option value="">-------请选择-------</option>
                    <s:forEach var="dept" items="${depts }">
                        <option  value="<s:out value='${dept.deptid}'></s:out>"> <s:out value="${dept.deptname}"></s:out> </option>
                    </s:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" id="btn" value="修改">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
