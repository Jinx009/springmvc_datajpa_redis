package com.code.controller.pro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.constants.Constants;
import com.code.entity.project.WebProjectFlag;
import com.code.service.pro.WebProjectFlagService;
import com.code.tool.api.ApiResult;
import com.code.tool.controller.BaseController;

@Controller
@RequestMapping("api/pro/flag")
public class WebProjectFlagController  extends BaseController{

	@Autowired
	private WebProjectFlagService webProjectFlagService;
	
	/**
	 * 新建项目标签
	 * @param webProjectFlag
	 * @return
	 */
	@RequestMapping(value = "save",method = RequestMethod.POST)
	@ResponseBody
	public ApiResult save(@RequestBody WebProjectFlag webProjectFlag){
		webProjectFlagService.save(webProjectFlag);
		return new ApiResult(true,0,Constants.PROJECT_DESC);
	}
	
}
