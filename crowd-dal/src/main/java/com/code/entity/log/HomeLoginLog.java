package com.code.entity.log;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 后台登录日志
 * @createtime 2016年5月11日下午5:48:01
 */
@Entity
@Table(name="home_login_log")
@Comment("后台登录日志")
public class HomeLoginLog extends CommenEntity {
	/**
	 * 登录用户id
	 */
	@Comment("登录用户ID")
	private long userId;
	/**
	 * 授权状态
	 * 0:新建
	 * 1:已经授权
	 */
	@Comment("授权状态 0:新建 1::已经授权")
	private int status;

	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
