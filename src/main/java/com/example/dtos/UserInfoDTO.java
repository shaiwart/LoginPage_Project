package com.example.dtos;

public class UserInfoDTO {
	
	private String userName;  
	private String fullName; 
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", fullName=" + fullName + "]";
	} 
}
