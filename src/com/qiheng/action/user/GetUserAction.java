package com.qiheng.action.user;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qiheng.bean.User;
import com.qiheng.service.UserService;

public class GetUserAction extends ActionSupport {

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
		User user = this.userService.findUserById(id);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("user", user);
		
		return SUCCESS;
	}
	
}
