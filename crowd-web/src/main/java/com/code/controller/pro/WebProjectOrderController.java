package com.code.controller.pro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.constants.Constants;
import com.code.model.pro.ProjectOrderModel;
import com.code.service.pro.WebProjectOrderService;
import com.code.tool.api.ApiResult;
import com.code.tool.controller.BaseController;

@Controller
@RequestMapping("api/user/order")
public class WebProjectOrderController extends BaseController{

	@Autowired
	private WebProjectOrderService webProjectOrderService;
	
	/**
	 * 用户订单
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "self",method = RequestMethod.GET)
	@ResponseBody
	public ApiResult get(@RequestParam("userId")long userId){
		List<ProjectOrderModel> list = webProjectOrderService.findByUserId(userId);
		return new ApiResult(true,0,Constants.PROJECT_DESC,list);
	}
}
