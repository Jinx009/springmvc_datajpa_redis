package com.code.entity.user;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 用户资金日志表
 *
 */
@Entity
@Table(name="web_user_account_log")
@Comment("用户资金日志表")
public class WebUserAccountLog extends CommenEntity {
	
	/**
	 * 用户Id
	 */
	@Comment("用户ID")
	private long userId;
	/**
	 * 日志类型
	 * invest：投资相关；
	 * online_recharge：线上充值；
	 * off_rechage： 线下充值；
	 * cash_frost：申请提现成功；
	 * cash_success：提现成功
	 */
	@Comment("日志类型")
	private String type;
	/**
	 * 变动金额
	 */
	@Comment("变动金额")
	private double money;
	/**
	 * 日志内容
	 */
	@Comment("日志内容")
	private String content;
	/**
	 * 用户来源
	 * 0:正常手机用户
	 * 1:第三方用户
	 */
	@Comment("用户来源 0:正常手机用户 1:第三方用户")
	private int userType;
	/**
	 * 金额变动状态
	 * 0:减少
	 * 1:增加
	 */
	@Comment("金额变动状态 0:减少 1:增加")
	private int changeType;

	public WebUserAccountLog() {
	}

	public WebUserAccountLog(long userId, String type, double money, String content, int userType, int changeType) {
		this.userId = userId;
		this.type = type;
		this.money = money;
		this.content = content;
		this.userType = userType;
		this.changeType = changeType;
	}

	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getChangeType() {
		return changeType;
	}
	public void setChangeType(int changeType) {
		this.changeType = changeType;
	}
	
	
}
