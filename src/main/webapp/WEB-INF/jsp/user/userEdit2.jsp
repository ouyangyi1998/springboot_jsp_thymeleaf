<%--
  Created by IntelliJ IDEA.
  User: jerry
  Date: 19-11-20
  Time: 下午5:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <h1>编辑用户</h1>
</head>
<body>
<form action="/edit2" name="userForm" method="post">
    <input type="hidden" name="id" value="${user.id }"/>
    姓名：<input type="text" name="name" value="${user.name }"/>
    密码：<input type="text" name="name" value="${user.password }"/>
    年龄：<input type="text" name="age" value="${user.age }"/>
    <input type="submit" value="提交" />
    &nbsp; &nbsp; &nbsp;
    <input type="reset" value="重置"  />
</form>
</body>
</html>
