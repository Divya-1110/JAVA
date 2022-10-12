package com.nissan.service;

import java.util.List;

import com.nissan.dto.UserLocationPost;
import com.nissan.model.User;

public interface IUserService {
	
	//list all users
	List<User> getAllUsers();
	
	//list custom report
	List<UserLocationPost> getAllUsersLocationPostsDTO();

}
