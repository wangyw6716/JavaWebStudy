<%--
  Created by IntelliJ IDEA.
  User: WYW
  Date: 2021/7/10
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%--jsp表达式作用:将程序的输出,输出到客户端
<%= 变量或者表达式%>
--%>
<%=new java.util.Date() %>
<%
    int sum = 0;
    for (int i = 0; i <= 100; i++) {
        sum += i;

    }
    out.println("<h1>sum=" + sum + "</h1>");
%>

<%for (int j=0;j<5;j++){%>
<p>这是jsp代码</p>
<%}%>


<%
    out.println("这是jsp");
%>

<%
for (int j=0;j<5;j++){
    out.println("<h3>jsp代码</h3>");

%>
<%}%>
<%--jsp可以分开写--%>
</body>
</html>
