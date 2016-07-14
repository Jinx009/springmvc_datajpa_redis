package com.code.entity.home;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 后台登录账户表
 * @createtime 2016年5月11日下午5:39:31
 */
@Entity()
@Table(name="home_user")
@Comment("后台登录账户表")
public class HomeUser extends CommenEntity {
	/**
	 * 登录用户名
	 */
	@Comment("登录用户名")
	private String userName;
	/**
	 * 登录密码
	 */
	@Comment("登录密码")
	private String pwd;
	/**
	 * 后台用户名
	 */
	@Comment("后台用户名")
	private String realName;
	/**
	 * 对应微信id
	 */
	@Comment("对应微信id")
	private String openid;
	/**
	 * 可用状态:
	 * 0:不可用
	 * 1:可用
	 */
	@Comment("可用状态")
	private int status;
	/**
	 * 角色id
	 */
	@Comment("角色id")
	private long roleId;


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
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	
	
}
