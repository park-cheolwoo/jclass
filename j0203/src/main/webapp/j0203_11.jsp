<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키저장하기</title>
	</head>
	<body>
		<h2>로그인</h2>
		<%
			String ck_id = "";
			Cookie[] cookies = request.getCookies();
			for(Cookie cookie:cookies){
				if(cookie.getName().equals("cook_id")){
					ck_id = cookie.getValue();
				}
			}
		%>
		<form action="loginCk.jsp" method="get">
			<label>아이디</label>
			<input type='text' name='id' value=<%=ck_id %>><br/>
			<label>패스워드</label>
			<input type='text' name='pw'><br/>
			<input type='checkbox' name="saveId" id='saveId' value="saveId" <% if(!ck_id.equals("")) {%> checked <%}%>>
			<label for='saveId'>아이디 기억하기</label>
			<br/>
			<input type='submit' value='로그인'><br/>
		</form>
	</body>
</html>