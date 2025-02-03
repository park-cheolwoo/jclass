<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp태그</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collpase;
}

table {
	width: 800px;
	margin: 10px auto;
}

th, td {
	width: 150px;
	heigth: 40px;
}
</style>
</head>
<body>
	<%!
		String[] name = {"홍길동","유관순","이순신","강감찬","김구","홍길자","홍길순","김유신","을지문덕","신사임당"};
	%>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
	<% for(int i=0;i<10;i++) { %>		
		<tr>
			<td><%=i+1%></td>
			<td>안녕하세요.<%=i+1%></td>
			<td><%=name[i]%></td>
			<td>2025-02-03</td>
			<td><%= (i+1)*100 %></td>
		</tr>
	<% } %>	
		
	</table>

</body>
</html>