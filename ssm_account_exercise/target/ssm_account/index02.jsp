<%--
  Created by IntelliJ IDEA.
  User: lbf
  Date: 2020/9/8
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>欢迎登陆用户界面</h2>
<a href="/user/findAll">查询所有用户</a>

<h2>添加用户</h2>
<form action="/user/saveUser">
    用户姓名： <input type="text" name="username"> <br>
    用户生日： <input type="text" name="birthday"> <br>
    用户性别： <input type="text" name="sex"> <br>
    用户地址： <input type="text" name="address"> <br>
    <input type="submit" value="保存">
</form>

<h2>更新用户</h2>
<form action="/user/updateUser">
    用户id: <input type="text" name="id"> <br>
    用户姓名： <input type="text" name="username"> <br>
    用户生日： <input type="text" name="birthday"> <br>
    用户性别： <input type="text" name="sex"> <br>
    用户地址： <input type="text" name="address"> <br>
    <input type="submit" value="保存">
</form>

<h2>删除用户</h2>
<form action="/user/deleteUser">
    用户id: <input type="text" name="id">
    <input type="submit" value="保存">
</form>


</body>
</html>
