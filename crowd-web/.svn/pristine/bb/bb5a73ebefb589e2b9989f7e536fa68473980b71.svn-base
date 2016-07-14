package com.code.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.constants.Constants;
import com.code.constants.TokenConstants;
import com.code.entity.sys.WebTemplate;
import com.code.entity.user.WebUser;
import com.code.model.sys.NoticeModel;
import com.code.model.user.WebUserModel;
import com.code.model.util.GlobalModel;
import com.code.service.log.WebNoticeLogService;
import com.code.service.user.WebUserService;
import com.code.tool.MD5Util;
import com.code.tool.RandomUtil;
import com.code.tool.api.ApiResult;
import com.code.tool.api.ApiResultUtil;
import com.code.tool.controller.BaseController;
import com.code.tool.ip.IPUtil;
import com.code.util.redis.RedisService;

/**
 * 用户注册相关
 * @author Jinx
 *
 */
@Controller
@RequestMapping(value = "api/register")
public class RegisterController extends BaseController {

	@Autowired
	private RedisService redisService;
	@Autowired
	private WebUserService webUserService;
	@Autowired
	private WebNoticeLogService webNoticeLogService;

	private Map<String, Object> data;

	/**
	 * 用户手机号码注册
	 * @param userName
	 * @param pwd
	 * @param registerCode
	 * @param code
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "mobile", method = RequestMethod.POST)
	@ResponseBody
	public ApiResult register(@RequestParam("userName") String userName,
			@RequestParam("pwd") String pwd,
			@RequestParam(value = "registerCode" ,defaultValue = "") String registerCode,
			@RequestParam("code") String code) throws Exception {
		//校验手机号码
		data = WebUserModel.checkRegisterUser(userName);
		if (Constants.SUCCESS_CODE != (Integer) data.get(Constants.CODE))
			return ApiResultUtil.failResult(data.get(Constants.DATA).toString());
		//校验是否在800bank注册过
		data = WebUserModel.checkBankExist(userName);
		if(Constants.SUCCESS_CODE != (Integer) data.get(Constants.CODE))
			return ApiResultUtil.failResult(data.get(Constants.DATA).toString());
		//校验密码
		data = WebUserModel.checkPwd(pwd);
		if (Constants.SUCCESS_CODE != (Integer) data.get(Constants.CODE))
			return ApiResultUtil.failResult(data.get(Constants.DATA).toString());
		//校验手机验证码
		data = WebUserModel.checkCode(userName, code);
		if(Constants.SUCCESS_CODE != (Integer) data.get(Constants.CODE))
			return ApiResultUtil.failResult(data.get(Constants.DATA).toString());
		
		WebUser webUser = new WebUser();
		webUser.setUserName(userName);
		webUser.setRegisterCode(registerCode);
		webUser.setCreateIp(IPUtil.getRemortIP(request()));
		webUser.setPwd(MD5Util.MD5(pwd));
		webUser.setRegisterSite(0);
		webUser = webUserService.register(webUser);
		
		String accessToken = redisService.setWebUser(webUser);
		//注册成功返回token
		return new ApiResult(true, 0,Constants.CHECK_USER_DESC,accessToken);

	}

	@RequestMapping(value = "registerCode")
	@ResponseBody
	public ApiResult registerCode(@RequestParam("mobilePhone")String mobilePhone){
		String code = RandomUtil.getSixNum();
		redisService.put(mobilePhone+"_register_code",code);
		
		NoticeModel noticeModel = new NoticeModel("","", 0.00,0.00,null,null,null,null,code);
		WebTemplate webTemplate = GlobalModel.getTemplate(Constants.REGISTER_CODE);
		webNoticeLogService.save(webTemplate, noticeModel,mobilePhone);
		
		return new ApiResultUtil().successResult(Constants.SUCCESS);
	}
	
}
