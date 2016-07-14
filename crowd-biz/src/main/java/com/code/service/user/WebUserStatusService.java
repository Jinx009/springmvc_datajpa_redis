package com.code.service.user;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.code.dao.user.WebUserStatusDao;
import com.code.entity.user.WebUserStatus;

@Service
@Transactional(readOnly = true)
public class WebUserStatusService {

	@Autowired
	private WebUserStatusDao webUserStatusDao;
	
	/**
	 * 新建用户状态
	 * @param webUserStatus
	 * @return
	 */
	public WebUserStatus save(WebUserStatus webUserStatus){
		webUserStatus.setApprovalStatus(0);
		webUserStatus.setBankStatus(0);
		webUserStatus.setCreateDate(new Date());
		webUserStatus.setInvestorLevel(0);
		webUserStatus.setInvestorStatus(0);
		webUserStatus.setLastUpdateDate(new Date());
		webUserStatus.setLeaderLevel(0);
		webUserStatus.setLoginFailTimes(0);
		webUserStatus.setLoginStatus(1);
		webUserStatus.setPayFailTimes(0);
		webUserStatus.setPayPwdSettingStatus(0);
		webUserStatus.setPayStatus(1);
		webUserStatus.setProjectLevel(0);
		webUserStatus.setUserStatus(1);
		return webUserStatusDao.save(webUserStatus);
	}

	/**
	 * 拿取用户状态信息
	 * @param userId
	 * @return
	 */
	public WebUserStatus get(Long userId) {
		return webUserStatusDao.findByUserId(userId);
	}

	/**
	 * 
	 * @param webUserStatus
	 * @return
	 */
	@Transactional
	public WebUserStatus update(WebUserStatus webUserStatus){
		return webUserStatusDao.save(webUserStatus);
	}

	/**
	 * 修改合格投资人状态
	 * @param id
	 */
	@Transactional
	public void updateInvestorStatus(Long id) {
		webUserStatusDao.updateInvestorStatus(id);
	}
	
}
