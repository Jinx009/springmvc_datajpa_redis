package com.code.service.user;

import java.util.Date;

import com.code.constants.WebUserAccountEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.code.dao.user.WebUserAccountDao;
import com.code.entity.user.WebUserAccount;


@Service
@Transactional(readOnly = true)
public class WebUserAccountService {

	@Autowired
	private WebUserAccountDao webUserAccountDao;
	
	/**
	 * 新建用户账户中心
	 * @param webUserAccount
	 * @return
	 */
	public WebUserAccount save(WebUserAccount webUserAccount){
		webUserAccount.setCreateDate(new Date());
		webUserAccount.setInvestMoney(0);
		webUserAccount.setUseMoney(0);
		webUserAccount.setLastUpdateDate(new Date());
		webUserAccount.setFrozenMoney(0);
		return webUserAccountDao.save(webUserAccount);
	}
	
	/**
	 * 获取用户账户中心数据
	 * @param id
	 * @return
	 */
	public WebUserAccount getByUserId(Long id) {
		return webUserAccountDao.findByUserId(id);
	}

	/**
	 * 更改用户资金
	 * @return
	 * true 操作成功
	 * false 操作失败
     */
	public synchronized  boolean updateWebUserAccountMoney(long userId,WebUserAccountEnum type, double money){
		boolean updateResult=false;
		try{
			WebUserAccount webUserAccount=webUserAccountDao.findByUserId(userId);
			if(webUserAccount!=null){
				switch (type){
					case ADD:
						webUserAccount.setUseMoney(webUserAccount.getUseMoney()+money);
						webUserAccountDao.save(webUserAccount);
						updateResult=true;
						break;
					case REDUCE:
						if(webUserAccount.getUseMoney()>=money){
							webUserAccount.setUseMoney(webUserAccount.getUseMoney()-money);
							webUserAccountDao.save(webUserAccount);
						}
						break;
					default:
						break;
				}
			}
		}catch (Exception e){
				e.printStackTrace();
		}
		return updateResult;
	}

}
