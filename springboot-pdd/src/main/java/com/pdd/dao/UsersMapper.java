package com.pdd.dao;

import org.apache.ibatis.annotations.Param;

import com.pdd.entity.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    
    public Users selectByUsersnameAndPassword(@Param("name") String username,@Param("pwd") String password);
}