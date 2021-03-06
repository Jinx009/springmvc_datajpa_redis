package com.code.service.user;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.code.dao.sys.WebAddressDao;
import com.code.dao.user.WebUserInfoDao;
import com.code.entity.sys.WebAddress;
import com.code.entity.user.WebUserInfo;

@Service
@Transactional(readOnly = true)
public class WebUserInfoService {

	@Autowired
	private WebUserInfoDao webUserInfoDao;
	@Autowired
	private WebAddressDao webAddressDao;
	
	/**
	 * 新建用户信息
	 * @param webUserInfo
	 * @return
	 */
	public WebUserInfo save(WebUserInfo webUserInfo){
		List<WebAddress> list = webAddressDao.findByParentId(-1);
		WebAddress webAddress = null;
		if(null!=list&&!list.isEmpty()){
			webAddress = list.get(0);
		}
		
		webUserInfo.setCreateDate(new Date());
		webUserInfo.setLastUpdateDate(new Date());
		webUserInfo.setProvince(webAddress);
		webUserInfo.setCity(webAddress);
		return webUserInfoDao.save(webUserInfo);
	}
	
	/**
	 * 获取用户资料
	 * @param userId
	 * @return
	 */
	public WebUserInfo get(long userId){
		return webUserInfoDao.get(userId);
	}

	/**
	 * 修改用户昵称
	 * @param webUserInfo
	 */
	@Transactional
	public void updateNickName(WebUserInfo webUserInfo){
		webUserInfoDao.updateNickName(webUserInfo.getId(),webUserInfo.getNickName());
	}

	/**
	 * 修改用户实名和身份证信息
	 * @param idCard
	 * @param realName
	 */
	@Transactional
	public void updateRealNameStatus(String idCard, String realName,long id) {
		webUserInfoDao.updateRealNameStatus(idCard,realName,id);
	}

}
