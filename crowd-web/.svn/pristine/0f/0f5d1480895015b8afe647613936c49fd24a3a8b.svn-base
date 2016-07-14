package com.code.task;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;

import com.code.service.log.WebNoticeLogService;


public class ScheduledTask {
	
	@Value("#{clientInfo.app}")
	private boolean app;
	
	@Autowired
	private WebNoticeLogService webNoticeLogService;
	

	
	/**
	 * 发送短信
	 */
	@Scheduled(cron = "*/2 * * * * ?")//每隔5秒执行一次
    public void taskCycle(){
		webNoticeLogService.send();
    }
}
