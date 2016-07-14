package com.code.service.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.dao.project.WebProjectDao;
import com.code.dao.project.WebProjectOrderDao;
import com.code.dao.project.WebProjectProfitDao;
import com.code.entity.project.WebProject;
import com.code.entity.project.WebProjectProfit;
import com.code.model.pro.ProjectProfitModel;

@Service
public class WebProjectProfitService {

	@Autowired
	private WebProjectProfitDao webProjectProfitDao;
	@Autowired
	private WebProjectOrderDao webProjectOrderDao;
	@Autowired
	private WebProjectDao webProjectDao;
	
	/**
	 * 新建权益规则
	 * @param webProjectProfit
	 * @return
	 */
	public WebProjectProfit save(WebProjectProfit webProjectProfit){
		webProjectProfit.setCreateDate(new Date());
		webProjectProfit.setLastUpdateDate(new Date());
		return webProjectProfitDao.save(webProjectProfit);
	}
	
	/**
	 * 获取项目权益列表
	 * @param projectId
	 * @return
	 */
	public List<ProjectProfitModel> get(long projectId){
		List<WebProjectProfit> list = webProjectProfitDao.findByProjectId(projectId);
		WebProject webProject = webProjectDao.findOne(projectId);
		List<ProjectProfitModel> res = null;
		if(null!=list&&!list.isEmpty()){
			res = new ArrayList<ProjectProfitModel>();
			for(WebProjectProfit webProjectProfit:list){
				ProjectProfitModel profitModel = ProjectProfitModel.instance(webProjectProfit);
				profitModel.setNum(webProjectOrderDao.getNum(profitModel.getId()));
				profitModel.setStatusName(getStatusName(webProject.getStartTime(),webProject.getStatus()));
				profitModel.setStatus(getStatus(webProject.getStartTime(),webProject.getStatus()));
				res.add(profitModel);
			}
			return res;
		}
		return null;
	}
	
	
	private int getStatus(Date startTime, int status) {
		Date date = new Date();
		if(2==status&&date.before(startTime))
			return 0;
		else if(2==status&&!date.before(startTime))
			return 2;
		else if(3==status)
			return 3;
		return 4;
	}

	/**
	 * 判断募集状态
	 * @param endTime
	 * @param status
	 * @return
	 */
	private String getStatusName(Date startTime,int status){
		Date date = new Date();
		if(2==status&&date.before(startTime))
			return "预热中";
		else if(2==status&&!date.before(startTime))
			return "募集中";
		else if(3==status)
			return "募集完成";
		return "募集中";
	}

	/**
	 * 获取单条权益模板
	 * @param profitId
	 * @return
	 */
	public ProjectProfitModel findOneModel(long profitId) {
		WebProjectProfit webProjectProfit = webProjectProfitDao.findOne(profitId);
		ProjectProfitModel profitModel = null;
		if(null!=webProjectProfit){
			profitModel = ProjectProfitModel.instance(webProjectProfit);
			profitModel.setNum(webProjectOrderDao.getNum(profitId));
			return profitModel;
		}
		return null;
	}
}
