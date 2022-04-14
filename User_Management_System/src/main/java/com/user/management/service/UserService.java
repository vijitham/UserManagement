package com.user.management.service;

import java.util.List;

import com.user.management.model.User;

public interface UserService {

	List<User> getAllUser();
	
	void saveUser(User user);
	
	User getUserById(long id);
	
	void deleteUserById(long id);
}
