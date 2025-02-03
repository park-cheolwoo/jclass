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
	<%-- jsp주석 : 소스보기에 나타나지 읺음 --%>
	<!-- 선언식 -->
	<%!int no = 10;
	String name = "홍길동";
	int age = 20;
	String address = "서울 영등포구 여의도동";%>
	<table>
		<tr>
			<th>제목</th>
			<th>내용</th>
		</tr>
		<%
		for (int i = 0; i < 10; i++) {
		%>
		<tr>
			<td>학번</td>
			<td><%=i + 1%></td>
			<!-- 표현식 -->
		</tr>
		<tr>
			<td>이름</td>
			<td>
				<%
				out.println(name);
				%>
			</td>
			<!-- 스크립트릿 -->
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>