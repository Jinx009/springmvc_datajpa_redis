package com.code.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.data.redis.core.RedisTemplate;

import com.code.constants.TokenConstants;
import com.code.entity.user.WebUser;
import com.code.tool.BeanUtil;
import com.code.tool.StringUtils;

public class ProjectFilter  implements Filter{

	@SuppressWarnings("unused")
	private FilterConfig filterConfig;
	private RedisTemplate<String,WebUser> redisTemplate;
	
	public void destroy() {
		this.filterConfig = null;
	}

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) servletRequest;
		HttpServletResponse res = (HttpServletResponse) servletResponse;
		res.setContentType("text/json;charset=utf-8");
		String accessToken = req.getHeader(TokenConstants.TOKEN_NAME);
		//app常规将access_token放到request header里面
		if(StringUtils.isNotBlank(accessToken)){
			WebUser webUser = redisTemplate.opsForValue().get(accessToken); 
			if(null!=webUser){
				req.getSession().setAttribute(TokenConstants.SESSION_USER,webUser);
			}
		}else{
			//html传输access_token方式
			accessToken = req.getParameter(TokenConstants.TOKEN_NAME);
			if(StringUtils.isNotBlank(accessToken)){
				WebUser webUser2 = redisTemplate.opsForValue().get(accessToken);  
				if(null!=webUser2){
					req.getSession().setAttribute(TokenConstants.SESSION_USER,webUser2);
				}
			}
		}
		filterChain.doFilter(req,res);
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		//applicationContext=new ClassPathXmlApplicationContext("classpath:redis-context.xml");
		redisTemplate = (RedisTemplate<String, WebUser>) BeanUtil.getBean("redisTemplate");
	}

}

