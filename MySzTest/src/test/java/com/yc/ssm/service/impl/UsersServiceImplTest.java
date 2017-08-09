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
		Partner p = new Partner();
		p.setPname("xiaoyao");
		boolean r1 = partnerService.insertPartner(p);
		//partnerService.getid();
		//int pid = p.getPid();
		Users user = new Users();
		user.setName("xiaoyao");
		user.setPartner(p);
		boolean result = usersService.insertUser(user);
		System.out.println(result);
		assertNotEquals(result, false);
		assertNotEquals(r1, false);
	}

	@Test
	public void Getpid() {
		System.out.println(partnerService.getid());
	}

	@Test
	public void insertp() {
		Partner Partner = new Partner();
		Partner.setPname("11");
		partnerService.insertPartner(Partner);
		int pid = Partner.getPid();
		System.out.println(pid);
	}

}
