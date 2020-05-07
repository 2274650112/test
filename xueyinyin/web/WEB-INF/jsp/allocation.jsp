<%--
  Created by IntelliJ IDEA.
  User: 薛
  Date: 2019/12/20
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>分配权限</title>
</head>
<body>
    <form action="allocationMenu.do" method="post">
        <input type="hidden" name="roleid"  value="${rid}" />
        <table>
            <caption>分配权限</caption>
            <td>权限:</td>
            <td>
                <s:forEach var="menu" items="${menus }">
                    <input <s:if test="${menu.checked=='checked'}">checked="checked"</s:if>  type="checkbox" name="menuids" value="<s:out value='${menu.menuid}'></s:out>"><s:out value="${menu.menuname}"></s:out>
                </s:forEach>
            </td>
            <tr>
                <td colspan="2">
                    <input type="submit" value="分配"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
