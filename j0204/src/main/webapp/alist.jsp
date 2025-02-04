<%@page import="com.java.www.Member"%>
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
			String[] id = {"aaa","bbb","ccc","ddd","eee",
						   "fff","ggg","hhh","iii","jjj"};
			String[] name = {"홍길동", "유관순", "이순신", "강감찬", "김구", "김유신", "홍길자", "홍길순", "을지문덕", "신사임당"};
			ArrayList<Member> list = new ArrayList<Member>(); // ArrayList, Member Import해야함
			for(int i=0;i<10;i++){
				list.add(new Member(id[i],name[i]));
			}
			
			request.setAttribute("list",list);
			//input박스의 값은 request -> request.getParameter()
		%>
		<form action="j0204_04.jsp" method="post">
			<label>값</label>
			<input type='text' name="count">
			<input type="submit" value="전송">	
		</form>
	</body>
</html>