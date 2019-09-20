package com.pdd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pdd.biz.UserBiz;
import com.pdd.entity.Users;

@RestController
public class UserController {

	@Autowired
	private UserBiz ub;

	public UserBiz getUb() {
		return ub;
	}

	public void setUb(UserBiz ub) {
		this.ub = ub;
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public Users login(String username,String password) {
		System.out.println("1111");
		return ub.selectByUsersnameAndPassword(username, password);
	}
}
