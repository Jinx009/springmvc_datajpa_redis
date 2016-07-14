package com.code.controller.pro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.code.constants.Constants;
import com.code.entity.project.WebProjectComment;
import com.code.service.pro.WebProjectCommentService;
import com.code.tool.api.ApiResult;
import com.code.tool.controller.BaseController;

@Controller
@RequestMapping("api/pro/comment")
public class WebProjectCommentController extends BaseController{

	@Autowired
	private WebProjectCommentService webProjectCommentService;
	
	/**
	 * 新建评论
	 * @param webProjectComment
	 * @return
	 */
	@RequestMapping(value = "save",method = RequestMethod.POST)
	@ResponseBody
	public ApiResult save(@RequestBody WebProjectComment webProjectComment){
		webProjectCommentService.save(webProjectComment);
		return new ApiResult(true,0,Constants.PROJECT_DESC);
	}
	
}
