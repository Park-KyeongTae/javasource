<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>장바구니 비우기</h1>
<%
 session.removeAttribute("products");
 // session.invalidate();
%>
<h4><a href="cart.html">상품선택</a></h4>
</body>
</html>