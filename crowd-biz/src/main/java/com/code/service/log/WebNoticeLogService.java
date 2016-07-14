package com.code.service.log;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.code.dao.log.WebNoticeLogDao;
import com.code.entity.log.WebNoticeLog;
import com.code.entity.sys.WebTemplate;
import com.code.model.sys.NoticeModel;
import com.code.tool.StringUtils;
import com.code.util.web.NoticeSendModel;

@Service
@Transactional(readOnly = true)
public class WebNoticeLogService {

	@Autowired
	private WebNoticeLogDao webNoticeLogDao;
	
	/**
	 * 非定时短信创建
	 * @param webTemplate
	 * @param noticeModel
	 * @param mobilePhone
	 */
	public void save(WebTemplate webTemplate,NoticeModel noticeModel,String mobilePhone){
		if(null!=webTemplate){
			WebNoticeLog webNoticeLog = new WebNoticeLog();
			webNoticeLog.setCreateDate(new Date());
			webNoticeLog.setCreateIp(null);
			webNoticeLog.setMobilePhone(mobilePhone);
			webNoticeLog.setRemark(null);
			webNoticeLog.setSendTime(null);
			webNoticeLog.setStatus(0);
			webNoticeLog.setLastUpdateDate(null);
			webNoticeLog.setContent(StringUtils.fillTemplet(webTemplate.getContent(),NoticeModel.getMap(noticeModel)));
			webNoticeLogDao.save(webNoticeLog);
		}
	}

	/**
	 * 操作发送短信
	 */
	public void send() {
		List<WebNoticeLog> list = webNoticeLogDao.findNeedSend();
		if(list!=null&!list.isEmpty()){
			for(WebNoticeLog webNoticeLog:list){
				if(null!=webNoticeLog.getSendTime()){
					webNoticeLog = webNoticeLogDao.findOne(webNoticeLog.getId());
					Date date = new Date();
					if(webNoticeLog.getSendTime().before(date)){
						String result = NoticeSendModel.send(webNoticeLog.getMobilePhone(),webNoticeLog.getContent());
						if("ok".equals(result)){
							webNoticeLogDao.update(1,result,webNoticeLog.getId());
						}else{
							webNoticeLogDao.update(2,result,webNoticeLog.getId());
						}
					}
				}else{
					String result = NoticeSendModel.send(webNoticeLog.getMobilePhone(),webNoticeLog.getContent());
					if("ok".equals(result)){
						webNoticeLogDao.update(1,result,webNoticeLog.getId());
					}else{
						webNoticeLogDao.update(2,result,webNoticeLog.getId());
					}
				}
			}
		}
	}
	
}
