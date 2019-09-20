package com.pdd.biz;

import com.pdd.entity.Users;

public interface UserBiz {
	 public Users selectByUsersnameAndPassword(String username,String password);
}
