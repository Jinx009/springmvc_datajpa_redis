package com.code.service.pro;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.dao.project.WebProjectContractDao;
import com.code.entity.project.WebProjectContract;

@Service
public class WebProjectContractService {

	@Autowired
	private WebProjectContractDao webProjectContractDao;
	
	/**
	 * 保存合同模板
	 * @param webProjectContract
	 */
	public void save(WebProjectContract webProjectContract){
		webProjectContract.setCreateDate(new Date());
		webProjectContract.setLastUpdateDate(new Date());
		webProjectContractDao.save(webProjectContract);
	}
	
	
	
}
