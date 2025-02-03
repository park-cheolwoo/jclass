<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>페이지</title>
</head>
<body>
	<h2>학생성적</h2>
	<form action="./StuCom" method="POST" name='frm'>
		<label>학번</label>
		<input type='text' name='stuNo'><br/>
		<label>이름</label>
		<input type='text' name='name'><br/>
		<label>국어</label>
		<input type='text' name='kor'><br/>
		<label>영어</label>
		<input type='text' name='eng'><br/>
		<label>수학</label>
		<input type='text' name='math'><br/>
		<input type='submit' value="저장"><br/>
	</form>
</body>
</html>