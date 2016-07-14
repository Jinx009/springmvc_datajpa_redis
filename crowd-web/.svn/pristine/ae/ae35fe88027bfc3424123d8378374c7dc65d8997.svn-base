package com.code.controller.pro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.constants.Constants;
import com.code.entity.user.WebUser;
import com.code.service.pro.WebProjectAttentionService;
import com.code.tool.api.ApiResult;
import com.code.tool.controller.BaseController;

@Controller
public class WebProjectAttentionController extends BaseController{

	@Autowired
	private WebProjectAttentionService webProjectAttentionService;
	
	/**
	 * 关注项目
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/api/user/attention/save",method = RequestMethod.POST)
	@ResponseBody
	public ApiResult save(@RequestParam("id")long id){
		WebUser webUser = (WebUser) getSessionUser();
		webProjectAttentionService.save(webUser, id);
		return new ApiResult(true,0,Constants.PROJECT_DESC);
	}
	
	/**
	 * 取消关注项目
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/api/user/attention/update",method = RequestMethod.POST)
	@ResponseBody
	public ApiResult update(@RequestParam("id")long id){
		WebUser webUser = (WebUser) getSessionUser();
		webProjectAttentionService.update(webUser, id);
		return new ApiResult(true,0,Constants.PROJECT_DESC);
	}
	
}
