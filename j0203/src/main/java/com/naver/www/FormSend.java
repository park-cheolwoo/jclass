package com.naver.www;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FormSend")
public class FormSend extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction 호출");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String major = request.getParameter("major");
		String[] hobby = request.getParameterValues("hobby"); // checkbox는 배열로 받아야함
		System.out.println("아이디 : "+id);
		System.out.println("패스워드 : "+pw);
		System.out.println("이름 : "+name);
		System.out.println("성별 : "+gender);
		System.out.println("학과 : "+major);
		String hobbys = "";
		for(int i=0;i<hobby.length;i++) {
			if(i==0) hobbys += hobby[i];
			else hobbys += (","+hobby[i]);			
			System.out.println(hobby[i]);
			}
		System.out.println("취미 : "+hobbys);
		String[] h = hobbys.split(","); // 분리방법
		
		//
		response.setContentType("text/html;charset=utf-8"); //html
		request.setCharacterEncoding("utf-8"); //한글인코딩
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>페이지</title></head>");
		writer.println("<body>");
		writer.println("<h2>회원가입 정보</h2>");
		writer.printf("<h4>아이디 : %s </h4>\n",id);
		writer.printf("<h4>패스워드 : %s </h4>\n",pw);
		writer.printf("<h4>이름 : %s </h4>\n",name);
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
		
		
		
		
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");
		doAction(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출");
		doAction(request,response);
	}

}
