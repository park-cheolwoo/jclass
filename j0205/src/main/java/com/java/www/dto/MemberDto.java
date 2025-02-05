package com.java.www.dto;

public class MemberDto {
	private String id;
	private String pw;
	private String name;
	private String tel;
	private String gender;
	private String hobby;
	
	public MemberDto() {}
	public MemberDto(String id, String pw, String name, String tel, String gender, String hobby) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.gender = gender;
		this.hobby = hobby;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	
}
