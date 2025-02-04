<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 변수,흐름제어(for,if,switch),변수출력 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jstl</title>
	</head>
	<body>
	<% String sid = "aaa"; %>
	<div>스크립트릿 사용 id : <%= sid %></div>
	<hr>
	<!-- 변수선언 -->
	<c:set var="id" value="ccc"/>
	<div>jstl 변수값 : ${id}</div>
	<c:if test="${id == 'bbb'}">
		<div>id는 bbb입니다.</div>	
	</c:if>
	
	<c:if test="${id != 'bbb' }">
		<div>id의 값은 bbb가 아닙니다. 정답 : ${id }</div>
	</c:if>
	
	<c:forEach begin="1" end="10" step="1" var="i">
		<div>i 변수값 : ${i}</div>
	</c:forEach>
	
	<c:set var='score' value="55" />
	<c:choose>
	<c:when test="${score>=90 }">
		<div>성적 : A</div>
	</c:when>
	<c:when test="${score>=80 }"> <!-- 문자비교가 형 변환 없이 가능 -->
		<div>성적 : B</div>
	</c:when>
	<c:when test="${score>=70 }">
		<div>성적 : C</div>
	</c:when>
	<c:when test="${score>=60 }">
		<div>성적 : D</div>
	</c:when>
	<c:otherwise>
		<div>성적 : F</div>
	</c:otherwise>
	</c:choose>
	
	
	</body>
</html>