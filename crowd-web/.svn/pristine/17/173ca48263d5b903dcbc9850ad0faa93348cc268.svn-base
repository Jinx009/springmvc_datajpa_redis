package com.code.listener;


import com.code.model.util.GlobalModel;
import com.code.service.home.HomeConfigService;
import com.code.service.sys.WebTemplateService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 全局监听器
 * @author Jinx
 *
 */
@Component
public class WebListener  implements ApplicationContextAware {
	private ApplicationContext applicationContext;
	/**
	 * 初始化全局变量
	 * @param applicationContext
	 * @throws BeansException
     */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("系统初始化完成");
		//手动注入dao或者Service
		HomeConfigService homeConfigService = (HomeConfigService) applicationContext.getBean("homeConfigService");
		GlobalModel.HOMECONFIGLIST = homeConfigService.findAll();
		WebTemplateService webTemplateService = (WebTemplateService)applicationContext.getBean("webTemplateService");
		GlobalModel.WEBTEMPLATELIST = webTemplateService.getUse(1);
	}
}
