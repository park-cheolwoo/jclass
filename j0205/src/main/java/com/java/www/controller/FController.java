package com.java.www.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.java.www.service.BService;
import com.java.www.service.BServiceList;
import com.java.www.service.MService;
import com.java.www.service.MServiceMember;


@WebServlet("*.do")
public class FController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction 호출");
		
		//한글처리
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String cPath = request.getContextPath();
		String page = uri.substring(cPath.length());
		String url = "";
		BService bservice = null;
//		MService mservice = null;
		
		
		if(page.equals("/index.do")) {
			System.out.println("메인 페이지 연결");
			url = "index.jsp";
		}else if(page.equals("/login.do")) {
			System.out.println("로그인 페이지 연결");
			url = "login.jsp";
		}else if(page.equals("/input.do")) {
			System.out.println("회원가입 페이지 연결");
			url = "member.jsp";
		}else if(page.equals("/logout.do")) {
			System.out.println("로그아웃 페이지 연결");
			url = "logout.jsp";
		}else if(page.equals("/blist.do")) {
			System.out.println("FController 접속");
			System.out.println("게시판 페이지 연결");
			url = "blist.jsp";
			//전체 게시글 가져오기
			bservice = new BServiceList(); // 다형성 - 부모의 변수로 자손의 객체를 다룸
			bservice.execute(request,response); //request - list 데이터 담겨서 넘어옴
		}else if(page.equals("/member.do")) {
			System.out.println("FController 접속");
			System.out.println("회원정보 페이지 연결");
			MService mservice = new MServiceMember();
			mservice.execute(request, response);
			url = "member.jsp";
		}
			
		System.out.println("url : "+url);
//		response.sendRedirect(url);
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request,response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");
		doAction(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출");
		doGet(request, response);
	}

}
