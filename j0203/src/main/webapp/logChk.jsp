<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
	<h2>쿠키 저장/삭제하기</h2>
	<!-- html 주석 : 소스보기에 나타남 -->
	<%-- jsp 주석 : 소스보기에 나타나지 않음 --%>
	<!--  저장되었는지, 삭제되었는지 출력 -->
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String saveId = request.getParameter("saveId");
		if(saveId != null){
			Cookie cookie = new Cookie("cook_id",id);
			cookie.setMaxAge(60*60);
			response.addCookie(cookie);
	%>
		<div><%=id %> 쿠키가 저장되었습니다. </div><br/>
	<% }else{
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie:cookies){
		if(cookie.getName().equals("cook_id")){
		cookie.setMaxAge(0);
		response.addCookie(cookie);}
		}%>
	<div><%=id %> 쿠키가 삭제되었습니다.</div><br/>
	<%} %>
	<button type=button onclick="javascript:location.href='logOk.jsp'">이동하기</button>
	</body>
</html>