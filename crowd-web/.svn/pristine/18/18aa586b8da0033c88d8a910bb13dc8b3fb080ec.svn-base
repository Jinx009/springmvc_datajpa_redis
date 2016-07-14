package com.code.controller.user;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.constants.Constants;
import com.code.entity.user.WebUser;
import com.code.entity.user.WebUserInfo;
import com.code.service.user.WebUserInfoService;
import com.code.tool.api.ApiResult;
import com.code.tool.controller.BaseController;

@Controller
@RequestMapping("api/user/info")
public class WebUserInfoController extends BaseController{

	@Autowired
	private WebUserInfoService webUserInfoService;
	
	private Map<String,Object> data;

	/**
	 * 用户个人信息
	 * @return
	 */
	@RequestMapping(value = "/info",method=RequestMethod.GET)
	@ResponseBody
	public ApiResult get(){
		WebUser webUser = (WebUser) getSessionUser();
		WebUserInfo webUserInfo = webUserInfoService.get(webUser.getId());
		return new ApiResult(true, 0,Constants.USER_INFO_DESC,webUserInfo);
	}
	
	/**
	 * 修改昵称
	 * @param nickName
	 * @return
	 */
	@RequestMapping(value = "/updateNickName",method = RequestMethod.PUT)
	@ResponseBody
	public ApiResult changeNickName(@RequestParam("nickName")String nickName){
		WebUser webUser = (WebUser) getSessionUser();
		WebUserInfo webUserInfo = webUserInfoService.get(webUser.getId());
		webUserInfo.setNickName(nickName);
		webUserInfoService.updateNickName(webUserInfo);
		return new ApiResult(true,0,Constants.USER_INFO_DESC);
	}
	
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
}
