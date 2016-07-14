package com.code.controller.pro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.constants.Constants;
import com.code.entity.project.WebProjectLeader;
import com.code.entity.user.WebUser;
import com.code.service.pro.WebProjectLeaderService;
import com.code.tool.api.ApiResult;
import com.code.tool.api.ApiResultUtil;
import com.code.tool.controller.BaseController;
import com.code.tool.ip.IPUtil;

@Controller
@RequestMapping("api/user/leader")
public class WebProjectLeaderController extends BaseController{

	@Autowired
	private WebProjectLeaderService webProjectLeaderService;
	
	/**
	 * 申请成为领投人
	 * @param webProjectLeader
	 * @return
	 */
	@RequestMapping(value = "apply",method = RequestMethod.POST)
	@ResponseBody
	public ApiResult apply(@RequestBody WebProjectLeader webProjectLeader){
		webProjectLeader.setCreateIp(IPUtil.getRemortIP(request()));
		WebUser webUser = (WebUser) getSessionUser();
		webProjectLeaderService.save(webUser, webProjectLeader);
		if(null==webUser)
			return ApiResultUtil.failResult(Constants.LOGIN_FAIL);
		else
			return ApiResultUtil.successResult(Constants.BE_LEADER);
	}
	
}
