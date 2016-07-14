package com.code.tool;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

/**
 * Spring bean 辅助方法
 * @author Jinx
 *
 */
public class BeanUtil {

	private static WebApplicationContext ctx = ContextLoader.getCurrentWebApplicationContext();

	/**
	 * Spring bean 获取方法
	 * @param name
	 * @return
	 */
	public static Object getBean(String name) {
		return ctx.getBean(name);
	}
	
}
