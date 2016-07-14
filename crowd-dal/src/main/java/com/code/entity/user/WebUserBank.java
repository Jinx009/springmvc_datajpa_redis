package com.code.entity.user;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import com.code.entity.sys.WebBank;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 用户绑卡信息表
 * @createtime 2016年5月11日下午2:22:26
 */
@Entity
@Table(name="web_user_bank")
@Comment("用户绑卡信息表")
public class WebUserBank extends CommenEntity {
	/**
	 * 用户id
	 */
	@Comment("用户ID")
	private long userId;
	/**
	 * 银行卡号
	 */
	@Comment("银行卡号")
	private String card;
	/**
	 * 绑卡状态
	 * 0:失败
	 * 1:成功
	 */
	@Comment("绑卡状态 0:失败 1:成功")
	private int status;
	/**
	 * 银行信息id
	 */
	@Comment("银行信息ID")
	@ManyToOne
	@JoinColumn(name="bank_id")
	private WebBank webBank;
	/**
	 * 绑定id
	 */
	@Comment("绑定ID")
	private String bind_id;
	/**
	 * 通道id
	 */
	@Comment("通道ID")
	private long channelId;
	/**
	 * 省份id
	 */
	@Comment("省份ID")
	private long provinceId;
	/**
	 * 城市id
	 */
	@Comment("城市ID")
	private long cityId;
	/**
	 * 支行名称
	 */
	@Comment("支行名称")
	private String subBranch;
	/**
	 * 手机号码
	 */
	@Comment("手机号码")
	private String mobilePhone;


	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public WebBank getWebBank() {
		return webBank;
	}

	public void setWebBank(WebBank webBank) {
		this.webBank = webBank;
	}

	public String getBind_id() {
		return bind_id;
	}

	public void setBind_id(String bind_id) {
		this.bind_id = bind_id;
	}

	public long getChannelId() {
		return channelId;
	}

	public void setChannelId(long channelId) {
		this.channelId = channelId;
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

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
}
