package com.code.service.pro;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.dao.project.WebProjectFlagDao;
import com.code.entity.project.WebProjectFlag;

@Service
public class WebProjectFlagService {

	@Autowired
	private WebProjectFlagDao webProjectFlagDao;

	/**
	 * 保存产品标签
	 * @param webProjectFlag
	 * @return
	 */
	public WebProjectFlag save(WebProjectFlag webProjectFlag){
		webProjectFlag.setCreateDate(new Date());
		webProjectFlag.setLastUpdateDate(new Date());
		return webProjectFlagDao.save(webProjectFlag);
	}
	
}
