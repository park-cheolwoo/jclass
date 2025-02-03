<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Park 웹페이지 구현</title>
		<style>
			table,th,td{border:1px solid black; border-collapse:collapse;}
		</style>
	</head>
<body>
	<h2>웹페이지 오픈</h2>
	<table>
		<tr>
			<th>제목</th>
			<th>내용</th>
		</tr>
		<form method="POST" action="./HelloW">
			<input type="submit" value="전송"> 
		</form>
	</table>
</body>
</html>