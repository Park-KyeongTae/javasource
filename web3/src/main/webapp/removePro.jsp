<%@page import="user.persistence.UserDAO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//사용자 보는 페이지 아님
	//no 값 가져오기
	int no = Integer.parseInt(request.getParameter("no"));
	
UserDAO dao = new UserDAO();

	//삭제 결과에 따라 페이지 이동
	String path = "";
	if(dao.remove(no)){
		path = "listPro.jsp";
	}else{
		path = "getPro.jsp?no"+no;
	}
	
	response.sendRedirect(path);
%>


