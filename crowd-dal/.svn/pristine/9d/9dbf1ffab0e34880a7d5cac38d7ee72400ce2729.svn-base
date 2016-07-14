package com.code.entity.user;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 用户收货地址表
 * @createtime 2016年5月11日下午2:30:40
 */
@Entity
@Table(name="web_user_address")
@Comment("用户收货地址表")
public class WebUserAddress extends CommenEntity {
	/**
	 * 用户id
	 */
	@Comment("用户ID")
	private long userId;
	/**
	 * 收货人姓名
	 */
	@Comment("收货人姓名")
	private String realName;
	/**
	 * 收货人手机号
	 */
	@Comment("收货人手机号")
	private String mobilePhone;
	/**
	 * 省份Id
	 */
	@Comment("省份ID")
	private long provinceId;
	/**
	 * 城市id
	 */
	@Comment("城市ID")
	private long cityId;
	/**
	 * 具体地址
	 */
	@Comment("具体地址")
	private String address;
	/**
	 * 邮政编码
	 */
	@Comment("邮政编码")
	private long postNum;
	/**
	 * 默认地址
	 * 0:不是
	 * 1:是
	 */
	@Comment("默认地址 0:不是 1:是")
	private int status;


	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPostNum() {
		return postNum;
	}
	public void setPostNum(long postNum) {
		this.postNum = postNum;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
