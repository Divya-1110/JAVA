package com.nissan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.dto.UserLocationPost;
import com.nissan.model.User;
import com.nissan.service.IUserService;

@CrossOrigin
@RestController
@RequestMapping("/api/")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	//get all users
	public  List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	//get all userLocationPost
	public  List<UserLocationPost> getAllUserLocationPostDTO(){
	return userService.getAllUsersLocationPostsDTO();
	}
	

}
