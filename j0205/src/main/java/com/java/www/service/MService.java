package com.java.www.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface MService {
	
	void execute(HttpServletRequest request, HttpServletResponse response);
}
