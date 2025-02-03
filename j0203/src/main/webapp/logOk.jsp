<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>쿠키 정보 모두보기</title>
	</head>
	<body>
	<h2>쿠키 정보 보기</h2>
		<%
			Cookie[] cookies = request.getCookies();
			for(Cookie cookie:cookies){
				out.println(cookie.getName()+" / "+cookie.getValue()+"<br/>");
			}
		%>
		<br/><button type=button onclick="javascript:location.href='login.jsp'">이동하기</button>
	</body>
</html>