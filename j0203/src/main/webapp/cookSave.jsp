<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키 저장</title>
		</head>
	<body>
	<% 
	String cookN = request.getParameter("cookN");
	String cookV = request.getParameter("cookV");
	
	Cookie cookie = new Cookie(cookN,cookV); //쿠키 객체 생성
	cookie.setMaxAge(60*60*24*365); // 60초 * 60분 * 24시간 * 365일(1년)
	response.addCookie(cookie);
	%>
	<div><%= cookN %> 이 저장되었습니다.</div>
	<button onclick="javascript:location.href='./j0203_10.jsp'">페이지 이동하기</button>
	</body>
</html>