package com.code.entity.user;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 用户资金表
 * @createtime 2016年5月11日下午2:19:00
 */
@Entity
@Table(name="web_user_account")
@Comment("用户资金表")
public class WebUserAccount extends CommenEntity {

	private static final long serialVersionUID = 7809878092212994185L;

	/**
	 * 用户id
	 */
	@Comment("用户ID")
	private long userId;
	/**
	 * 可用余额
	 */
	@Comment("可用金额")
	private double useMoney;
	/**
	 * 投资总额
	 */
	@Comment("投资金额")
	private double investMoney;
	/**
	 * 冻结金额
	 */
	@Comment("冻结金额")
	private double frozenMoney;


	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public double getUseMoney() {
		return useMoney;
	}
	public void setUseMoney(double useMoney) {
		this.useMoney = useMoney;
	}
	public double getInvestMoney() {
		return investMoney;
	}
	public void setInvestMoney(double investMoney) {
		this.investMoney = investMoney;
	}
	public double getFrozenMoney() {
		return frozenMoney;
	}
	public void setFrozenMoney(double frozenMoney) {
		this.frozenMoney = frozenMoney;
	}
	
	
}
