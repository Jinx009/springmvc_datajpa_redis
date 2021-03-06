package com.code.constants;

/**
 * access_token返回状态常量
 * @author Jinx
 *
 */
public class TokenConstants {
	
	//access_token常量名
	public static String TOKEN_NAME = "access_token";
	//返回access_token状态码
	public static String TOKEN_STATUS = "token_status";
	//access_token无效
	public static String TOKEN_NOT_ALLOWED = "602";
	//access_token无效返回数据
	public static String TOKEN_NOT_ALLOWED_DATA = "{\"token_status\":602;\"msg\":\"access_token已失效！\"}";
	//access_token正确状态码
	public static String TOKEN_OK = "600";
	//access_token正确返回数据
	public static String TOKEN_OK_DATA = "{\"token_status\":600;\"msg\":\"access_token校验成功！\"}";
	//access_token不存在
	public static String TOKEN_NOT_EXIST = "604";
	//access_token不存在返回数据
	public static String TOKEN_NOT_EXIST_DATA = "{\"token_status\":604;\"msg\":\"access_token不存在！\"}";
	//用户session名称
	public static final String SESSION_USER = "session_user";

}
