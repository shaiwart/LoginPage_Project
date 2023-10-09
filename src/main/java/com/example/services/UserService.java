package com.example.services;

import com.example.entities.User;

public interface UserService {
	public void addUser(User user); 
	
	public Integer loginUser(String userName, String password);  
}
