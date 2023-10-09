package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.User;
import com.example.repositories.UserRepository;


@Service
public class UserServiceImpl implements UserService { 
	
	@Autowired 
	private UserRepository userRepo; 

	@Override 
	public void addUser(User user) { 
		
		try {
			User temp = userRepo.save(user); 
			System.out.println("Print Temp"); 
			System.out.println(temp); 
		} 
		catch (IllegalArgumentException e) { // if user is null 
			System.out.println(e); 
		}
	}

	
	@Override
	public Integer loginUser(String userName, String password) { 
		return userRepo.loginUser(userName, password);   
	} 
	
	
	
	
}
