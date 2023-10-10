package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dtos.UserInfoDTO;
import com.example.entities.User;
import com.example.repositories.UserRepository;

import jakarta.persistence.EntityNotFoundException;


@Service
public class UserServiceImpl implements UserService { 
	
	@Autowired
	private UserRepository userRepository; 

	@Override 
	public void addUser(User user) { 
		
		try {
			User temp = userRepository.save(user); 
			System.out.println("Print Temp"); 
			System.out.println(temp); 
		} 
		catch (IllegalArgumentException e) { // if user is null 
			System.out.println(e); 
		}
	}

	
	@Override
	public Integer loginUser(String userName, String password) { 
		return userRepository.loginUser(userName, password);   
	}


	@Override
	public UserInfoDTO getUser(Integer userId) { 
		UserInfoDTO temp = new UserInfoDTO();  
		
		try {
			temp.setUserName(userRepository.getById(userId).getUserName()); 
			temp.setFullName(userRepository.getById(userId).getFullName()); 
		} catch (EntityNotFoundException e) {
			System.out.println("There is no user with ID = 2");
		}
		return temp;  
	} 
	
	
	
	
}
