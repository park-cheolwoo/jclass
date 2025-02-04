<%@page import="java.sql.ResultSet"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>데이터베이스 연결</title>
	</head>
	<body>
	<%! 
		Connection conn;
		PreparedStatement pstmt;
		DataSource ds;
		ResultSet rs;
	%>
	<%
		try{
			Context ctx = new InitialContext();
			Context envContext = (Context)ctx.lookup("java:/comp/env");
			ds = (DataSource)envContext.lookup("jdbc/Oracle21");
			
			String sql = "select * from employees";
		    conn = ds.getConnection();
		    pstmt = conn.prepareStatement(sql);
		    rs = pstmt.executeQuery();
		    out.println("db접속 <br/>");
		  
		    while(rs.next()){
			    int employee_id = rs.getInt("employee_id");
			    String emp_name = rs.getString("emp_name");
			    out.println("사번/사원명 : "+employee_id+" / "+emp_name+"<br/>");
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