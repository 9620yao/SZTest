package com.yc.ssm.web.handler;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.ssm.entity.Users;
import com.yc.ssm.service.PartnerService;
import com.yc.ssm.service.UsersService;

@Controller("UserHandler")
@RequestMapping("user")
public class UserHandler {

	@Autowired
	private UsersService UsersService;

	@Autowired
	private PartnerService partnerService;

	@RequestMapping(value = "get", method = RequestMethod.POST)
	@ResponseBody
	public List<Users> Get() {
		LogManager.getLogger().debug("我进来了....");// equals(obj)
		return UsersService.listUser();// 返回页面数据
	}

	@RequestMapping(value = "put", method = RequestMethod.POST)
	public String addpower(Users user) {
		LogManager.getLogger().debug("我进来了.... user:" + user);
		if (user != null && !user.equals("")) {// 传入的user不为空
			if (partnerService.insertPartner(user.getPartner())) {// 添加partner对象
				UsersService.insertUser(user);// 添加user对象
				return "/page/success";
			}
			return "/page/fail";
		}
		// return "/page/success.jsp";// redirct:/
		return "/page/m_index";// user对象传入失败时
	}

}
