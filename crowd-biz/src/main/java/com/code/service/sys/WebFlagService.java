package com.code.service.sys;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.dao.sys.WebFlagDao;
import com.code.entity.sys.WebFlag;

@Service
public class WebFlagService {

	@Autowired
	private WebFlagDao webFlagDao;
	
	/**
	 * 新建标签仓库
	 * @param webFlag
	 */
	public void save(WebFlag webFlag){
		webFlag.setCreateDate(new Date());
		webFlag.setLastUpdateDate(new Date());
		webFlag.setStatus(1);
		webFlagDao.save(webFlag);
	}

	/**
	 * 获取项目标签列表
	 * @return
	 */
	public List<WebFlag> findAll() {
		List<WebFlag> list = webFlagDao.getAll();
		return list;
	}
	
}
