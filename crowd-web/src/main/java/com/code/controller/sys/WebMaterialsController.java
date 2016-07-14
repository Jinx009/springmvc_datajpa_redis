package com.code.controller.sys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.constants.Constants;
import com.code.entity.sys.WebMaterials;
import com.code.service.sys.WebMaterialsService;
import com.code.tool.api.ApiResult;
import com.code.tool.controller.BaseController;

@Controller
@RequestMapping("api/materials")
public class WebMaterialsController extends BaseController{

	@Autowired
	private WebMaterialsService webMaterialsService;

	/**
	 * 新建素材编码
	 * @param webMaterials
	 * @return
	 */
	@RequestMapping(value = "save",method = RequestMethod.POST)
	@ResponseBody
	public ApiResult save(@RequestBody WebMaterials webMaterials){
		webMaterialsService.save(webMaterials);
		return new ApiResult(true,0,Constants.MATERIALS_DESC);
	}
	
	/**
	 * 获取素材仓库数据
	 * @return
	 */
	@RequestMapping(value = "get",method = RequestMethod.GET)
	@ResponseBody
	public ApiResult get(){
		List<WebMaterials> list = webMaterialsService.findAllItems();     
		return new ApiResult(true,0,Constants.MATERIALS_DESC,list);
	}
}
