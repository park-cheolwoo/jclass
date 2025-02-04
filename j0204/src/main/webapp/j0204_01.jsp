<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>main</title>
	</head>
	<body>
		<h2>메인페이지</h2>
		<div>세션정보 <%= session.getAttribute("session_id")%></div>
		<ul>
			<li>회원가입</li>
			<li>로그인</li>
			<li><a href='login.jsp'>회원정보</a></li>
			<li>게시판</li>
		</ul>
	</body>
</html>