package com.code.controller.user;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.constants.Constants;
import com.code.entity.user.WebUser;
import com.code.entity.user.WebUserStatus;
import com.code.service.user.WebUserStatusService;
import com.code.tool.api.ApiResult;
import com.code.tool.controller.BaseController;

@Controller
@RequestMapping("api/user/status")
public class WebUserStatusController extends BaseController{

	@Autowired
	private WebUserStatusService webUserStatusService;
	
	private Map<String,Object> data;

	/**
	 * 用户状态信息
	 * @return
	 */
	@RequestMapping(value = "info",method = RequestMethod.GET)
	@ResponseBody
	public ApiResult get(){
		WebUser webUser = (WebUser) getSessionUser();
		WebUserStatus webUserStatus = webUserStatusService.get(webUser.getId());
		return new ApiResult(true,0,Constants.USER_STATUS_DESC,webUserStatus);
	}
	
	/**
	 * 修改合格投资人状态
	 * @return
	 */
	@RequestMapping(value = "investorStatus",method = RequestMethod.POST)
	@ResponseBody
	public ApiResult setInvestorStatus(){
		WebUser webUser = (WebUser) getSessionUser();
		webUserStatusService.updateInvestorStatus(webUser.getId());
		return new ApiResult(true,0,Constants.USER_STATUS_DESC);
	}
	
	
	
	
	
	
	
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
}
