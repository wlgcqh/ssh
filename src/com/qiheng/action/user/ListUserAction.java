package com.qiheng.action.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.qiheng.bean.User;
import com.qiheng.service.UserService;

public class ListUserAction extends ActionSupport {

	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		
		List<User> list = this.userService.findAllUsers();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("list", list);
		
		return SUCCESS;
	}
}
