<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>모든 쿠키 확인</title>
	</head>
	<body>
		<h2>모든 쿠키 정보 확인</h2>
		<%
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie:cookies){
			out.print(cookie.getName()+" / "+cookie.getValue()+"<br/>");
		}
		%>
		<button onclick="javascript:location.href='j0203_11.jsp'">이동하기</button>
	</body>
</html>