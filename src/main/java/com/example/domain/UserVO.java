package com.example.domain;

public class UserVO {
	private int u_no;
	private String u_name;
	private String u_birth;
	private char u_gender;
	private String u_id;
	private String u_password;
	



	@Override
	public String toString() {
		return "UserVO [u_no=" + u_no + ", u_name=" + u_name + ", u_birth=" + u_birth + ", u_gender=" + u_gender
				+ ", u_id=" + u_id + ", u_password=" + u_password + "]";
	}
	

	public int getU_no() {
		return u_no;
	}
	public void setU_no(int u_no) {
		this.u_no = u_no;
	}
	
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	
	public String getU_birth() {
		return u_birth;
	}


	public void setU_birth(String u_birth) {
		this.u_birth = u_birth;
	}
	public char getU_gender() {
		return u_gender;
	}
	public void setU_gender(char u_gender) {
		this.u_gender = u_gender;
	}
	
	public String getU_id() {
		return u_id;
	}


	public void setU_id(String u_id) {
		this.u_id = u_id;
	}


	public String getU_password() {
		return u_password;
	}


	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	

}
