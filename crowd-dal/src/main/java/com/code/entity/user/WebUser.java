package com.code.entity.user;




import javax.persistence.Entity;
import javax.persistence.Table;


import org.hibernate.annotations.Comment;

import com.code.entity.CommenEntity;


/**
 * 
 * @author 高雄辉
 * @description 用户表
 *
 */
@Entity
@Table(name="web_user")
@Comment("用户表")
public class WebUser extends CommenEntity {
	
	private static final long serialVersionUID = -9004433090584785754L;
	
	/**
	 * 登录用户名
	 */
	@Comment(value = "登录用户名")
	private String userName;
	/**
	 * 登录密码
	 */
	@Comment("登录密码")
	private String pwd;
	/**
	 * 支付密码
	 */
	@Comment("支付密码")
	private String payPwd;
	/**
	 * 注册来源
	 */
	@Comment("注册来源")
	private int registerSite;
	/**
	 * 邀请码
	 */
	@Comment("邀请码")
	private String inviteCode;
	/**
	 * 注册邀请码
	 */
	@Comment("注册邀请码")
	private String registerCode;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPayPwd() {
		return payPwd;
	}
	public void setPayPwd(String payPwd) {
		this.payPwd = payPwd;
	}
	public int getRegisterSite() {
		return registerSite;
	}
	public void setRegisterSite(int registerSite) {
		this.registerSite = registerSite;
	}
	public String getInviteCode() {
		return inviteCode;
	}
	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}
	public String getRegisterCode() {
		return registerCode;
	}
	public void setRegisterCode(String registerCode) {
		this.registerCode = registerCode;
	}
	
	

}
