<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시판 리스트</title>
		<style>
			h2{text-align:center;}
			table,th,td{border:1px solid black; border-collapse:collapse;}
			table{width:800px; margin:10px auto; text-align:center;}
			th,td{height:40px;}
		</style>
	</head>
	<body>
		<h2>멤버 리스트</h2>
		<table>
			<colgroup>
				<col width="10%">
				<col width="*">
				<col width="15%">
				<col width="15%">
				<col width="15%">			
				<col width="15%">			
			</colgroup>
			<tr>
				<th>아이디</th>
				<th>패스워드</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>성별</th>
				<th>취미</th>
			</tr>
			<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.id} </td>
				<td>${dto.pw }</td>
				<td>${dto.name }</td>
				<td>${dto.tel }</td>
				<td>${dto.gender }</td>
				<td>${dto.hobby }</td>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>