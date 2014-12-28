package com.qiheng.DAO;

import java.util.List;

import com.qiheng.bean.User;

public interface UserDAO {

	void saveUser(User user);
	
	List<User> findAllUsers();
	
	void deleteUser(int id);
	
	void updateUser(User user);
	
	User findUserById(int id);
}
