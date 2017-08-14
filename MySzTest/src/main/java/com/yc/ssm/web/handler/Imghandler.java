package com.yc.ssm.web.handler;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.yc.ssm.entity.Img;
import com.yc.ssm.service.ImgService;
import com.yc.ssm.util.UploadFIleUtil;

import net.coobird.thumbnailator.Thumbnails;

@Controller("imghandler")
@RequestMapping("img")
public class Imghandler {

	@Autowired
	private ImgService imgService;

	/**
	 * 
	 * @param picData
	 *            上传的图片
	 * @param img
	 *            img对象
	 * @return
	 */
	@RequestMapping(value = "add", method = RequestMethod.POST)
	@ResponseBody
	public boolean addPic(@RequestParam("picData") MultipartFile picData, Img img) {
		LogManager.getLogger().debug("我进来了.... picData:" + picData + ",img" + img);
		if (picData != null && !picData.isEmpty()) {
			String content = null;
			File dest = null;
			try {
				dest = UploadFIleUtil.getUploadFile(picData.getOriginalFilename());
				// 压缩图片
				Thumbnails.of(picData.getInputStream()).scale(1f).outputQuality(0.25f).toFile(dest);
				// picData.transferTo(UploadFIleUtil.getUploadFile(picData.getOriginalFilename()));
				content = UploadFIleUtil.VIRTUAL_UPLOAD_DIR + "/" + picData.getOriginalFilename();
			} catch (IOException e) {
				try {
					picData.transferTo(dest);// 缩小失败，直接存储
				} catch (IllegalStateException | IOException e1) {
					e1.printStackTrace();
				}
			}
			img.setContent(content);
			System.out.println("上传图片地址==》" + content);
		}
		return imgService.insertImg(img);
	}
}
