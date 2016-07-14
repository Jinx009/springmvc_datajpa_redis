package com.code.controller.pro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.constants.Constants;
import com.code.entity.project.WebProjectMaterials;
import com.code.service.pro.WebProjectMaterialsService;
import com.code.tool.api.ApiResult;
import com.code.tool.controller.BaseController;

@Service
@RequestMapping("api/pro/materials")
public class WebProjectMaterialsController extends BaseController{

	@Autowired
	private WebProjectMaterialsService webProjectMaterialsService;
	
	/**
	 * 新建素材
	 * @param webProjectMaterials
	 * @return
	 */
	@RequestMapping(value = "save",method = RequestMethod.POST)
	@ResponseBody
	public ApiResult save(@RequestBody WebProjectMaterials webProjectMaterials){
		
		webProjectMaterialsService.save(webProjectMaterials);
		return new ApiResult(true,0,Constants.PROJECT_DESC);
		
	}
	
	/**
	 * 获取微信banner
	 * @return
	 */
	@RequestMapping(value = "wechatBanner",method = RequestMethod.GET)
	@ResponseBody
	public ApiResult getBanner(){
		List<WebProjectMaterials> list = webProjectMaterialsService.getBanner(2);
		return new ApiResult(true,0,Constants.MATERIALS_DESC,list);
	}
}
