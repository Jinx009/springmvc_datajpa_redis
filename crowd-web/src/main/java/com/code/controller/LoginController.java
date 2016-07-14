package com.code.controller;



import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.constants.Constants;
import com.code.entity.user.WebUser;
import com.code.model.user.WebUserModel;
import com.code.service.user.WebUserService;
import com.code.tool.MD5Util;
import com.code.tool.api.ApiResult;
import com.code.tool.api.ApiResultUtil;
import com.code.tool.controller.BaseController;
import com.code.tool.ip.IPUtil;
import com.code.util.redis.RedisService;

@Controller
@RequestMapping("/api/login")
public class LoginController extends BaseController{
	
	@Autowired
	private WebUserService webUserService;
	@Autowired
	private RedisService redisService;
	
	private Map<String,Object> data;
	
	/**
	 * 手机用户登录
	 * @param userName
	 * @param pwd
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/mobile",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult login(@RequestParam("userName")String userName,@RequestParam("pwd")String pwd) throws Exception{
		data = WebUserModel.checkUser(userName);
		if (Constants.SUCCESS_CODE != (Integer) data.get(Constants.CODE))
			return ApiResultUtil.failResult(data.get(Constants.DATA).toString());
		//校验密码
		data = WebUserModel.checkPwd(pwd);
		if (Constants.SUCCESS_CODE != (Integer) data.get(Constants.CODE))
			return ApiResultUtil.failResult(data.get(Constants.DATA).toString());
		WebUser webUser = webUserService.login(userName,MD5Util.MD5(pwd));
		if(null!=webUser){
			String accessToken = redisService.setWebUser(webUser);
			//注册成功返回token
			return new ApiResult(true, 0,MD5Util.MD5(pwd),accessToken);
		}else{
			String result = WebUserModel.httpLogin(userName,pwd);
			if(Constants.SUCCESS.equals(result)){
				webUser = new WebUser();
				webUser.setUserName(userName);
				webUser.setCreateIp(IPUtil.getRemortIP(request()));
				webUser.setPwd(MD5Util.MD5(pwd));
				webUser.setRegisterSite(1);
				webUser = webUserService.register(webUser);
				
				String accessToken = redisService.setWebUser(webUser);
				//注册成功返回token
				return new ApiResult(true, 0,Constants.LOGIN_SUCCESS_DESC,accessToken);
			}else{
				return ApiResultUtil.failResult(Constants.LOGIN_FAIL_DESC);
			}
		}
	}
	
	
	/**
	 * 微信手机用户免登录
	 * @param userName
	 * @param pwd
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/wechatMobile",method=RequestMethod.POST)
	@ResponseBody
	public ApiResult wechatLogin(@RequestParam("userName")String userName,@RequestParam("pwd")String pwd) throws Exception{
		data = WebUserModel.checkUser(userName);
		if (Constants.SUCCESS_CODE != (Integer) data.get(Constants.CODE))
			return ApiResultUtil.failResult(data.get(Constants.DATA).toString());
		WebUser webUser = webUserService.login(userName,pwd);
		if(null!=webUser){
			String accessToken = redisService.setWebUser(webUser);
			//注册成功返回token
			return new ApiResult(true, 0,Constants.LOGIN_SUCCESS_DESC,accessToken);
		}else
			return ApiResultUtil.failResult("登录失败");
	}
}
