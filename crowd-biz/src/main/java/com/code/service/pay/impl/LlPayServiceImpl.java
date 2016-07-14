package com.code.service.pay.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.code.constants.PayConfig;
import com.code.entity.pay.BankCard;
import com.code.entity.pay.CardBin;
import com.code.service.pay.LlPayService;
import com.code.tool.pay.LLPayUtil;
import com.code.tool.pay.conn.HttpRequestSimple;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 高雄辉 on 17/05/2016.15:19
 *
 * @description
 */
@Service
public class LlPayServiceImpl implements LlPayService {
    @Override
    public CardBin queryCardBin(String card_no,String type) {
        JSONObject reqObj = new JSONObject();
        if(type.equals("android")){
            reqObj.put("oid_partner", PayConfig.OID_PARTNER_SDK);
            reqObj.put("card_no",card_no);
            reqObj.put("sign_type", PayConfig.SIGN_TYPE);
            String sign = LLPayUtil.addSign(reqObj, PayConfig.RSA_PRIVATE_SDK,
                    PayConfig.MD5_KEY_SDK);
            reqObj.put("sign", sign);
        }else {
            reqObj.put("oid_partner", PayConfig.OID_PARTNER);
            reqObj.put("card_no",card_no);
            reqObj.put("sign_type", PayConfig.SIGN_TYPE);
            String sign = LLPayUtil.addSign(reqObj, PayConfig.TRADER_PRI_KEY,
                    PayConfig.MD5_KEY);
            reqObj.put("sign", sign);
        }
        String reqJSON = reqObj.toString();
        System.out.println("银行卡卡bin信息查询请求报文[" + reqJSON + "]");
        String resJSON = HttpRequestSimple.getInstance().postSendHttp(
                PayConfig.QUERY_BANKCARD_URL, reqJSON);
        System.out.println("银行卡卡bin信息查询响应报文[" + resJSON + "]");
        JSONObject jsonObject= JSON.parseObject(resJSON);
        if(jsonObject!=null&&jsonObject.getString("ret_code").equals("0000")){
            return new CardBin(jsonObject.getString("bank_code"),jsonObject.getString("bank_name"),jsonObject.getString("card_type"));
        }
        return null ;
    }


    /**
     * 用户已绑定银行列表查询
     */
    public List<BankCard> queryBankcardList(long user_id, String type)
    {
        JSONObject reqObj = new JSONObject();
        if(type.equals("android")){
            reqObj.put("oid_partner", PayConfig.OID_PARTNER_SDK);
            reqObj.put("user_id",user_id);
            reqObj.put("offset", "0");
            reqObj.put("sign_type", PayConfig.SIGN_TYPE);
            reqObj.put("pay_type", "D");
            String sign = LLPayUtil.addSign(reqObj, PayConfig.RSA_PRIVATE_SDK,
                    PayConfig.MD5_KEY_SDK);
            reqObj.put("sign", sign);
        }else{
            reqObj.put("oid_partner", PayConfig.OID_PARTNER);
            reqObj.put("user_id", user_id);
            reqObj.put("offset", "0");
            reqObj.put("sign_type", PayConfig.SIGN_TYPE);
            reqObj.put("pay_type", "D");
            String sign = LLPayUtil.addSign(reqObj, PayConfig.TRADER_PRI_KEY,
                    PayConfig.MD5_KEY);
            reqObj.put("sign", sign);
        }

        String reqJSON = reqObj.toString();
        System.out.println("用户已绑定银行列表查询请求报文[" + reqJSON + "]");
        String resJSON = HttpRequestSimple.getInstance().postSendHttp(
                PayConfig.QUERY_USER_BANKCARD_URL, reqJSON);
        System.out.println("用户已绑定银行列表查询响应报文[" + resJSON + "]");
        JSONObject jsonObject= JSON.parseObject(resJSON);
        if(jsonObject!=null&&jsonObject.getString("ret_code").equals("0000")&&jsonObject.getInteger("count")>0){
                List<BankCard> list=new Gson().fromJson(jsonObject.getString("agreement_list"),new TypeToken<List<BankCard>>(){}.getType());
            return list;
        }
        return null;
    }




}
