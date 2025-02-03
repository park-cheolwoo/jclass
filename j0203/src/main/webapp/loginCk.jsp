<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키 저장하기</title>
	</head>
	<body>
	<%
		String id = request.getParameter("id");
		String saveId = request.getParameter("saveId");
		if(saveId != null){
		Cookie cookie = new Cookie("cook_id",id);
		cookie.setMaxAge(60*60);
		response.addCookie(cookie);
	%>
	<div><%=cookie.getName() %>가 저장되었습니다.</div>
	<% }else{ 
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie:cookies){
			if(cookie.getName().equals("cook_id")){
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			}
		}
		%>
		<div>쿠키에 저장되어 있는 cook_id 가 삭제되었습니다.</div>
	<% } %>
	
	<button onclick="javascript:location.href='loginOk.jsp'">이동하기</button>
	</body>
</html>