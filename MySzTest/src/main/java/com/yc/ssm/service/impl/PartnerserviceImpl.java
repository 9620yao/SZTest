package com.yc.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.ssm.entity.Partner;
import com.yc.ssm.mapper.PartnerMapper;
import com.yc.ssm.service.PartnerService;

@Service("partnerservice")
public class PartnerserviceImpl implements PartnerService {

	@Autowired
	private PartnerMapper partnerMapper;

	@Override
	public boolean insertPartner(Partner Partner) {
		return partnerMapper.insertPartner(Partner) > 0;
	}

	@Override
	public int getid() {
		return partnerMapper.getPid();
	}

	@Override
	public int insertP(Partner partner) {
		return partnerMapper.insertP(partner);
	}

}
