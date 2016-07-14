package com.code.service.pro;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.dao.project.WebProjectLeaderDao;
import com.code.dao.user.WebUserInfoDao;
import com.code.entity.project.WebProjectLeader;
import com.code.entity.user.WebUser;
import com.code.entity.user.WebUserInfo;
import com.code.model.pro.ProjectLeaderModel;

@Service
public class WebProjectLeaderService {

	@Autowired
	private WebProjectLeaderDao webProjectLeaderDao;
	@Autowired
	private WebUserInfoDao webUserInfoDao;
	
	/**
	 * 新申请项目领投人
	 * @param webUser
	 * @param webProjectLeader
	 */
	public void save(WebUser webUser,WebProjectLeader webProjectLeader){
		webProjectLeader.setCreateDate(new Date());
		webProjectLeader.setLastUpdateDate(new Date());
		webProjectLeader.setStatus(0);
		webProjectLeaderDao.save(webProjectLeader);
	}

	/**
	 * 获取领投状态
	 * @param id
	 * @param webProject
	 * @param type
	 * @return
	 */
	public int getStatus(Long id, WebUser webUser, int type) {
		if(2!=type)
			return -1;
		else{
			WebProjectLeader webProjectLeader = webProjectLeaderDao.findLeader(id);
			if(null!=webProjectLeader)
				return 1;
			else{
				WebProjectLeader webProjectLeader2 = webProjectLeaderDao.findByUserIdAndProjectId(webUser.getId(),id);
				if(null!=webProjectLeader2){
					return 0;
				}else
					return 2;
			}
		}
	}

	/**
	 * 获取真实领投人信息
	 * @param id
	 * @return
	 */
	public  ProjectLeaderModel findLeader(Long id) {
		WebProjectLeader webProjectLeader =  webProjectLeaderDao.findLeader(id);
		if(null!=webProjectLeader){
			 ProjectLeaderModel projectLeaderModel = new ProjectLeaderModel();
			 WebUserInfo webUserInfo = webUserInfoDao.findByUserId(webProjectLeader.getUserId());
			 projectLeaderModel.setHeadPicPath(webUserInfo.getHeadPicPath());
			 projectLeaderModel.setInfo(webProjectLeader.getInfo());
			 projectLeaderModel.setRealName(webUserInfo.getRealName());
			 projectLeaderModel.setReason(webProjectLeader.getReason());
			 
			 return projectLeaderModel;
		}
		return null;
	}
	
}
