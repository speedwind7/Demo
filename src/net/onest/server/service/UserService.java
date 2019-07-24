package net.onest.server.service;

import java.util.List;

import net.onest.server.entity.User;

public interface UserService {
    
	public List<User> findAllUsers();
	public int insertUser(User u);
	public User signup(User u);
	public User signon(User u);
	
}
