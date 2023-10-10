package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.dtos.UserInfoDTO;
import com.example.dtos.UserLoginDTO;
import com.example.entities.User;
import com.example.services.UserService;


@RestController
@CrossOrigin
public class UserController {
	
	@Autowired 
	private UserService userService; 
	
	
	@PostMapping("/api/add/user")  
	public void addUser(@RequestBody User user) {	// Here, void or User ??? 
		userService.addUser(user); 
	} 
	
	@PostMapping("/api/login") 
	public Integer loginUser(@RequestBody UserLoginDTO userLoginDto) {
		String userName = userLoginDto.getUserName(); 
		String password = userLoginDto.getPassword(); 
		
		return userService.loginUser(userName, password); 
	}
	
	
	@GetMapping("/api/user/{userId}") 
	public UserInfoDTO getUser(@PathVariable Integer userId) {
		return userService.getUser(userId); 
	}
	
	
	
}
