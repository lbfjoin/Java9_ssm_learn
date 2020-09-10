<%--
  Created by IntelliJ IDEA.
  User: lbf
  Date: 2020/9/8
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>查询所有用户</h4>
<c:forEach items="${list02}" var="user">
    ${user} <br>
</c:forEach>
</body>
</html>
