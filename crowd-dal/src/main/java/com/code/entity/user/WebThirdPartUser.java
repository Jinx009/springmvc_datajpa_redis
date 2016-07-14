package com.code.entity.user;

import java.util.Date;

import javax.persistence.*;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 第三方用户表
 *
 */
@Entity
@Table(name="web_third_part_user")
@Comment("第三方用户表")
public class WebThirdPartUser extends CommenEntity {
	
	/**
	 * 第三方来源
	 * 1:微信
	 * 2:微博
	 * 3:QQ
	 * 4:支付宝
	 * 5:邮箱
	 * 
	 */
	@Comment("第三方来源 0:第三方来源 1:微信 2:微博 3:QQ 4:支付宝 5:邮箱")
	private int thirdPartType;
	/**
	 * 第三方平台appid
	 */
	@Comment("第三方平台ID")
	private String thirdPartAppid;
	/**
	 * 第三方客户标志id
	 */
	@Comment("第三方客户标志ID")
	private String thirdPartOpenid;
	/**
	 * 登录次数
	 */
	@Comment("登录次数")
	private long loginTimes;
	/**
	 * 绑定真实账户id
	 */
	@Comment("绑定真实账户ID")
	private long bindId;
	/**
	 * 绑定状态
	 * 0:已取消
	 * 1:绑定中
	 */
	@Comment("绑定状态 0:已取消 1:绑定中")
	private int bindStatus;
	/**
	 * 绑定/解绑时间
	 */
	@Column(name="bind_time")
	@Temporal(TemporalType.TIMESTAMP)
	@Comment("绑定/解绑时间")
	private Date bindTime;
	/**
	 * 第三方用户昵称
	 */
	@Comment("第三方用户昵称")
	private String nickName;
	/**
	 * 第三方用户头像
	 */
	@Comment("第三方用户头像")
	private String headPicPath;


	public int getThirdPartType() {
		return thirdPartType;
	}

	public void setThirdPartType(int thirdPartType) {
		this.thirdPartType = thirdPartType;
	}

	public String getThirdPartAppid() {
		return thirdPartAppid;
	}

	public void setThirdPartAppid(String thirdPartAppid) {
		this.thirdPartAppid = thirdPartAppid;
	}

	public String getThirdPartOpenid() {
		return thirdPartOpenid;
	}

	public void setThirdPartOpenid(String thirdPartOpenid) {
		this.thirdPartOpenid = thirdPartOpenid;
	}

	public long getLoginTimes() {
		return loginTimes;
	}
	public void setLoginTimes(long loginTimes) {
		this.loginTimes = loginTimes;
	}
	public long getBindId() {
		return bindId;
	}
	public void setBindId(long bindId) {
		this.bindId = bindId;
	}
	public int getBindStatus() {
		return bindStatus;
	}
	public void setBindStatus(int bindStatus) {
		this.bindStatus = bindStatus;
	}
	public Date getBindTime() {
		return bindTime;
	}
	public void setBindTime(Date bindTime) {
		this.bindTime = bindTime;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getHeadPicPath() {
		return headPicPath;
	}
	public void setHeadPicPath(String headPicPath) {
		this.headPicPath = headPicPath;
	}
	
	
}
