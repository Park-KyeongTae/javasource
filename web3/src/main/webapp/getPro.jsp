<%@page import="user.domain.UserDTO"%>
<%@page import="user.persistence.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

int no = Integer.parseInt(request.getParameter("no")); // no값 가져오기

UserDAO dao = new UserDAO(); // dto 객체 생성
UserDTO dto = dao.getRow(no); // dao getRow(no) 메소드 UserDTO dto 담기

request.setAttribute("dto", dto); // "dto" 이름으로 dto 내용 담아 넣을게 
pageContext.forward("get.jsp"); // requset, response get.jsp에 넘길게




%>