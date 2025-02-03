package com.naver.www;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/StuCom")
public class StuCom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stuNo = request.getParameter("stuNo");
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		int total = kor+eng+math;
		double avg = total/3.0;
		System.out.println("학번 : "+stuNo);
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("합계 : "+total);
		System.out.printf("평균 : %.2f \n",avg);
		response.setContentType("text/html;charset=utf-8"); //html
		request.setCharacterEncoding("utf-8");
		
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>페이지</title></head>");
		writer.println("<body>");
		writer.println("<h2>학생 정보</h2>");
		writer.printf("<h4>학번 : %s </h4><br/>",stuNo);
		writer.printf("<h4>이름 : %s </h4><br/>",name);
		writer.printf("<h4>국어 : %d </h4><br/>",kor);
		writer.printf("<h4>영어 : %d </h4><br/>",eng);
		writer.printf("<h4>수학 : %d </h4><br/>",math);
		writer.printf("<h4>합계 : %d </h4><br/>",total);
		writer.printf("<h4>평균 : %.2f </h4><br/>",avg);		
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
		
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출");
		doAction(request, response);
	}

}
