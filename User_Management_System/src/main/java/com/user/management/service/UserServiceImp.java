package com.user.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.management.model.User;
import com.user.management.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userrepository;
	
	
	@Override
	public List<User> getAllUser() {
		return userrepository.findAll();
	}

	@Override
	public void saveUser(User user) {
		this.userrepository.save(user);
		
	}

	@Override
	public User getUserById(long id) {
		Optional<User> optional = userrepository.findById(id);
		User user=null;
		
		if(optional.isPresent()) {
			user=optional.get();
		}
		
		else {
			throw new RuntimeException("User Not Found for Id::"+id);
		}
		return user;
	}

	@Override
	public void deleteUserById(long id) {
		this.userrepository.deleteById(id);
		
	}
	
	

}
