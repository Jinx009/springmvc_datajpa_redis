package com.code.model.sys;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.code.tool.StringUtils;

/**
 * 短信辅助变量类
 * @author Jinx
 *
 */
public class NoticeModel {

	//发送用户名
	private String userName;
	//关联项目名称
	private String projectName;
	//实际支付金额
	private Double payMoney;
	//关联投资金额
	private Double investMoney;
	//发生时间
	private Date happenTime;
	//事件即将改变事件
	private Date updateTime;
	//卡券信息
	private String card;
	//过期天数
	private Integer days;
	//验证码
	private String code;
	
	//默认构造函数
	public NoticeModel(){
		
	}
	
	//新建构造函数
	public NoticeModel(String userName,String projectName,Double payMoney,Double investMoney,Date happenTime,Date updateTime,String card,Integer days,String code){
		this.userName = userName;
		this.projectName = projectName;
		this.payMoney = payMoney;
		this.investMoney = investMoney;
		this.happenTime = happenTime;
		this.updateTime = updateTime;
		this.card = card;
		this.days = days;
		this.code = code;
	}
	
	//短信通道
	public static Map<String,Object> getMap(NoticeModel noticeModel) {
		Map<String,Object> map = new HashMap<String, Object>();
		if(noticeModel!=null){
			map.put("userName",StringUtils.isNull(noticeModel.getUserName()));
			map.put("projectName",StringUtils.isNull(noticeModel.getProjectName()));
			map.put("payMoney",StringUtils.changeDouble(noticeModel.getPayMoney()));
			map.put("investMoney",StringUtils.changeDouble(noticeModel.getInvestMoney()));
			map.put("card",StringUtils.isNull(noticeModel.getCard()));
			map.put("code",StringUtils.isNull(noticeModel.getCode()));
			if(null!=noticeModel.getHappenTime())
				map.put("happenTime",StringUtils.getShortTime(noticeModel.getHappenTime()));
			if(null!=noticeModel.getUpdateTime())
				map.put("updateTime",StringUtils.getShortTime(noticeModel.getUpdateTime()));
			if(null!=noticeModel.getDays())
				map.put("days",String.valueOf(noticeModel.getDays()));
		}
		return map;
	}
	
	
	
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Double getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(Double payMoney) {
		this.payMoney = payMoney;
	}
	public Double getInvestMoney() {
		return investMoney;
	}
	public void setInvestMoney(Double investMoney) {
		this.investMoney = investMoney;
	}
	public Date getHappenTime() {
		return happenTime;
	}
	public void setHappenTime(Date happenTime) {
		this.happenTime = happenTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
