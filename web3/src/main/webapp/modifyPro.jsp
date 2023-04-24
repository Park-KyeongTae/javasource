<%@page import="user.domain.UserDTO"%>
<%@page import="user.persistence.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
int no = Integer.parseInt(request.getParameter("no")); // modify 값 가져와

UserDAO dao = new UserDAO(); // 객체 생성
UserDTO dto = dao.getRow(no); // dao.getRow(no)

request.setAttribute("dto", dto);
pageContext.forward("modify.jsp");



%>
