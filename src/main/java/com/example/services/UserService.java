package com.example.services;

import com.example.dtos.UserInfoDTO;
import com.example.entities.User;

public interface UserService {
	
	public void addUser(User user); 
	
	public Integer loginUser(String userName, String password);  
	
	public UserInfoDTO getUser(Integer userId); 
}
