package com.code.tool;


import org.apache.log4j.Logger;

/**
 * 发送短信
 * @author Jinx
 *
 */
public class MsgUtil {

	private Logger logger = Logger.getLogger(MsgUtil.class);
	//发送人
	private String mobilePhone;
	//短信内容
	private String content;
	//产品id
	private static final String productid = "800800";
	
	public MsgUtil(){
		
	}
	public MsgUtil(String mobilePhone,String content){
		this.mobilePhone = mobilePhone;
		this.content = content;
	}

	/**
	 * 真实发送短信
	 * @param phone
	 * @param content
	 * @return
	 */
	public String send() {
			content = content+"【800众服】";
			String dstime = "";
			String xh = "";
			String url = ChangeConstants.MSG_URL+"?username="+ChangeConstants.MSG_USERNAME+
								  "&password="+ChangeConstants.MSG_PWD+ 
								  "&mobile="+mobilePhone+
								  "&content="+content+ 
								  "&productid="+productid+
								  "&xh="+xh+
								  "&dstime="+dstime+"";
			logger.debug("url:" + url);
			String s = HttpUtil.getHttpResponse(url);
			String result = "ok";
			if ("-1".equals(s)) {
				result = "用户名或者密码不正确,"+s;
			} else if (s.contains("1,")){
				result = "ok";
			} else if (s.contains("0,")){
				result = "短信发送失败,"+s;
			} else if ("2".equals(s)){
				result = "余额不足,"+s;
			} else if ("3".equals(s)){
				result = "扣费失败（请联系客服）,"+s;
			} else if (s.contains("5,")) {
				result = "短信定时成功,"+s;
			} else if ("6".equals(s)) {
				result = "有效号码为空,"+s;
			} else if ("7".equals(s)) {
				result = "短信内容为空, "+s;
			} else if ("8".equals(s)) {
				result = "无签名，必须，格式：【签名】,"+s;
			} else if ("9".equals(s)){
				result = "没有Url提交权限, "+s;
			} else if ("10".equals(s)) {
				result = "发送号码过多,最多支持200个号码,"+s;
			} else if ("11".equals(s)){
				result = "产品ID异常, "+s;
			} else if ("12".equals(s)){
				result = "参数异常, " + s;
			} else if ("13".equals(s)){
				result = "12小时重复提交, "+s;
			} else if ("14".equals(s)){
				result = "用户名或密码不正确，产品余额为0，禁止提交，联系客服,"+s;
			} else if ("15".equals(s)){
				result = "Ip验证失败,"+s;
			} else if ("19".equals(s)) {
				result = "短信内容过长，最多支持500个,"+s;
			} else if ("20".equals(s)) {
				result = "定时时间不正确：格式：20130202120212(14位数字),"+s;
			}
			logger.info("【助通】发送手机号："+mobilePhone+" 内容：  "+content+" 结果：  "+result);
			return result;
	}
	
	
	
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
