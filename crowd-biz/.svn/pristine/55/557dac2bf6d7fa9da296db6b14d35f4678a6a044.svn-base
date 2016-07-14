package com.code.service.pro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.dao.project.WebProjectDao;
import com.code.dao.project.WebProjectOrderDao;
import com.code.dao.user.WebUserInfoDao;
import com.code.entity.project.WebProject;
import com.code.entity.project.WebProjectOrder;
import com.code.entity.user.WebUserInfo;
import com.code.model.pro.ProjectOrderModel;

@Service
public class WebProjectOrderService {

	@Autowired
	private WebProjectOrderDao webProjectOrderDao;
	@Autowired
	private WebProjectDao webProjectDao;
	@Autowired
	private WebUserInfoDao webUserInfoDao;
	

	/**
	 * 用户支持记录
	 * @param userId
	 * @return
	 */
	public List<ProjectOrderModel> findByUserId(long userId) {
		List<ProjectOrderModel> result = new ArrayList<ProjectOrderModel>();
		List<WebProjectOrder> list = webProjectOrderDao.findByUserId(userId);
		if(null!=list&&!list.isEmpty()){
			 for(WebProjectOrder webProjectOrder:list){
				 ProjectOrderModel projectOrderModel = new ProjectOrderModel();
				 //获取项目名称
				 WebProject webProject = webProjectDao.findOne(webProjectOrder.getProjectId());
				 projectOrderModel.setProjectName(webProject.getName());
				 //获取用户真实姓名
				 WebUserInfo webUserInfo = webUserInfoDao.findByUserId(webProjectOrder.getUserId());
				 projectOrderModel.setRealName(webUserInfo.getRealName());
				 
				 result.add(projectOrderModel);
			 }
			 return result;
		}
		return null;
	}

	/**
	 * 有效订单
	 * @param id
	 * @return
	 */
	public List<ProjectOrderModel> findUsefulByProjectId(Long id) {
		List<ProjectOrderModel> res = null;
		List<WebProjectOrder> list = webProjectOrderDao.findUsefulByProjectId(id);
		if(null!=list&&!list.isEmpty()){
			res = new ArrayList<ProjectOrderModel>();
			for(WebProjectOrder webProjectOrder : list){
				ProjectOrderModel projectOrderModel = new ProjectOrderModel();
				long userId = webProjectOrder.getUserId();
				WebUserInfo webUserInfo = webUserInfoDao.findByUserId(userId);
				WebProject webProject = webProjectDao.findOne(webProjectOrder.getProjectId());
				projectOrderModel.setDate(webProjectOrder.getCreateDate());
				projectOrderModel.setHeadPic(webUserInfo.getHeadPicPath());
				projectOrderModel.setInvestType(getInvestType(webProjectOrder.getPayStatus()));
				projectOrderModel.setMoney(webProjectOrder.getMoney());
				projectOrderModel.setProjectName(webProject.getName());
				projectOrderModel.setRealName(webUserInfo.getRealName());
				res.add(projectOrderModel);
			}
			return res;
		}
		return null;
	}
	
	/**
	 * 获取支持类型
	 * @param type
	 * @return
	 */
	private String getInvestType(int type){
		if(1==type)
			return "预约支持";
		else if(2==type)
			return "全额支持";
		return "全额支持";
	}
}
