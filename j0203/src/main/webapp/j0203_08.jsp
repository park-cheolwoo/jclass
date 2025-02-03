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
		<input type="text" name="id"><br/>
		<label>비밀번호</label>
		<input type="text" name="pw"><br/>
		<label>이름</label>
		<input type="text" name="name"><br/>
		<label>성별</label><br/>
		<input type="radio" id="man" name="gender" value="man">
		<label for="man">남자</label>
		<input type="radio" id="woman" name="gender" value="woman">
		<label for="woman">여자</label><br/>
		<label>취미</label><br/>
		<input type="checkbox" name="hobby" id="game" value="game">
		<label for="game">게임</label>
		<input type="checkbox" name="hobby" id="golf" value="golf">
		<label for="golf">골프</label>
		<input type="checkbox" name="hobby" id	="swim" value="swim">
		<label for="swim">수영</label>
		<input type="checkbox" name="hobby" id="read" value="read">
		<label for="read">독서</label><br/>
		<select name="major">
			<option value="컴퓨터공학">컴퓨터공학</option>
			<option value="국문학">국문학</option>
			<option value="영문학">영문학</option>
		</select>
		
		<input type="submit" value="가입완료" />
		
		
		</form>
	</body>
</html>