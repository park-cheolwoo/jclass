<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키</title>
</head>
<body>
	<h2>현재 쿠키 정보</h2>
	<%
	Cookie[] cookies = request.getCookies();
	if(cookies != null){
		for(int i=0;i<cookies.length;i++){
			out.println("쿠키정보 : "+cookies[i].getName()+" / "+cookies[i].getValue()+"<br/>");
		}
	}
	%>
	<hr>
	<h2>쿠키 저장</h2>
	<form action="./cookSave.jsp" method="get">
		<label>쿠키이름</label>
		<input type='text' name='cookN'><br/>
		<label>쿠키값</label>
		<input type='text' name='cookV'><br/>
		<input type='submit' value="저장하기">
	
	</form>
	<hr>
	<h2>쿠키 삭제</h2>
	<form action="./cookDelete.jsp" method="get">
		<label>쿠키이름</label>
		<input type='text' name='cookN'><br/>
		<input type='submit' value="삭제하기">
	</form>
	

</body>
</html>