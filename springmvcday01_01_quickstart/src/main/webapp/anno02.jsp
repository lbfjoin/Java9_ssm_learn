<%--
  Created by IntelliJ IDEA.
  User: lbf
  Date: 2020/9/8
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/anno02/testRequestParam?name=hdskf&pass=1121">testRequestParam</a>

<form action="/anno02/testRequestBody" method="post">
    姓名：<input type="text" name="username">
    年龄： <input type="text" name="age">
    <input type="submit" value="提交">
</form>

<a href="/anno/testPathVariable/222">testRequestBody</a>
</body>
</html>
