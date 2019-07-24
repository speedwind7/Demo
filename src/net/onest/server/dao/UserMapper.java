package net.onest.server.dao;

import java.util.List;


import net.onest.server.entity.User;


public interface UserMapper {

	public List<User> findAllUsers();
	
	public int insertUser(User u);
	public User signup(User u);
	public User signon(User u);
}
