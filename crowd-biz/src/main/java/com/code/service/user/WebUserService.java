package com.code.service.user;

import java.util.Date;



import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.code.constants.HttpConstants;
import com.code.dao.user.WebUserDao;
import com.code.entity.user.WebUser;
import com.code.entity.user.WebUserAccount;
import com.code.entity.user.WebUserInfo;
import com.code.entity.user.WebUserStatus;
import com.code.model.util.GlobalModel;
import com.code.service.log.WebNoticeLogService;
import com.code.tool.HttpUtils;
import com.code.tool.RandomUtil;

@Service
@Transactional(readOnly = true)
public class WebUserService {

	@Autowired
	private WebUserDao webUserDao;
	@Autowired
	private WebUserStatusService webUserStatusService;
	@Autowired
	private WebUserInfoService webUserInfoService;
	@Autowired
	private WebUserAccountService webUserAccountService;
	@Autowired
	private WebNoticeLogService webNoticeLogService;

	/**
	 * 校验手机号码是否存在
	 * 
	 * @param userName
	 * @return
	 */
	@Transactional(readOnly = false)
	public WebUser findByUserName(String userName) {
		return webUserDao.findByUserName(userName);
	}

	/**
	 * 用户手机注册
	 * 
	 * @param userName
	 * @param pwd
	 * @throws Exception 
	 */
	@Transactional(readOnly = false)
	public WebUser register(WebUser webUser) throws Exception {
		webUser.setCreateDate(new Date());
		webUser.setLastUpdateDate(new Date());
		webUser.setInviteCode(generateCouponCode(4));
		webUser =  webUserDao.save(webUser);
		//账户信息
		WebUserAccount webUserAccount = new WebUserAccount();
		webUserAccount.setCreateIp(webUser.getCreateIp());
		webUserAccount.setUserId(webUser.getId());
		webUserAccountService.save(webUserAccount);
		//个人信息
		WebUserInfo webUserInfo = new WebUserInfo();
		webUserInfo.setCreateIp(webUser.getCreateIp());
		webUserInfo.setUserId(webUser.getId());
		webUserInfoService.save(webUserInfo);
		//账户状态
		WebUserStatus webUserStatus = new WebUserStatus();
		webUserStatus.setUserId(webUser.getId());
		webUserStatusService.save(webUserStatus);
		
		Map<String,String> params = new HashMap<String, String>();
		params.put("userName",webUser.getUserName());
		params.put("pwd",webUser.getPwd());
		HttpUtils.postParams(HttpUtils.getUrl(GlobalModel.get(HttpConstants.BANK_HOST),HttpConstants.BANK_REGISTER,params));
		return webUser;
	}

	/**
	 * 生成邀请码
	 * @param length
	 * @return
	 */
	private String generateCouponCode(int length) {
		String code = RandomUtil.getSpecialRandomCode(length);;
		if(!checkCode(code)){
			generateCouponCode(4);
		}
		return code;
	}

	/**
	 * 判断邀请码是否已经被使用
	 * @param code
	 * @return
	 */
	private boolean checkCode(String code) {
		WebUser webUser = webUserDao.findByInviteCode(code);
		if (null==webUser){
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 用户登录
	 * @param userName
	 * @param pwd
	 * @return
	 */
	public WebUser login(String userName, String pwd) {
		return webUserDao.login(userName,pwd);
	}
}
