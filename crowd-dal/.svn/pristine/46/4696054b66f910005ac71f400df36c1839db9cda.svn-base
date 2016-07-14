package com.code.entity.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 用户状态表
 * @createtime 2016年5月11日下午2:35:21
 */
@Entity
@Table(name="web_user_status")
@Comment("用户状态表")
public class WebUserStatus extends CommenEntity {
	
	private static final long serialVersionUID = 3985879114339054239L;
	/**
	 * 用户Id
	 */
	@Comment("用户ID")
	private long userId;
	/**
	 * 交易密码设置状态
	 * 0:未设置
	 * 1:已设置
	 */
	@Comment("交易密码设置状态 0:未设置 1:已设置")
	private int payPwdSettingStatus;
	/**
	 * 账户状态
	 * 0:不可用
	 * 1:正常
	 */
	@Comment("账户状态 0:不可用 1:正常")
	private int userStatus;
	/**
	 * 账户登录状态
	 * 0:冻结
	 * 1:正常
	 */
	@Comment("账户登录状态 0:冻结 1:正常")
	private int loginStatus;
	/**
	 * 账户密码错误次数
	 */
	@Comment("账户密码错误次数")
	private int loginFailTimes;
	/**
	 * 登录锁定时间
	 */
	@Comment("登录锁状态")
	private Date loginlockTime;
	/**
	 * 交易密码状态
	 * 0:冻结
	 * 1:正常
	 */
	@Comment("交易密码状态 0:冻结 1:正常")
	private int payStatus;
	/**
	 * 交易密码错误次数
	 */
	@Comment("交易密码错误次数")
	private int payFailTimes;
	/**
	 * 交易密码锁定时间
	 */
	@Comment("交易密码锁定时间")
	private Date payLockTime;
	/**
	 * 用户实名状态
	 * 0:未实名
	 * 1:实名
	 */
	@Comment("用户实名状态 0:未实名 1:实名")
	private int realNameStatus;
	/**
	 * 用户绑卡状态
	 * 0:未绑卡
	 * 1:已绑卡
	 */
	@Comment("用户绑卡状态 0:未绑卡 1:已绑卡")
	private int bankStatus;
	/**
	 * 用户合格投资人认证状态
	 * 0:未认证
	 * 1:已认证
	 */
	@Comment("用户合格投资人认证状态 0:未认证 1:已认证")
	private int investorStatus;
	/**
	 * 项目方状态
	 * 0:不是
	 * 1:是
	 */
	@Comment("项目方状态 0:不是 1:是")
	private int approvalStatus;
	/**
	 * 项目方发起备注
	 */
	@Comment("项目方发起备注")
	private String businessLicense;
	/**
	 * 投资人等级
	 */
	@Comment("投资人等级")
	private int investorLevel;
	/**
	 * 发起人级别
	 */
	@Comment("发起人级别")
	private int projectLevel;
	/**
	 * 领头人级别
	 */
	@Comment("领投人级别")
	private int leaderLevel;


	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public int getPayPwdSettingStatus() {
		return payPwdSettingStatus;
	}
	public void setPayPwdSettingStatus(int payPwdSettingStatus) {
		this.payPwdSettingStatus = payPwdSettingStatus;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	public int getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}
	public int getLoginFailTimes() {
		return loginFailTimes;
	}
	public void setLoginFailTimes(int loginFailTimes) {
		this.loginFailTimes = loginFailTimes;
	}
	public Date getLoginlockTime() {
		return loginlockTime;
	}
	public void setLoginlockTime(Date loginlockTime) {
		this.loginlockTime = loginlockTime;
	}
	public int getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(int payStatus) {
		this.payStatus = payStatus;
	}
	public int getPayFailTimes() {
		return payFailTimes;
	}
	public void setPayFailTimes(int payFailTimes) {
		this.payFailTimes = payFailTimes;
	}
	public Date getPayLockTime() {
		return payLockTime;
	}
	public void setPayLockTime(Date payLockTime) {
		this.payLockTime = payLockTime;
	}
	public int getRealNameStatus() {
		return realNameStatus;
	}
	public void setRealNameStatus(int realNameStatus) {
		this.realNameStatus = realNameStatus;
	}
	public int getBankStatus() {
		return bankStatus;
	}
	public void setBankStatus(int bankStatus) {
		this.bankStatus = bankStatus;
	}
	public int getInvestorStatus() {
		return investorStatus;
	}
	public void setInvestorStatus(int investorStatus) {
		this.investorStatus = investorStatus;
	}
	public int getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(int approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public String getBusinessLicense() {
		return businessLicense;
	}
	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}
	public int getInvestorLevel() {
		return investorLevel;
	}
	public void setInvestorLevel(int investorLevel) {
		this.investorLevel = investorLevel;
	}
	public int getProjectLevel() {
		return projectLevel;
	}
	public void setProjectLevel(int projectLevel) {
		this.projectLevel = projectLevel;
	}
	public int getLeaderLevel() {
		return leaderLevel;
	}
	public void setLeaderLevel(int leaderLevel) {
		this.leaderLevel = leaderLevel;
	}
	
	
	
}
