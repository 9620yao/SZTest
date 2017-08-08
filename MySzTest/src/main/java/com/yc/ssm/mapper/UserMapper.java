package com.yc.ssm.mapper;

import java.util.List;

import com.yc.ssm.entity.Users;

public interface UserMapper {

	// int insertUser(Map<String,Object> map);

	int insertUser(Users user);

	List<Users> ListUser();
}
