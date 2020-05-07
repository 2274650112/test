<%--
  Created by IntelliJ IDEA.
  User: 薛
  Date: 2019/12/20
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
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
                                $("#eml").select();
                                $("#span").html("<font color='red'>账号已存在</font>")
                            }else if(data=="-1"){
                                $("#btn").attr("disabled","disabled");
                                $("#span").html("<font color='green'>账号可用</font>")
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
<form action="zhuce.do" method="post">

    <table align="center">
        <caption align="">用户注册</caption>
        <tr>
            <td>账号:</td>
            <td><input type="text" name="email" id="eml" value="" /> <select name="sign" id="yx"><option value="@qq.com">@qq.com</option></select><span id="span"></span></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" name="password"  value="" /></td>
        </tr>
        <tr>
            <td>真实姓名:</td>
            <td><input type="text" name="username"  value="" /></td>
        </tr>
        <tr>
            <td>性別：</td>
            <td>
                <input type="radio" name="sex" value="0">男
                <input type="radio" name="sex" value="1">女
            </td>
        </tr>
        <tr>
            <td>电话:</td>
            <td><input type="text" name="phone" id="pwd" value="" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" id="btn" value="注册">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
