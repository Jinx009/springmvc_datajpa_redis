package com.code.service.pro;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.code.dao.project.WebProjectAttentionDao;
import com.code.entity.project.WebProjectAttention;
import com.code.entity.user.WebUser;

@Service
public class WebProjectAttentionService {

	@Autowired
	private WebProjectAttentionDao webProjectAttentionDao;
	
	/**
	 * 查询关注状态
	 * @param webUser
	 * @param id
	 * @return
	 */
	public int getStatus(WebUser webUser, Long id) {
		WebProjectAttention webProjectAttention = webProjectAttentionDao.findByUserAndPro(webUser.getId(),id);
		if(null!=webProjectAttention&&1==webProjectAttention.getStatus())
			return 1;
		return 0;
	}

	/**
	 * 关注项目
	 * @param webUser
	 * @param id
	 */
	@Transactional
	public void save(WebUser webUser, long id) {
		WebProjectAttention webProjectAttention = webProjectAttentionDao.findByUserAndPro(webUser.getId(),id);
		if(null==webProjectAttention){
			webProjectAttention = new WebProjectAttention();
			webProjectAttention.setCreateDate(new Date());
			webProjectAttention.setLastUpdateDate(new Date());
			webProjectAttention.setProjectId(id);
			webProjectAttention.setStatus(1);
			webProjectAttention.setWebUser(webUser);
			webProjectAttentionDao.save(webProjectAttention);
		}else{
			webProjectAttentionDao.saveStatus(webProjectAttention.getId());
		}
	}

	/**
	 * 取消关注项目
	 * @param webUser
	 * @param id
	 */
	@Transactional
	public void update(WebUser webUser, long id) {
		WebProjectAttention webProjectAttention = webProjectAttentionDao.findByUserAndPro(webUser.getId(),id);
		if(null==webProjectAttention){
			webProjectAttention = new WebProjectAttention();
			webProjectAttention.setCreateDate(new Date());
			webProjectAttention.setLastUpdateDate(new Date());
			webProjectAttention.setProjectId(id);
			webProjectAttention.setStatus(0);
			webProjectAttention.setWebUser(webUser);
			webProjectAttentionDao.save(webProjectAttention);
		}else
			webProjectAttentionDao.updateStatus(webProjectAttention.getId());
	}
	
}
