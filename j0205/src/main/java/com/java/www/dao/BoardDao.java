package com.java.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.DataSource;

import javax.naming.Context;
import javax.naming.InitialContext;

import java.util.ArrayList;

import com.java.www.dto.BoardDto;

public class BoardDao {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	DataSource ds;
	ArrayList<BoardDto> list;
	int bno;
	String btitle;
	String bcontent;
	String id;
	int bgroup;
	int bstep;
	int bindent;
	int bhit;

	// 전체 게시글 가져오기 메소드
	public ArrayList<BoardDto> bList() {
		System.out.println("BoardDao 접속");
		conn = getConnection();
		list = new ArrayList<BoardDto>();
		try {
			String sql = "select * from board";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				bno = rs.getInt("bno");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				id = rs.getString("id");
				bgroup = rs.getInt("bgroup");
				bindent = rs.getInt("bindent");
				bstep = rs.getInt("bstep");
				bhit = rs.getInt("bhit");
				list.add(new BoardDto(bno, btitle, bcontent, id, bgroup, bindent, bstep, bhit));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
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

		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}
