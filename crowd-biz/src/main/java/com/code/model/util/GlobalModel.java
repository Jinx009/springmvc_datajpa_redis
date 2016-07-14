package com.code.model.util;

import java.util.List;

import com.code.entity.sys.HomeConfig;
import com.code.entity.sys.WebTemplate;

/**
 * 全局静态变量存储
 * @author Jinx
 *
 */
public class GlobalModel {

	public static List<HomeConfig> HOMECONFIGLIST;
	public static List<WebTemplate> WEBTEMPLATELIST;
	
	/**
	 * 获取全局静态变量
	 * @param key
	 * @return
	 */
	public static String get(String key){
		if(null!=HOMECONFIGLIST){
			for(HomeConfig homeConfig:HOMECONFIGLIST){
				if(key.equals(homeConfig.getCode())){
					return homeConfig.getValue();
				}
			}
		}
		return "";
	}
	
	/**
	 * 获取单个模板消息
	 * @param code
	 * @return
	 */
	public static WebTemplate getTemplate(String code){
		if(null!=WEBTEMPLATELIST){
			for(WebTemplate webTemplate:WEBTEMPLATELIST){
				if(code.equals(webTemplate.getCode())){
					return webTemplate;
				}
			}
		}
		return null;
	}
}
