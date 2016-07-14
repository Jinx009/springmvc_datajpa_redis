package com.code.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.constants.Constants;
import com.code.entity.user.WebUser;
import com.code.service.user.WebUserService;
import com.code.tool.api.ApiResult;
import com.code.tool.controller.BaseController;
import com.code.util.redis.RedisService;

@Controller
@RequestMapping("/api/user")
public class WebUserController extends BaseController{
	
	@Autowired
	private WebUserService webUserService;
	@Autowired
	private RedisService redisService;
	
	/**
	 * 获取用户账户信息
	 * @return
	 */
	@RequestMapping(value = "/info",method = RequestMethod.GET)
	@ResponseBody
	public ApiResult get(){
		WebUser webUser = (WebUser) getSessionUser();
		return new ApiResult(true, 0,Constants.USER_DESC,webUser);
	}
	
	@RequestMapping(value = "clear",method = RequestMethod.DELETE)
	@ResponseBody
	public ApiResult loginOut(@RequestParam("accessToken")String accessToken){
		redisService.clearWebUser(accessToken);
		return new ApiResult(true, 0,Constants.USER_DESC);
	}
}
