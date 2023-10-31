<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
<div class="container">
    <div class="login">
        <div class="imgbox">
            <img src="asset/987815.jpg" alt="login">
        </div>
        <div class="textbox">
            <form action="login">
                <h1>welcome</h1>
                <input type="text" placeholder="enter count" value="${messageModel.object.userName}" id="uname" name="uname">
                <input type="password" placeholder="enter pwd" value="${messageModel.object.userPwd}" id="upwd" name="upwd">
                <input type="submit" value="login">
                <input type="button" value="text" onclick="text()">
            </form>

        </div>
    </div>
</div>
</body>

<script type="text/javascript">
    $("#loginBtn").click(function (){
        var uname=$("#uname").val();
        var upwd=$("#upwd").val();

        if(isEmpty(uname)){
            $("#msg").html("用户的姓名不能为空！");
            return;
        }

        if(isEmpty(upwd)){
            $("#msg").html("用户的密码不能为空！");
            return;
        }

        $("#loginform").submit();
    });


    function isEmpty(str)
    {
        return str == null || str.trim() === "";

    }
</script>
</html>