package com.yc.ssm.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.ssm.entity.Partner;
import com.yc.ssm.entity.Users;
import com.yc.ssm.service.PartnerService;
import com.yc.ssm.service.UsersService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UsersServiceImplTest {

	@Autowired
	private UsersService usersService;

	@Autowired
	private PartnerService partnerService;

	@Test
	public void testListUser() {
		List<Users> listUsers = usersService.listUser();
		System.out.println(listUsers);
		assertNotNull(listUsers);
	}

	@Test
	public void InsertUser() {
		Partner p = new Partner(1002, "王二");
		boolean r1 = partnerService.insertPartner(p);
		Users user = new Users(1004, "王6", p);
		boolean result = usersService.insertUser(user);
		System.out.println(result);
		assertNotEquals(r1, false);
		assertNotEquals(result, false);
	}

}
