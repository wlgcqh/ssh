package com.qiheng.service.impl;

import java.util.List;

import com.qiheng.DAO.UserDAO;
import com.qiheng.bean.User;
import com.qiheng.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDAO dao;

	public UserDAO getDao() {
		return dao;
	}

	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	public void saveUser(User user) {
		dao.saveUser(user);
	}

	public List<User> findAllUsers() {
		
		return dao.findAllUsers();
	}

	public void deleteUser(int id) {
		dao.deleteUser(id);
		
	}

	public void updateUser(User user) {
		dao.updateUser(user);
		
	}

	public User findUserById(int id) {
		return dao.findUserById(id);
	}

	

}
