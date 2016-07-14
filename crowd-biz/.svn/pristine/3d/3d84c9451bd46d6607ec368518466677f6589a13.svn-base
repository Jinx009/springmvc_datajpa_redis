package com.code.service.sys;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.dao.sys.WebAddressDao;
import com.code.entity.sys.WebAddress;

@Service
public class WebAddressService {

	@Autowired
	private WebAddressDao webAddressDao;

	/**
	 * 查询地址列表
	 * @param parentId
	 * @return
	 */
	public List<WebAddress> list(long parentId) {
		return webAddressDao.findByParentId(parentId);
	}
	
}
