<%--
  Created by IntelliJ IDEA.
  User: 薛
  Date: 2019/12/20
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <script type="text/javascript" src="js/jquery-1.11.3.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#eml").bind('blur',function () {
                $("#span").html("");
                var eml=$.trim($("#eml").val());
                var gs=$("#yx").val();
                if(eml.length>0){
                    $("#btn").removeAttr("disabled");
                    $.ajax({
                        type:"post",
                        url:"checkName.do",
                        data:{email:eml+gs},
                        success:function (data) {
                            if(data=="1"){
                                $("#btn").removeAttr("disabled");
                                $("#span").html("<font color='green'>账号可用</font>")
                            }else if(data=="-1"){
                                $("#btn").attr("disabled","disabled");
                                $("#span").html("<font color='red'>账号不存在</font>")
                            }
                        }
                    })
                }else{
                    $("#btn").attr("disabled","disabled");
                    alert("用户名不能为空");
                }

            })
        });

        $(function () {
            $("#pwd").bind('blur',function () {
                var psw=$.trim($("#pwd").val());
                if(psw.length<=0){
                    $("#btn").attr("disabled","disabled");
                    alert("密码不能为空");
                }else{
                    $("#btn").removeAttr("disabled");
                }
            })
        })
    </script>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    Cookie[] cs=request.getCookies();
    String name="";
    String checked="";
    if(cs!=null){
        for(int i=0;i<cs.length;i++){
            Cookie c=cs[i];
            if("cname".equals(c.getName())){
                name=c.getValue();
                checked="checked";
            }
        }
    }

%>
<form action="login.do" method="post">

    <table align="center">
        <caption align="">CRM系统登录</caption>
        <tr>
            <td>账号:</td>
            <td><input type="text" name="email" id="eml" value="" /> <select name="sign" id="yx"><option value="@qq.com">@qq.com</option></select><span id="span">${msg}</span></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" name="password" id="pwd" value="" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" id="btn" value="登录">
                <input type="checkbox" name="remember" checked="<%=checked %>" value="remember">记住用户名
                <span><a href="zhuceView.do">注册</a></span>
            </td>

        </tr>
    </table>
</form>
</body>
</html>
