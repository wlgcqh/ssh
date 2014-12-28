package com.qiheng.action.user;

import com.opensymphony.xwork2.ActionSupport;
import com.qiheng.service.UserService;

public class DeleteUserAction extends ActionSupport {
	
	private int id;
	
	private UserService userService;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public String execute() throws Exception {
		userService.deleteUser(id);
		return SUCCESS;
	}
}
