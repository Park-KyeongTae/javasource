<%@page import="user.domain.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String userId = request.getParameter("userid");
	String password = request.getParameter("password");
	
	// session 값을 담을 때 개별로 담는 형태
	/* session.setAttribute("id", userId);
	   session.setAttribute("pwd", password);  */
	
	
	// 	값을 한 꺼번에 담을 때 DTO 객체 사용
	/* LoginDTO loginDTO = new LoginDTO(userId,password);
	session.setAttribute("loginDTO", loginDTO); */
	
	session.setAttribute("loginDTO", new LoginDTO(userId,password));
	%>

	
	<h4>
		아이디 :
		<%=request.getParameter("userid")%></h4>
	<h4>
		비밀번호 :
		<%=request.getParameter("password")%></h4>
		
	<a href="request2.jsp">이동</a>
</body>
</html>