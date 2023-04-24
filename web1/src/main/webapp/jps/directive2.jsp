<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%><%-- 서버에 에러가 나면 error.jsp로 이동해라는 뜻 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 int a=1, b=0;
%>
<p>a+b = <%=a+b %></p>
<p>a-b = <%=a-b %></p>
<p>a*b = <%=a*b %></p>
<p>a/b = <%=a/b %></p>
</body>
</html>