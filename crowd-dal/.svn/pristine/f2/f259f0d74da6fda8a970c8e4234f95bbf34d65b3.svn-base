package com.code.entity.project;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 项目订单表
 * @createtime 2016年5月11日下午4:50:19
 */
@Entity
@Table(name="web_project_orer")
@Comment("项目订单表")
public class WebProjectOrder extends CommenEntity {
	
	private static final long serialVersionUID = 4072102612537067813L;
	/**
	 * 用户Id
	 */
	@Comment("用户ID")
	private long userId;
	/**
	 * 购买金额
	 */
	@Comment("购买金额")
	private double money;
	/**
	 * 当前支付金额
	 */
	@Comment("当前支付金额")
	private double payMoney;
	/**
	 * 订单支付状态
	 * 1:预约
	 * 2:付全款
	 * 3:取消
	 * 4:失败
	 */
	@Comment("订单支付状态 1:预约 2:付全款 3:取消 4:失败")
	private int payStatus;
	/**
	 * 用户收货地址Id
	 */
	@Comment("用户收货地址ID")
	private long userAddress;
	/**
	 * 项目id
	 */
	@Comment("项目ID")
	private long projectId;
	/**
	 * 对应权益id
	 */
	@Comment("对应权益id")
	private long profitId;
	

	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public double getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(double payMoney) {
		this.payMoney = payMoney;
	}
	public int getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(int payStatus) {
		this.payStatus = payStatus;
	}
	public long getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(long userAddress) {
		this.userAddress = userAddress;
	}
	public long getProjectId() {
		return projectId;
	}
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	public long getProfitId() {
		return profitId;
	}
	public void setProfitId(long profitId) {
		this.profitId = profitId;
	}
	
	
}
