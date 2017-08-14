package com.yc.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.ssm.entity.Img;
import com.yc.ssm.mapper.ImgMapper;
import com.yc.ssm.service.ImgService;

@Service("imgService")
public class ImgserviceImpl implements ImgService {

	@Autowired
	private ImgMapper imgMapper;

	@Override
	public boolean insertImg(Img img) {
		return imgMapper.insertimg(img) > 0;
	}

}
