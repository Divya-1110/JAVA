package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dto.UserLocationPost;
import com.nissan.model.User;
import com.nissan.repo.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
	//autowired
	@Autowired
	IUserRepository userRepository;

	//from user
	@Override
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();

	}

	//from-user-location-post
	@Override
	public List<UserLocationPost> getAllUsersLocationPostsDTO() {	
	return userRepository.getAllUsersLocPosts();
	}
	

}
