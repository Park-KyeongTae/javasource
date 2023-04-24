<%@page import="book.domain.BookDTO"%>
<%@page import="java.util.List"%>
<%@page import="book.persostence.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

 //DAO 객체 생성
 BookDAO dao = new BookDAO(); // BookDAO 객체생성

 //메소드 실행 후 결과 받기
 List<BookDTO> list = dao.getList(); // getList()메소드 호출 list 변수로 받기
 //받은 결과를 공유
 
 
 
 request.setAttribute("list", list);
 pageContext.forward("list.jsp");



%>