<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>	
		<meta charset="UTF-8">
		<title>리스트 출력</title>
	</head>
	<body>
		<h2>데이터 값 출력</h2>
		<div>count값 : ${param.count }</div>
		<hr>
		<c:forEach items="${list}" var="member" varStatus="vs"> <%--  items : 리스트 안의 변수를 1개씩 호출 --%> <%--  vs.index : 리스트의 인덱스 호출 --%>
			<div>데이터 ${vs.index+1}: ${member.id },${member.name }</div> 
		</c:forEach>
	</body>
</html>