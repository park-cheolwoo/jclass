package com.java.www;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;


@WebServlet("*.do")
public class FController extends HttpServlet {
       
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
	
		String uri = request.getRequestURI();
		System.out.println("uri : "+uri);
		String uPath = request.getContextPath();
		System.out.println("uPath : "+uPath);
		String fileName = uri.substring(uPath.length());
		String[] fileName2 = (uri.split("\\."));
		System.out.println("split : "+Arrays.toString(uri.split("\\.")));
		System.out.println("연결 요청 파일 이름 : "+fileName);
		System.out.println("fileName2 : "+Arrays.toString(fileName2));
		System.out.println("연결 요청 파일 이름 : "+fileName2[0].substring(uPath.length()));
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request,response);
	}

}
