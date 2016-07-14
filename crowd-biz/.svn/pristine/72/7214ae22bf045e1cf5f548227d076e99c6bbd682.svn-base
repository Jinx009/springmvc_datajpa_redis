package com.code.service.sys;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.dao.sys.WebMaterialsDao;
import com.code.entity.sys.WebMaterials;

@Service
public class WebMaterialsService {

	@Autowired
	private WebMaterialsDao webMaterialsDao;
	
	/**
	 * 新建素材编码
	 * @param webMaterials
	 */
	public void save(WebMaterials webMaterials){
		webMaterials.setCreateDate(new Date());
		webMaterials.setLastUpdateDate(new Date());
		webMaterialsDao.save(webMaterials);
	}

	/**
	 * 获取所有素材编码
	 * @return
	 */
	public List<WebMaterials> findAllItems() {
		return webMaterialsDao.findAllItems();
	}
	
}
