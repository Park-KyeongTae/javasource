<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- jsp 주석 --%>
	<%-- jsp 주석안에 들어간 코드들은 웹브라우저에서 보이지 않는다. --%>
	<!-- html 주석 -->
	<!-- 브라우저에서는 html 주석은 보이기 때문에 보여주고싶은 코멘트를 html 주석에 적는다. -->
	<%
	request.setCharacterEncoding("utf-8");
	//값을 하나만 가져옴
	//String animals = request.getParameter("animal"); 

	//값을 여러개 가져올 때
	String animals[] = request.getParameterValues("animal");
	
	out.print(Arrays.toString(animals));
	%>
	
	<%-- <h3><%= Arrays.toString(animals) %></h3> --%>
</body>
</html>