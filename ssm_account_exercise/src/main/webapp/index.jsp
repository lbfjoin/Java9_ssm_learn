<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<body>
<h2>欢迎来到Java银行</h2>
<a href="account/findAll">查询所有账户</a>

<h3>添加账户</h3>
<form action="account/save">
    姓名：<input type="text" name="name"> <br>
    金额： <input type="text" name="money"> <br>
    <input type="submit" value="保存">
</form>

<h3>修改账户</h3>
<form action="/account/update">
    姓名： <input type="text" name="name"> <br>
    金额： <input type="text" name="money"> <br>
    id: <input type="text" name="id"> <br>
    <input type="submit" value="保存">
</form>

<h3>删除账户</h3>
<form action="/account/delete">
    id: <input type="text" name="id"> <br>
    <input type="submit" value="保存">
</form>
</body>
</html>
