package com.code.tool.controller;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.code.constants.TokenConstants;

/**
 * Controller 基类
 * @author Jinx
 *
 */
public class BaseController{

    /**
     * ThreadLocal确保高并发下每个请求的request，response都是独立的
     */
    private static ThreadLocal<ServletRequest> currentRequest = new ThreadLocal<ServletRequest>();
    private static ThreadLocal<ServletResponse> currentResponse = new ThreadLocal<ServletResponse>();

    
    
    /**
     * 线程安全初始化reque，respose对象
     * 
     * @param request
     * @param response
     */
    @ModelAttribute
    public void initReqAndRep(HttpServletRequest request, HttpServletResponse response) {
        currentRequest.set(request);
        currentResponse.set(response);
    }

    /**
     * 线程安全
     * 
     * @return
     * @date 2015年11月24日
     * @author 漂泊者及其影子
     */
    public HttpServletRequest request() {
        return (HttpServletRequest) currentRequest.get();
    }

    /**
     * 获取session中用户
     * @return
     */
    public Object getSessionUser(){
    	HttpServletRequest request = (HttpServletRequest) currentRequest.get();
    	HttpSession httpSession = request.getSession();
    	return httpSession.getAttribute(TokenConstants.SESSION_USER);
    }
    
    /**
     * 线程安全
     * 
     * @return
     * @date 2015年11月24日
     * @author 漂泊者及其影子
     */
    public HttpServletResponse response() {
        return (HttpServletResponse) currentResponse.get();
    }

}
