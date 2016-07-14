package com.code.controller.pro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.constants.Constants;
import com.code.entity.project.WebProjectContract;
import com.code.service.pro.WebProjectContractService;
import com.code.tool.api.ApiResult;
import com.code.tool.controller.BaseController;

@Controller
@RequestMapping("api/pro/contract")
public class WebProjectContractController extends BaseController{

	@Autowired
	private WebProjectContractService webProjectContractService;
	
	/**
	 * 保存合同模板
	 * @param webProjectContract
	 * @return
	 */
	@RequestMapping(value = "save",method = RequestMethod.POST)
	@ResponseBody
	public ApiResult save(@RequestBody WebProjectContract webProjectContract){
		webProjectContractService.save(webProjectContract);
		return new ApiResult(true,0,Constants.PROJECT_DESC);
	}
	
}
