package com.yc.ssm.web.handler;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.ssm.entity.Users;
import com.yc.ssm.service.UsersService;

@Controller("UserHandler")
@RequestMapping("user")
public class UserHandler {

	@Autowired
	private UsersService UsersService;

	@RequestMapping(value = "get", method = RequestMethod.POST)
	@ResponseBody
	public List<Users> Get() {
		LogManager.getLogger().debug("我进来了....");
		return UsersService.listUser();
	}

	@RequestMapping(value = "put", method = RequestMethod.POST)
	public String addpower(Users user) {
		LogManager.getLogger().debug("我进来了.... user:" + user);
		// return "/page/success.jsp";// redirct:/
		return "/page/success";// redirct:/
	}

}
