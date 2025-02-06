<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인확인</title>
	</head>
	<body>
	<h2>로그인확인</h2>
	<%
	  String id = request.getParameter("id");
	  String pw = request.getParameter("pw");
	  if(id.equals("aaa") && pw.equals("1111")){
	  	session.setAttribute("session_id", id);
	    response.sendRedirect("j0204_01.jsp");
	  }else{
		response.sendRedirect("login.jsp");
	  }
	%>
	
	
	</body>
</html>