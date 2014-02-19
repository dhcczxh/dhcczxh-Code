<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
<link rel="stylesheet"  type="text/css"  href="css/login.css"  >
<script type="text/javascript">
alert($("msg"));
alert("niaho");
</script>
</head>
<body>
<form action="login/hanndleRequest"  id="form1" style="background-color:silver ;width:250px;margin:auto;height:90px">
姓名：<input type="text" name="userName" />
 </br>
密码：<input type="password" name="userPassword"/>
 </br>
  <input type="submit" name="submit" value="登录" />
</form>
</body>
</html>