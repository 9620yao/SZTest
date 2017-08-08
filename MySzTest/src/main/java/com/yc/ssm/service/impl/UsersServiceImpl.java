package com.yc.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.ssm.entity.Users;
import com.yc.ssm.mapper.UserMapper;
import com.yc.ssm.service.UsersService;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<Users> listUser() {
		return userMapper.ListUser();
	}

	// @Override
	// public boolean insertUser(Users user) {
	// Partner partner = user.getPartner();
	// if (partner != null && !partner.equals("")) {
	// Map<String, Object> map = new HashMap<String, Object>();
	// map.put("user", user);
	// map.put("partner", partner);
	// return userMapper.insertUser(map) > 0;
	// }
	// return false;
	// }

	@Override
	public boolean insertUser(Users user) {
		return userMapper.insertUser(user) > 0;
	}

}
