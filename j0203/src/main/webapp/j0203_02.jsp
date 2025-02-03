<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
</head>
<body>
<h2>회원가입</h2>
<form action="./FormSend" method="post" name="frm">
	<label>아이디</label>
	<input type='text' name='id'><br/>
	<label>패스워드</label>
	<input type='text' name='pw'><br/>
	<label>이름</label>
	<input type='text' name='name'><br/>
	<input type='submit' value='제출'>
</form>
</body>
</html>