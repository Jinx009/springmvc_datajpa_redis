package com.code.controller.pro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.constants.Constants;
import com.code.entity.project.WebProject;
import com.code.entity.user.WebUser;
import com.code.entity.user.WebUserStatus;
import com.code.model.pro.ProjectModel;
import com.code.service.pro.WebProjectService;
import com.code.service.user.WebUserStatusService;
import com.code.tool.api.ApiResult;
import com.code.tool.api.ApiResultUtil;
import com.code.tool.controller.BaseController;

@Controller
@RequestMapping("api/pro")
public class WebProjectController extends BaseController{

	@Autowired
	private WebProjectService webProjectService;
	@Autowired
	private WebUserStatusService webUserStatusService;
	
	/**
	 * 项目详情
	 * @param id
	 * @param profit
	 * @param order
	 * @param leader
	 * @param flag
	 * @param materials
	 * @param contract
	 * @return
	 */
	@RequestMapping(value = "/p/detail",method = RequestMethod.GET)
	@ResponseBody
	public ApiResult detail(){
		return new ApiResult(true,0,Constants.PROJECT_DESC);
	}
	
	/**
	 * 获取微信项目详情
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/p/wechatDetail",method = RequestMethod.GET)
	@ResponseBody
	public ApiResult wechatDetail(@RequestParam("id")Long id){
		WebProject webProject = webProjectService.find(id);
		WebUser webUser = (WebUser) getSessionUser();
		if(null==webProject)
			return new ApiResult(false,-2,Constants.SEE_STATUS,"项目不存在！");
		if(2==webProject.getType()){
			if(null==webUser)
				return new ApiResult(false,-3,Constants.SEE_STATUS,"用户未登录！");
			else{
				WebUserStatus webUserStatus = webUserStatusService.get(webUser.getId());
				/*if(0==webUserStatus.getRealNameStatus())
					return new ApiResult(false,-4,Constants.SEE_STATUS,"用户未实名！");*/
				if(0==webUserStatus.getInvestorStatus())
					return new ApiResult(false,-5,Constants.SEE_STATUS,"用户合格投资人身份未认证！");
			}
		}
		ProjectModel projectModel = webProjectService.findWechatDetail(id,webUser);
		return new ApiResult(true,0,Constants.PROJECT_DESC,projectModel);
	}
	
	/**
	 * 首页项目信息
	 * @return
	 */
	@RequestMapping(value = "index",method = RequestMethod.GET)
	@ResponseBody
	public ApiResult index(){
		List<WebProject> list = webProjectService.findIndex();
		return new ApiResult(true,0,Constants.PROJECT_DESC,list);
	}
	
	/**
	 * 分类查找项目
	 * @param type
	 * @param site
	 * @return
	 */
	@RequestMapping(value = "list",method = RequestMethod.GET)
	@ResponseBody
	public ApiResult list(@Param("type") int type,@Param("site")int site){
		List<WebProject> list = webProjectService.findByTypeAndSite(type,site);
		return new ApiResult(true,0,Constants.PROJECT_DESC,list);
	}
	
	/**
	 * 保存项目
	 * @param webProject
	 * @return
	 */
	@RequestMapping(value = "save",method = RequestMethod.POST)
	@ResponseBody
	public ApiResult save(@RequestBody WebProject webProject){
		webProjectService.save(webProject);
		return ApiResultUtil.successResult(Constants.PROJECT_DESC);
	}
	
	/**
	 * 微信首页项目列表
	 * @param type
	 * @return
	 */
	@RequestMapping(value = "getWechatIndex",method = RequestMethod.GET)
	@ResponseBody
	public ApiResult wechatIndex(@RequestParam("type")Integer type){
		List<ProjectModel> list = webProjectService.getWechatIndex(type);
		return new ApiResult(true,0,Constants.PROJECT_DESC,list);
		
	}
}
