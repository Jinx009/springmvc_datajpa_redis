package com.code.controller.pay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.code.entity.sys.WebAddress;
import com.code.entity.user.WebUser;
import com.code.entity.user.WebUserRecharge;
import com.code.service.sys.WebAddressService;
import com.code.service.user.WebUserRechargeService;
import com.code.tool.api.ApiResult;
import com.code.tool.controller.BaseController;

@Controller
@RequestMapping("/api/user/offlinePay")
public class OfflinePayController extends BaseController{

	@Autowired
	private WebAddressService webAddressService;
	@Autowired
	private WebUserRechargeService webUserRechargeService;
	
	public ApiResult save(@RequestBody WebUserRecharge webUserRecharge){
		WebUser webUser = (WebUser) getSessionUser();
		webUserRecharge.setUserId(webUser.getId());
		return null;
	}
	
}
