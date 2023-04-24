<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%


String userid = request.getParameter("userid");
String password = request.getParameter("password");

// loginPro 에서 userid, password 값을 공유하고 싶음
// setAttribute(), getAttribute(), removeAttribute()

request.setAttribute("userid", userid);
request.setAttribute("password", password);



 pageContext.forward("loginPro.jsp"); // forward 주소와 화면이 일치하지 않는다
 									  // login.jsp 에 있는 request, response 권한을 loginPro에게 넘겨준다
 									  // forward를 사용하는 이유
 									  // 페이지끼리 데이터 공유가 필요함 => 로그인, 장바구니 session,cookie
 									  // 데이터 공유 시 모든 데이터를 session을 사용하지 않음
 									  // session을 사용하지 않는 데이터 공유할 때 forward 필요함
 									  // ex) 게시판
%>