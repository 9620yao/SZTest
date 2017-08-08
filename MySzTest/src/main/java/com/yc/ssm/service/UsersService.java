package com.yc.ssm.service;

import java.util.List;

import com.yc.ssm.entity.Users;

public interface UsersService {

	List<Users> listUser();

	boolean insertUser(Users user);
}
