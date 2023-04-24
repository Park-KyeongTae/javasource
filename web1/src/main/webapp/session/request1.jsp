<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- name.html 에서 보낸 이름 가져오기 : 사용자의 요청 처리 


	HttpServletRequest 객체가 필요함 => jsp 파일에서는 해당 객체가 이미 선언이 되어 있음
	
	HttpServletRequest request; 
	
	request 로 가져올 수 있는 것들?
	1) 사용자가 보낸 데이터 (★) : getParameter(이름), getParameterValues(이름)
	2) 사용자가 사용한 브라우저 정보
	3) ip 주소, 사용한 프로토콜 정보 ....
--%>

	<%
	request.setCharacterEncoding("utf-8");
	String name=request.getParameter("name");
	
	// 다른 페이지에서 사용할 수 있도록 name 값을 session에 담는다.
	// HttpSession session 내장 객체로 가지고 있기 때문에
	// HttpSession.setAttribute(String name, Object value) : name은 맘대로
	session.setAttribute("name", name);
	%>
	<ul>
		<li>사용자 이름 : <%=name%></li>
	</ul>
	<%
	
	
	%>
	<a href="request2.jsp">이동</a>


</body>
</html>