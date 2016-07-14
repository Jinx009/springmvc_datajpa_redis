package com.code.entity.log;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 短信日志表
 * @createtime 2016年5月11日下午5:35:02
 */
@Entity
@Table(name="web_notice_log")
@Comment("短信日志表")
public class WebNoticeLog extends CommenEntity {
	
	private static final long serialVersionUID = -6389849488476083126L;
	
	/**
	 * 发送用户手机号
	 */
	@Comment("发送用户手机号")
	private String mobilePhone;
	/**
	 * 发送内容
	 */
	@Comment("发送内容")
	private String content;
	/**
	 * 发送时间
	 */
	@Comment("发送时间")
	private Date sendTime;
	/**
	 * 发送状态
	 * 0:未发送
	 * 1:发送成功
	 * 2:发送失败
	 */
	@Comment("发送状态 0:未发送 1:发送成功 2:发送失败")
	private int status;
	/**
	 * 失败原因
	 */
	@Comment("失败原因")
	private String remark;


	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
