<%--
  Created by IntelliJ IDEA.
  User: jerry
  Date: 19-11-20
  Time: 下午4:36
  To change this template use File | Settings | File Templates.
--%>
<%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
    <h1>用户列表</h1>
</head>
<body>
<div class="with:80%">
    <table border="1">
        <tbody>
        <tr>
            <th>序号</th>
            <th>姓名</th>
            <th>密码</th>
            <th>年龄</th>
            <th>编辑</th>
            <th>删除</th>
        </tr>
        <c:if test="${!empty users}">
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.password}</td>
                    <td>${user.age}</td>
                    <td><a href="/toEdit2?id=${user.id}">编辑</a></td>
                    <td><a href="/toDelete2?id=${user.id}">删除</a></td>
                </tr>
            </c:forEach>
        </c:if>
        </tbody>
        <h6><a href="/toAdd2">添加用户</a> </h6>
    </table>
</div>
</body>
</html>
