<%@page import="com.java.www.Mem"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ArrayList</title>
	</head>
	<body>
		<% 
			String[] id = {"aaa","bbb","ccc","ddd","eee", "fff","ggg","hhh","iii","jjj"};
			String[] name = {"홍길동", "유관순", "이순신", "강감찬", "김구", "김유신", "홍길자", "홍길순", "을지문덕", "신사임당"};
			String[] hobby = {"게임", "골프", "수영", "독서", "게임,골프", "게임,수영", "게임,독서", "골프,수영", "골프,독서","수영,독서",
							  "게임,골프,수영", "게임,골프,독서", "골프,수영,독서", "게임,골프,수영,독서"};
			ArrayList<Mem> list = new ArrayList<Mem>(); // ArrayList, Member Import해야함
			for(int i=0;i<10;i++){
				list.add(new Mem(id[i],name[i],hobby[i]));
			}
			
			session.setAttribute("list",list);
			//input박스의 값은 request -> request.getParameter()
		%>
		<form action="j0204_06.jsp" method="post">
			<label>값</label>
			<input type='text' name="count">
			<input type="submit" value="전송">	
		</form>
	</body>
</html>