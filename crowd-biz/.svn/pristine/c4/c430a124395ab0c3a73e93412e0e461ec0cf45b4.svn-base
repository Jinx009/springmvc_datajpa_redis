package com.code.service.sys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




import com.code.dao.sys.WebTemplateDao;
import com.code.entity.sys.WebTemplate;

@Service
@Transactional(readOnly = true)
public class WebTemplateService {

	@Autowired
	private WebTemplateDao webTemplateDao;
	
	/**
	 * 选出可用模板状态
	 * @param status
	 * @return
	 */
	@Transactional(readOnly = false)
	public List<WebTemplate> getUse(int status){
		return webTemplateDao.findByStatus(status);
	}
	
}
