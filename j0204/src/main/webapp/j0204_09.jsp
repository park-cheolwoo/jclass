<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<!-- board 정보를 출력하시오. -->
	<%! 
		Connection conn;
		PreparedStatement pstmt;
		ResultSet rs;
		DataSource ds;
	%>
	
	<%
		try{
			Context ctx = new InitialContext();
			Context envContext = (Context)ctx.lookup("java:comp/env/");
			ds = (DataSource)envContext.lookup("jdbc/Oracle21");
			String sql = "select * from board";
			conn = ds.getConnection(); // conn = connects()
			pstmt = conn.prepareStatement(sql); // cursor = conn.cursor()
			rs = pstmt.executeQuery(); // cursor.execute(sql)
			
			
			while(rs.next()){ // row = cursor.fetchone() (똑같지 않고 유사함)
				int bno = rs.getInt("bno");
				String btitle = rs.getString("btitle");
				out.println("번호/제목 : "+bno+" / "+btitle+"<br/>");
			}
			
			
		}catch(Exception e){
			   e.printStackTrace();
		   	}finally{
			   try{
				  if(rs!=null) rs.close();
				  if(pstmt!=null) pstmt.close();
				  if(conn!=null) conn.close();
			   }catch(Exception e2){
				   e2.printStackTrace();
			   }
		   }
	%>
	</body>
</html>