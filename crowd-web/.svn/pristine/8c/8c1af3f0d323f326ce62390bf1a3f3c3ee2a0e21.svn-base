package com.code.controller.user;

import com.code.entity.user.WebUser;
import com.code.entity.user.WebUserAccountLog;
import com.code.service.user.WebUserAccountLogService;
import com.code.tool.api.ApiResult;
import com.code.tool.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 高雄辉 on 2016/5/25 10:27
 * 用户资金日志
 */
@Controller
@RequestMapping("api/user/account/log")
public class WebUserAccountLogController extends BaseController{

    @Autowired
    private WebUserAccountLogService webUserAccountLogService;

    /**
     * 用户资金日志
     * @param type 类型
     *             充值 recharge
     *             提现  cash
     *             投资相关 invest
     * @param lastId 从哪条记录开始获取
     * @return
     */
    @RequestMapping(value = "/list",method= RequestMethod.GET)
    @ResponseBody
    public ApiResult list( String type,@RequestParam(defaultValue = "0") long lastId){
        WebUser webUser = (WebUser) getSessionUser();
        List<WebUserAccountLog> list=webUserAccountLogService.list(webUser.getId(),type,lastId);
        return new ApiResult(true, 0,"查询成功",list);
    }
}
