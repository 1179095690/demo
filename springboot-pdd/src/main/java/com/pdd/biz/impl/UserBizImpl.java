package com.pdd.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdd.biz.UserBiz;
import com.pdd.dao.UsersMapper;
import com.pdd.entity.Users;

@Service
@Transactional
public class UserBizImpl implements UserBiz {
	
	@Autowired
	private UsersMapper um;
	public UsersMapper getUm() {
		return um;
	}
	public void setUm(UsersMapper um) {
		this.um = um;
	}

	@Override
	public Users selectByUsersnameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return um.selectByUsersnameAndPassword(username, password);
	}

}
