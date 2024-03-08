package com.jwt.jwt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
public class User {

	private String uId;
	private String name;
	private String email;
	
	
	public User(String uId, String name, String email) {
		super();
		this.uId = uId;
		this.name = name;
		this.email = email;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", name=" + name + ", email=" + email + "]";
	}
}
