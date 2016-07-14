package com.code.service.home;

import java.util.List;

import com.code.dao.home.ConfigDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.code.entity.sys.HomeConfig;

@Service("homeConfigService")
@Transactional(readOnly = true)
public class HomeConfigService {
	
	@Autowired
	private ConfigDao homeConfigDao;
	
	@Transactional(readOnly = false)
	public List<HomeConfig> findAll(){
		return (List<HomeConfig>) homeConfigDao.findAll();
	}
	
}
