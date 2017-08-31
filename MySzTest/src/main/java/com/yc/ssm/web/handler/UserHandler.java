package com.yc.ssm.web.handler;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

	/**
	 * 页面获取数据，目前没有分页
	 * 
	 * @return user对象，包含partner对象
	 */
	@RequestMapping(value = "get", method = RequestMethod.POST)
	@ResponseBody
	public List<Users> Get() {
		LogManager.getLogger().debug("我进来了....");// equals(obj)
		return UsersService.listUser();// 返回页面数据
	}

	/**
	 * 添加数据（user和partner同步添加）
	 * 
	 * @param user：前台传过来的user对象，包含partner对象
	 * @return
	 */
	@RequestMapping(value = "put", method = RequestMethod.POST)
	public ModelAndView addpower(Users user) {
		LogManager.getLogger().debug("我进来了.... user:" + user);
		ModelAndView view = new ModelAndView();
		if (user != null && !user.equals("")) {// 传入的user不为空
			if (partnerService.insertPartner(user.getPartner())) {// 添加partner对象
				UsersService.insertUser(user);// 添加user对象
				view.setViewName("success");
			}
			view.setViewName("fail");
		}
		// return "/page/success.jsp";// redirct:/
		return view;// user对象传入失败时
	}

}
