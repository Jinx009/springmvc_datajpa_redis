package com.code.controller.pro;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.constants.Constants;
import com.code.entity.project.WebProjectProfit;
import com.code.model.pro.ProjectProfitModel;
import com.code.model.pro.ProjectSupportModel;
import com.code.service.pro.WebProjectProfitService;
import com.code.service.pro.WebProjectService;
import com.code.tool.api.ApiResult;
import com.code.tool.controller.BaseController;

@Controller
public class WebProjectProfitController extends BaseController{

	@Autowired
	private WebProjectProfitService webProjectProfitService;
	@Autowired
	private WebProjectService webProjectService;
	
	/**
	 * 保存权益规则
	 * @param webProjectProfit
	 * @return
	 */
	@RequestMapping(value = "/api/pro/profit/save",method = RequestMethod.POST)
	@ResponseBody
	public ApiResult save(@RequestBody WebProjectProfit webProjectProfit){
		webProjectProfitService.save(webProjectProfit);
		return new ApiResult(true,0,Constants.PROJECT_DESC);
	}
	
	/**
	 * 获取项目权益列表
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/api/pro/profit/get",method = RequestMethod.GET)
	@ResponseBody
	public ApiResult get(@RequestParam("id")long id){
		List<ProjectProfitModel> list = webProjectProfitService.get(id);
		return new ApiResult(true,0,Constants.PROJECT_DESC,list);
 	}
	
	/**
	 * 微信订单页面数据
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/api/user/support",method = RequestMethod.GET)
	@ResponseBody
	public ApiResult buy(@RequestParam("id")long id,@RequestParam("right")long right){
		ProjectProfitModel profitModel = webProjectProfitService.findOneModel(right);
		ProjectSupportModel projectSupportModel = webProjectService.findSupportModel(id);
		Map<String,Object> data = new HashMap<String, Object>();
		data.put("supportModel",projectSupportModel);
		data.put("rightModel",profitModel);
		return new ApiResult(true,0,Constants.PROJECT_DESC,data);
 	}
}
