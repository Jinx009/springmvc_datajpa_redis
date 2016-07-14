package com.code.service.pro;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.dao.project.WebProjectAttentionDao;
import com.code.dao.project.WebProjectContractDao;
import com.code.dao.project.WebProjectDao;
import com.code.dao.project.WebProjectFlagDao;
import com.code.dao.project.WebProjectLeaderDao;
import com.code.dao.project.WebProjectMaterialsDao;
import com.code.dao.project.WebProjectOrderDao;
import com.code.dao.project.WebProjectProfitDao;
import com.code.entity.project.WebProject;
import com.code.entity.project.WebProjectMaterials;
import com.code.entity.user.WebUser;
import com.code.model.pro.ProjectLeaderModel;
import com.code.model.pro.ProjectMaterialsModel;
import com.code.model.pro.ProjectModel;
import com.code.model.pro.ProjectOrderModel;
import com.code.model.pro.ProjectSupportModel;

@Service
public class WebProjectService {

	@Autowired
	private WebProjectDao webProjectDao;
	@Autowired
	private WebProjectProfitDao webProjectProfitDao;
	@Autowired
	private WebProjectMaterialsDao webProjectMaterialsDao;
	@Autowired
	private WebProjectOrderDao webProjectOrderDao;
	@Autowired
	private WebProjectFlagDao webProjectFlagDao;
	@Autowired
	private WebProjectContractDao webProjectContractDao;
	@Autowired
	private WebProjectLeaderDao webProjectLeaderDao;
	@Autowired
	private WebProjectAttentionDao webProjectAttentionDao;
	@Autowired
	private WebProjectCommentService webProjectCommentService;
	@Autowired
	private WebProjectLeaderService webProjectLeaderService;
	@Autowired
	private WebProjectOrderService webProjectOrderService;
	@Autowired
	private WebProjectMaterialsService webProjectMaterialsService;
	@Autowired
	private WebProjectAttentionService webProjectAttentionService;
	

	/**
	 * 首页产品信息
	 * @return
	 */
	public List<WebProject> findIndex() {
		return webProjectDao.findIndex();
	}

	/**
	 * 通过平台和类别查找项目列表
	 * @param type
	 * @param site
	 * @return
	 */
	public List<WebProject> findByTypeAndSite(int type, int site) {
		if(0==type){
			if(0==site)
				return webProjectDao.findAllForPc();
			else if(1==site)
				return webProjectDao.findAllForWechat();
			else
				return webProjectDao.findAllForApp();
		}else{
			if(0==site)
				return webProjectDao.findTypeForPc(type);
			else if(1==site)
				return webProjectDao.findTypeForWechat(type);
			else
				return webProjectDao.findTypeForApp(type);
		}
	}

	/**
	 * 保存项目
	 * @param webProject
	 */
	public void save(WebProject webProject) {
		webProjectDao.save(webProject);
	}

	/**
	 * 微信首页项目数据
	 * @param type
	 * @return
	 */
	public List<ProjectModel> getWechatIndex(int type) {
		List<WebProject> list = webProjectDao.findWechatIndex(type);
		List<ProjectModel> res = null;
		if(null!=list&&!list.isEmpty()){
			res = new ArrayList<ProjectModel>();
			for(WebProject webProject : list){
				ProjectModel projectModel = new ProjectModel();
				WebProject webProject2 = new WebProject();
				webProject2.setId(webProject.getId());
				webProject2.setName(webProject.getName());
				webProject2.setInfo(webProject.getInfo());
				webProject2.setMinMoney(webProject.getMinMoney());
				webProject2.setEndTime(webProject.getEndTime());
				projectModel.setWebProject(webProject2);
				projectModel.setStep(getStep(webProject.getAccount(),webProject.getWannaAccount()));
				WebProjectMaterials webProjectMaterials = webProjectMaterialsDao.findIndexPic(webProject.getId(),"p_detail_index");
				projectModel.setIndexPic(webProjectMaterials.getContent());
				projectModel.setStatusName(getStatusName(webProject.getStartTime(),webProject.getStatus()));
				projectModel.setTypeName(getTypeName(webProject.getType()));
				res.add(projectModel);
			}
			return res;
		}
		return null;
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
	 * 获取众筹类型
	 * @param type
	 * @return
	 */
	private String getTypeName(int type){
		if(1==type)
			return "实物众筹";
		else if(2==type)
			return "股权众筹";
		else 
			return "公益众筹";
	}
	
	/**
	 * 计算募集进度
	 * @param account
	 * @param wannaAccount
	 * @return
	 */
	private double getStep(double account,double wannaAccount){
		double step = account/wannaAccount;  
		BigDecimal b = new BigDecimal(step);  
		return b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();  
	}

	/**
	 * 公司估值名称
	 * @param type
	 * @return
	 */
	private String getCompanyMoneyName(int type){
		if(0==type)
			return "投前估值";
		else 
			return "投后估值";
	}
	
	/**
	 * 获取单一项目
	 * @param id
	 * @return
	 */
	public WebProject find(Long id) {
		return webProjectDao.findOne(id);
	}

	/**
	 * 微信项目详情
	 * @param id
	 * @return
	 */
	public ProjectModel findWechatDetail(Long id,WebUser webUser) {
		WebProject webProject = webProjectDao.findOne(id);
		ProjectModel projectModel = new ProjectModel();
		List<ProjectOrderModel> orders = webProjectOrderService.findUsefulByProjectId(id);
		List<ProjectMaterialsModel> materials = webProjectMaterialsService.findByProjectId(id);
		if(null!=webUser)
			projectModel.setAttentionStatus(webProjectAttentionService.getStatus(webUser,id));
		else
			projectModel.setAttentionStatus(0);
		int leaderStatus = webProjectLeaderService.getStatus(id,webUser,webProject.getType());
		projectModel.setLeaderStatus(leaderStatus);
		if(1==leaderStatus){
			ProjectLeaderModel projectLeaderModel = webProjectLeaderService.findLeader(id);
			projectModel.setProjectLeaderModel(projectLeaderModel);
		}
		projectModel.setStatusName(getStatusName(webProject.getStartTime(),webProject.getStatus()));
		projectModel.setCompanyMoneyName(getCompanyMoneyName(webProject.getCompanyMoneyType()));
		projectModel.setSell(webProject.getSellRate()*100);
		projectModel.setMaterials(materials);
		projectModel.setWebProject(webProject);
		projectModel.setOrders(orders);
		return projectModel;
	}

	/**
	 * 项目支持时模板
	 * @param id
	 * @return
	 */
	public ProjectSupportModel findSupportModel(long id) {
		WebProject webProject = webProjectDao.findOne(id);
		ProjectSupportModel projectSupportModel = null;
		if(null!=webProject){
			projectSupportModel = new ProjectSupportModel();
			projectSupportModel.setAddAccount(webProject.getAddAccount());
			projectSupportModel.setMaxMoney(webProject.getMaxMoney());
			projectSupportModel.setMinMoney(webProject.getMinMoney());
			projectSupportModel.setProjectId(webProject.getId());
			projectSupportModel.setProjectName(webProject.getName());
			projectSupportModel.setProjectType(webProject.getType());
			projectSupportModel.setBreach(webProject.getBreach());
			projectSupportModel.setBreanchDate(webProject.getBreachDate());
			projectSupportModel.setFee(webProject.getFee());
			projectSupportModel.setFeeType(webProject.getFeeType());
			return projectSupportModel;
		}
		return null;
	}
}
