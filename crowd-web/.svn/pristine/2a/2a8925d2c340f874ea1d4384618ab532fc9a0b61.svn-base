package com.code.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.constants.Constants;
import com.code.entity.user.WebUser;
import com.code.entity.user.WebUserAccount;
import com.code.service.user.WebUserAccountService;
import com.code.tool.api.ApiResult;
import com.code.tool.controller.BaseController;

@Controller
@RequestMapping("api/user/account")
public class WebUserAccountController extends BaseController{

	@Autowired
	private WebUserAccountService webUserAccountService;
	
	/**
	 * 获取用户账户信息
	 * @return
	 */
	@RequestMapping(value = "/info",method = RequestMethod.GET)
	@ResponseBody
	public ApiResult<WebUserAccount> getAccount(){
		WebUser webUser = (WebUser) getSessionUser();
		WebUserAccount webUserAccount = webUserAccountService.getByUserId(webUser.getId());
		return new ApiResult(true, 0,Constants.USER_ACCOUNT_DESC,webUserAccount);
	}
	
}
