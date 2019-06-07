<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%--＜%@ page isELIgnored＝"true|false"%＞--%>
<%--如果设定为真，那么JSP中的表达式被当成字符串处理。比如下面这个表达式＜p＞${2000 % 20}--%>
<%--＜/p＞在isELIgnored＝"true"时输出为${2000 % 20}，而isELIgnored＝"false"时输出为100。--%>
<%--Web容器默认isELIgnored＝"false"。--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>用户搜索模块</h1>
    <h2>你当前登录的用户是：${user.account}</h2>
</body>
</html>
