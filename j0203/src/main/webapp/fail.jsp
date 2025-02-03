<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>실패</title>
<style>
h2{color:red;}
</style>
</head>
<body>
	<h2>미성년자입니다.</h2>
	<div>이름 : <%= request.getParameter("name")%></div>
	<div>나이 : <%= request.getParameter("age")%></div>
</body>
</html>