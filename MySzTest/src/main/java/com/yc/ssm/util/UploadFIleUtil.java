package com.yc.ssm.util;

import java.io.File;

public class UploadFIleUtil {

	public static String UPLOAD_DIR;
	public static String VIRTUAL_UPLOAD_DIR = "/fileupload/";

	/**
	 * 
	 * @param fileName文件名
	 * @return
	 */
	public static File getUploadFile(String fileName) {
		File file = new File(UPLOAD_DIR, fileName);// 上传文件
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		return file;
	}
}
