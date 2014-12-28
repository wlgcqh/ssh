package com.qiheng.action.user;

import com.opensymphony.xwork2.ActionSupport;
import com.qiheng.bean.User;
import com.qiheng.service.UserService;

public class SaveUserAction extends ActionSupport {

	private User user;

	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		
		this.userService.saveUser(user);
		
		return SUCCESS;
	}

}
