package com.code.tool;

import java.util.Random;

public class RandomUtil {

	/**
	 * 获取随机字符，包含小写字母和数字，不允许重复
	 * 
	 * <p>
	 * (a) 没有1和l，以免混淆
	 * <p>
	 * (b) 没有0和O，以免混淆
	 * <p>
	 * (c) 没有4和b，避嫌
	 * 
	 * 
	 * @param length
	 * @return
	 */
	public static String getSpecialRandomCode(int length) {
		String base = "2356789acdefghijkmnpqrstuvwxyz";
		return getUniqueRandomString(length, base);
	}
	
	/**
	 * 从指定的字符串范围内，获取指定长度的随机字符，不允许重复
	 * 
	 * @param length
	 * @param base
	 * @return String
	 */
	private static String getUniqueRandomString(int length, String base) {
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		while (sb.length() < length) {
			int number = random.nextInt(base.length());
			char tempChar = base.charAt(number);
			if (sb.indexOf(String.valueOf(tempChar)) < 0) {
				sb.append(tempChar);
			}
		}
		return sb.toString();
	}
	
	/**
	 * 获取六位数字验证码
	 * @return
	 */
	public static String getSixNum(){
		return String.valueOf((int)(Math.random()*899998+100000));
	}
	
	public static void main(String[] args) {
		System.out.println(getSixNum());
	}
}
