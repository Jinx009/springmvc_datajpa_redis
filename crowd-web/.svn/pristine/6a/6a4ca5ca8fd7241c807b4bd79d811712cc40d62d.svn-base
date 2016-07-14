package com.code.controller.sys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.code.constants.Constants;
import com.code.entity.sys.WebAddress;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.service.sys.WebAddressService;
import com.code.tool.api.ApiResult;
import com.code.tool.controller.BaseController;

@Controller
@RequestMapping("api/address")
public class WebAddressController extends BaseController{

	@Autowired
	private WebAddressService webAddressService;
	
	/**
	 * 根据parentId查找地址
	 * @param parentId
	 * @return
	 */
	@RequestMapping(value = "list",method = RequestMethod.GET)
	@ResponseBody
	public ApiResult list(@RequestParam("parentId")long parentId){
		List<WebAddress> list = webAddressService.list(parentId);
		return new ApiResult(true,0,Constants.ADDRESS_DESC,list);
	}
	
}
