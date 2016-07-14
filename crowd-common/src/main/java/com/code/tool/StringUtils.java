package com.code.tool;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public final class StringUtils{

	/**
	 * 检验是否非空字符串
	 * 
	 * @param str
	 * @return boolean
	 */
	public static boolean isNotBlank(String str) {
		return !isNull(str).equals("");
	}
	
	/**
	 * 将对象转为字符串
	 * 
	 * @param o
	 * @return String
	 */
	public static String isNull(Object o) {
		if (o == null) {
			return "";
		}
		String str = "";
		if (o instanceof String) {
			str = (String) o;
		} else {
			str = o.toString();
		}
		return str.trim();
	}
	
	/**
	 * FreeMarker 模板生成字符串
	 * @param template
	 * @param sendData
	 * @return
	 */
	public static String fillTemplet(String template,Map<String,Object> data) {
		// 模板中的'是非法字符，会导致无法提交，所以页面上用`代替
		template = template.replace('`', '\'');
		try {
			return FreemarkerUtil.renderTemplate(template,data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	
	/**
	 * 首字母大写
	 * 
	 * @param s
	 * @return String
	 */
	public static String firstCharUpperCase(String s) {
		StringBuffer sb = new StringBuffer(s.substring(0, 1).toUpperCase());
		sb.append(s.substring(1, s.length()));
		return sb.toString();
	}

	/**
	 * 获取短时间
	 * @param happenTime
	 * @return
	 */
	public static String getShortTime(Date date) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  
        return df.format(date);  
	}

	/**
	 * 转换为两位小数
	 * @param investMoney
	 * @return
	 */
	public static String changeDouble(Double money) {
		DecimalFormat df=new DecimalFormat("0.##");
		return df.format(money);
	}
}
