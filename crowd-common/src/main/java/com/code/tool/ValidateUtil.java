package com.code.tool;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 校验辅助类
 * @author Jinx
 *
 */
public class ValidateUtil {

	/**
	 * 校验手机号码是否正确
	 * @param phone
	 * @return
	 */
	public static boolean isPhone(String phone){
		Pattern regex = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(17[0-9])|(18[0-9]))\\d{8}$");
		Matcher matcher = regex.matcher(StringUtils.isNull(phone));
		boolean isMatched = matcher.matches();
		return isMatched;
	}

	/**
	 * 校验密码格式正确性
	 * @param pwd
	 * @return
	 */
	public static boolean isPwd(String pwd) {
		Pattern regex = Pattern.compile("^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$");
		Matcher matcher = regex.matcher(StringUtils.isNull(pwd));
		boolean isMatched = matcher.matches();
		return isMatched;
	}
	
}
