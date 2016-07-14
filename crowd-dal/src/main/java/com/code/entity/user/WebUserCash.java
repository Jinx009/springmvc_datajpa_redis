package com.code.entity.user;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 用户提现记录表
 *
 */
@Entity
@Table(name="web_user_cash")
@Comment("用户提现记录表")
public class WebUserCash extends CommenEntity {
	
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
	 * 提现费用
	 */
	@Comment("提现费用")
	private double fee;
	/**
	 * 提现类别 
	 * 0:线上 
	 * 1:线下
	 */
	@Comment("提现类别 0:线上 1:线下")
	private int type;
	/**
	 * 提现状态 
	 * 0:提交中
	 * 1:提现成功
	 * 6::初审通过 
	 */
	@Comment("提现状态 0:提交中 1:提现成功 6:初审通过")
	private int status;
	/**
	 * 通道id
	 */
	@Comment("通道ID")
	private long channelId;
	
	/**
	 * 线上提现用户绑定银行卡id
	 */
	@Comment("线上提现用户绑定卡ID")
	private long userBankId;
	
	/**
	 * 线下提现姓名
	 */
	@Comment("线下提现姓名")
	private String realName;
	/**
	 * 身份证号
	 */
	@Comment("身份证号")
	private String idCard;
	/**
	 * 线下提现卡号
	 */
	@Comment("线下提现卡号")
	private String card;
	/**
	 * 省id
	 */
	@Comment("省ID")
	private long provinceId;
	/**
	 * 城市id
	 */
	@Comment("城市ID")
	private long cityId;
	
	/**
	 * 线下提现支行
	 */
	@Comment("线下提现支行")
	private String subBranch;


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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public long getChannelId() {
		return channelId;
	}

	public void setChannelId(long channelId) {
		this.channelId = channelId;
	}

	public long getUserBankId() {
		return userBankId;
	}

	public void setUserBankId(long userBankId) {
		this.userBankId = userBankId;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(long provinceId) {
		this.provinceId = provinceId;
	}

	public long getCityId() {
		return cityId;
	}

	public void setCityId(long cityId) {
		this.cityId = cityId;
	}

	public String getSubBranch() {
		return subBranch;
	}

	public void setSubBranch(String subBranch) {
		this.subBranch = subBranch;
	}

	
	

}
