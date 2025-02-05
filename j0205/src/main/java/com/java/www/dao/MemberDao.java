package com.java.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.java.www.dto.MemberDto;

public class MemberDao {
	Connection conn;
	DataSource ds;
	ResultSet rs;
	PreparedStatement pstmt;
	ArrayList<MemberDto> list = new ArrayList<MemberDto>();
	
	public ArrayList<MemberDto> mList() {
		System.out.println("MemberDto 호출");
		try {conn = getConnection();
		String sql = "select * from member";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String tel = rs.getString("tel");
				String gender = rs.getString("gender");
				String hobby = rs.getString("hobby");
				list.add(new MemberDto(id,pw,name,tel,gender,hobby));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return list;
		
	}
	
	
	
	
	
	public Connection getConnection() {
		Connection connection = null;
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:comp/env/");
			ds = (DataSource) envContext.lookup("jdbc/Oracle21");
			connection = ds.getConnection();
			System.out.println("연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
