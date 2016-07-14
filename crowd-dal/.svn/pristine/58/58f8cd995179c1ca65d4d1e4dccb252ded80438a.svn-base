package com.code.entity.sys;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 系统支付通道管理清单
 * @createtime 2016年5月11日下午5:16:23
 */
@Entity
@Table(name="web_channel")
@Comment("系统支付通道清单")
public class WebChannel extends CommenEntity{
	/**
	 * 通道编码
	 */
	@Comment("通道编码")
	private String channelKey;
	/**
	 * 通道名称
	 */
	@Comment("通道名称")
	private String channelName;
	/**
	 * 通道logo路径
	 */
	@Comment("通道LOGO路径")
	private String picPath;
	
	
	
	
	public String getChannelKey() {
		return channelKey;
	}
	public void setChannelKey(String channelKey) {
		this.channelKey = channelKey;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getPicPath() {
		return picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	
	
}
