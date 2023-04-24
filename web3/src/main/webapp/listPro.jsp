<%@page import="user.domain.UserDTO"%>
<%@page import="java.util.List"%>
<%@page import="user.persistence.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

 UserDAO dao = new UserDAO(); // 객체생성
List<UserDTO>list = dao.getList(); //<>안에는  

//list를 list.jsp 에서 보여주고 싶음
//set을 해야 get을 할 수 있다.
request.setAttribute("list", list); //"list"에 list 내용을 담을게
pageContext.forward("list.jsp"); // list.jsp에게 내 request respons 권한 줄게






%>