package com.code.entity.user;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 用户充值记录表
 *
 */
@Entity
@Table(name="web_user_recharge")
@Comment("用户充值记录表")
public class WebUserRecharge extends CommenEntity {


	/**
	 * 线上充值等待中
	 */
	public static final int STATUS_ONLINE=0;
	/**
	 * 线上充值成功状态
	 */
	public static final int STATU_ONLINE_SUCCESS=3;
	/**
	 * 线上充值失败状态
	 */
	public static final int STATU_ONLINE_FAIL=2;

	/**
	 * 用户id
	 */
	@Comment("用户ID")
	private long userId;
	/**
	 * 变动金额
	 */
	@Comment("变动金额")
	private double money; 
	/**
	 * 真实变动金额
	 */
	@Comment("真实变动金额")
	private double realMoney;
	/**
	 * 充值费用
	 */
	@Comment("充值费用")
	private double fee;
	/**
	 * 充值状态
	 * 0:线下待审核
	 * 6:线下初审通过
	 * 1:线下复审通过（成功）
	 * 2:线下充值失败
	 */
	@Comment("充值状态 0:线下待审核 6:线下初审通过 1:线下复审通过(成功) 2:线下充值失败")
	private int status;
	/**
	 * 充值类型
	 * 0:线上
	 * 1:线下
	 */
	@Comment("充值类型 0:线上 1:线下")
	private int type;
	
	/**
	 * 平台订单号
	 */
	@Comment("平台订单号")
	private String orderId;
	/**
	 * 绑卡id
	 */
	@Comment("绑卡ID")
	private long userBankId;
	
	/**
	 * 通道Id
	 */
	@Comment("通道ID")
	private long channelId;
	/**
	 * 通道订单号
	 */
	@Comment("通道订单号")
	private String channelOrderId;
	/**
	 * 线下充值真实姓名
	 */
	@Comment("线下充值真实姓名")
	private String realName;
	/**
	 * 线下银行卡号
	 */
	@Comment("线下银行卡号")
	private String bankCard;
	/**
	 * 线下充值身份证号
	 */
	@Comment("线下充值身份证号")
	private String idCard;
	/**
	 * 备注信息(委托充值)
	 */
	@Comment("备注信息(委托充值)")
	private String remark;


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
	public double getRealMoney() {
		return realMoney;
	}
	public void setRealMoney(double realMoney) {
		this.realMoney = realMoney;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public long getUserBankId() {
		return userBankId;
	}
	public void setUserBankId(long userBankId) {
		this.userBankId = userBankId;
	}
	public long getChannelId() {
		return channelId;
	}
	public void setChannelId(long channelId) {
		this.channelId = channelId;
	}
	public String getChannelOrderId() {
		return channelOrderId;
	}
	public void setChannelOrderId(String channelOrderId) {
		this.channelOrderId = channelOrderId;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getBankCard() {
		return bankCard;
	}
	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	

}
