<%--
  Created by IntelliJ IDEA.
  User: 薛
  Date: 2019/12/20
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改密码</title>
    <script type="text/javascript" src="js/jquery-1.11.3.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#oldpwd").bind('blur',function () {
                var oldpwd=$.trim($("#oldpwd").val());
                if(oldpwd.length>0){
                    $.ajax({
                        type:"post",
                        url:"checkpwd.do",
                        data:{oldpassword:oldpwd},
                        success:function (data) {
                            if(data=="1"){
                                $("#span").html("<font color='green'>密码正确</font>")
                            }else if(data=="-1"){
                                $("#oldpwd").select();
                                $("#span").html("<font color='red'>密码错误</font>")
                            }
                        }
                    })
                }else{
                    alert("旧密码不能为空");
                }

            })
        });

        $(function () {
            $("#pwd2").bind('blur',function (){
                var pwd1=$.trim($("#pwd1").val());
                var pwd2=$.trim($("#pwd2").val());
                if(pwd1.length<=0 || pwd2.length<=0){
                    alert("密码不能为空");
                }else{
                    if(pwd1==pwd2){
                        $("#btn").removeAttr("disabled");
                    }else{
                        $("#btn").attr("disabled","disabled");
                        alert("两次密码不一致")
                    }

                }
            });

        })
    </script>
</head>
<body>
    <form action="changepwd.do">
        <table>
            <tr>
                <td>旧密码:</td>
                <td>
                    <input type="password" id="oldpwd" name="oldpwd" value="">
                    <span id="span"></span>
                </td>
            </tr>
            <tr>
                <td>新密码:</td>
                <td>
                    <input type="password" id="pwd1" value="">
                </td>
            </tr>
            <tr>
                <td>确认密码:</td>
                <td>
                    <input type="password" id="pwd2" name="newpwd" value="">
                </td>
            </tr>

            <tr>
                <td colspan="2">
                    <input type="submit" id="btn" disabled="disabled" value="确定">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
