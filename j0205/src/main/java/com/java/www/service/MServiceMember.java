package com.java.www.service;

import java.util.ArrayList;

import com.java.www.dao.MemberDao;
import com.java.www.dto.MemberDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MServiceMember implements MService {

	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("MServiceMember 호출");
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		MemberDao mdao = new MemberDao();
		list = mdao.mList();
		System.out.println("-------------");
		for(MemberDto member : list) {
			System.out.println("이름 : "+member.getId());
		}
		
		request.setAttribute("list", list);
	}

}
