package com.yc.ssm.web.handler;

import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yc.ssm.entity.Partner;
import com.yc.ssm.entity.Users;

@Controller("UserHandler")
@RequestMapping("user")
public class UserHandler {

	@RequestMapping(value = "getput", method = RequestMethod.POST)
	public String Put(Partner partner) {
		LogManager.getLogger().debug("我进来了.... Partner:" + partner);
		return "/page/success.jsp";// redirct:/
	}

	@RequestMapping(value = "put", method = RequestMethod.POST)
	public String addpower(Users user) {
		LogManager.getLogger().debug("我进来了.... user:" + user);
		//return "/page/success.jsp";// redirct:/
		return "/page/success";// redirct:/
	}

}
