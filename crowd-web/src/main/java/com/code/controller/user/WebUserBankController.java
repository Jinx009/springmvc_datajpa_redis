package com.code.controller.user;

import com.code.entity.user.WebUser;
import com.code.entity.user.WebUserBank;
import com.code.service.user.WebUserBankService;
import com.code.tool.api.ApiResult;
import com.code.tool.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 高雄辉 on 2016/5/25 14:50
 * 用户绑卡记录
 */
@Controller
@RequestMapping("api/user/bank")
public class WebUserBankController extends BaseController{
    @Autowired
    private WebUserBankService webUserBankService;


    /**
     *  获取用户绑定卡列表
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/list",method= RequestMethod.GET)
    public ApiResult list(){
        WebUser webUser = (WebUser) getSessionUser();
        List<WebUserBank> webUserBanks=webUserBankService.findByUserId(webUser.getId());
        for(WebUserBank webUserBank:webUserBanks){
            webUserBank.setUserId(0);
        }
        return new ApiResult(true,0,"查询成功",webUserBanks);
    }
}
