package com.code.entity.sys;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 通道支持银行清单
 * @createtime 2016年5月11日下午5:18:15
 */
@Entity
@Table(name="web_channel_bank")
@Comment("通道支持银行清单")
public class WebChannelBank extends CommenEntity {
	/**
	 * 通道id
	 */
	@Comment("通道ID")
	private long channelId;
	/**
	 * 银行id
	 */
	@Comment("银行ID")
	private long BankId;
	/**
	 * 单次限额
	 */
	@Comment("单次限额")
	private double singleAmt;
	/**
	 * 单日限额
	 */
	@Comment("单日限额")
	private double dayAmt;
	/**
	 * 单月限额
	 */
	@Comment("单月限额")
	private double mouthAmt;
	/**
	 * 是否可用
	 * 0:不可用
	 * 1:可用
	 */
	@Comment("是否可用 0:不可用 1:可用")
	private int enable;
	/**
	 * 使用优先级
	 * 0:默认使用
	 */
	@Comment("使用优先级 0:默认使用")
	private int sort;
	/**
	 * 通道使用类型
	 * 0:提现
	 * 1:充值
	 */
	@Comment("通道使用类型 0:提现 1:充值")
	private int type;
	/**
	 * 通道使用场景
	 * 0:pc
	 * 1:微信
	 * 2:app
	 */
	@Comment("通道使用场景 0:PC 1:微信 2:APP")
	private int site;
	/**
	 * 费用比例
	 */
	@Comment("费用比例")
	private double fee;
	/**
	 * 最高费用
	 */
	@Comment("最高费用")
	private double maxFee;


	public long getChannelId() {
		return channelId;
	}
	public void setChannelId(long channelId) {
		this.channelId = channelId;
	}
	public long getBankId() {
		return BankId;
	}
	public void setBankId(long bankId) {
		BankId = bankId;
	}
	public double getSingleAmt() {
		return singleAmt;
	}
	public void setSingleAmt(double singleAmt) {
		this.singleAmt = singleAmt;
	}
	public double getDayAmt() {
		return dayAmt;
	}
	public void setDayAmt(double dayAmt) {
		this.dayAmt = dayAmt;
	}
	public double getMouthAmt() {
		return mouthAmt;
	}
	public void setMouthAmt(double mouthAmt) {
		this.mouthAmt = mouthAmt;
	}
	public int getEnable() {
		return enable;
	}
	public void setEnable(int enable) {
		this.enable = enable;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getSite() {
		return site;
	}
	public void setSite(int site) {
		this.site = site;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public double getMaxFee() {
		return maxFee;
	}
	public void setMaxFee(double maxFee) {
		this.maxFee = maxFee;
	}
	
	
}
