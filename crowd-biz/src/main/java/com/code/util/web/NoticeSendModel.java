package com.code.util.web;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import com.code.model.util.GlobalModel;
import com.code.tool.HttpUtil;
import com.code.tool.HttpUtils;
import com.code.tool.StringUtils;

/**
 * 真实操作发送短信
 * @author Jinx
 *
 */
public class NoticeSendModel {

	private static String productid = "800800"; 

	public static String send(String mobile, String content) {
		try {
			content = URLEncoder.encode(content, "UTF-8");
			String username = StringUtils.isNull(GlobalModel.get("msg_username"));
			String password = StringUtils.isNull(GlobalModel.get("msg_pwd"));
			String smsUrl = StringUtils.isNull(GlobalModel.get("msg_host"));
			
			content = content+"【800众服】";
			
			Map<String,String> params = new HashMap<String, String>();
			params.put("username",username);
			params.put("password",password);
			params.put("mobile",mobile);
			params.put("content",content);
			params.put("productid",productid);
			params.put("xh","");
			params.put("dstime","");
			
			String httpUrl = HttpUtils.getUrl("",smsUrl,params);
			String s = HttpUtil.getHttpResponse(httpUrl);
			String result = "ok";
			
			if ("-1".equals(s))
				result = "用户名或者密码不正确, " + s;
			else if (s.contains("1,"))
				result = "ok";
			else if (s.contains("0,"))
				result = "短信发送失败, " + s;
			else if ("2".equals(s)) 
				result = "余额不足, " + s;
			else if ("3".equals(s))
				result = "扣费失败（请联系客服）, " + s;
			else if (s.contains("5,"))
				result = "短信定时成功, " + s;
			else if ("6".equals(s)) 
				result = "有效号码为空, " + s;
			else if ("7".equals(s))
				result = "短信内容为空, " + s;
			else if ("8".equals(s)) 
				result = "无签名，必须，格式：【签名】, " + s;
			else if ("9".equals(s)) 
				result = "没有Url提交权限, " + s;
			else if ("10".equals(s)) 
				result = "发送号码过多,最多支持200个号码, " + s;
			else if ("11".equals(s))
				result = "产品ID异常, " + s;
			else if ("12".equals(s)) 
				result = "参数异常, " + s;
			else if ("13".equals(s))
				result = "12小时重复提交, " + s;
			else if ("14".equals(s)) 
				result = "用户名或密码不正确，产品余额为0，禁止提交，联系客服, " + s;
			else if ("15".equals(s)) 
				result = "Ip验证失败, " + s;
			else if ("19".equals(s)) 
				result = "短信内容过长，最多支持500个, " + s;
			else if ("20".equals(s)) 
				result = "定时时间不正确：格式：20130202120212(14位数字), " + s;
			
			return result;
		} catch (UnsupportedEncodingException e) {
			
		}
		return "";
	}
	
}
