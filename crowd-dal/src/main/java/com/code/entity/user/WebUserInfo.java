package com.code.entity.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import com.code.entity.sys.WebAddress;

import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 用户信息表
 * @createtime 2016年5月11日下午2:46:40
 */
@Entity
@Table(name="web_user_info")
@Comment("用户信息表")
public class WebUserInfo extends CommenEntity {
	
	private static final long serialVersionUID = -3722340291291885202L;
	/**
	 * 用户id
	 */
	@Comment("用户ID")
	private long userId;
	/**
	 * 真实姓名
	 */
	@Comment("真实姓名")
	private String realName;
	/**
	 * 用户昵称
	 */
	@Comment("用户昵称")
	private String nickName;
	/**
	 * 用户住址
	 */
	@Comment("用户地址")
	private String address;
	/**
	 * 用户头像地址
	 */
	@Comment("用户头像地址")
	private String headPicPath;
	/**
	 * 省份id
	 */
	@Comment("身份ID")
	@JoinColumn(name="province_id")
	@OneToOne
	private WebAddress province;
	/**
	 * 城市id
	 */
	@Comment("城市ID")
	@JoinColumn(name="city_id")
	@OneToOne
	private WebAddress city;
	/**
	 * 身份证号码
	 */
	@Comment("身份证号码")
	private String idCard;
	/**
	 * 身份证正面照
	 */
	@Comment("身份证正面照")
	private String cardPositivePath;
	/**
	 * 身份证反面照
	 */
	@Comment("身份证反面照")
	private String cardOpposite;
	/**
	 * 出生日期
	 */
	@Comment("出生日期")
	private Date birthDay;
	/**
	 * 性别
	 * 0:男
	 * 1:女
	 */
	@Comment("性别 0:男 1：女")
	private int sex;


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
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHeadPicPath() {
		return headPicPath;
	}
	public void setHeadPicPath(String headPicPath) {
		this.headPicPath = headPicPath;
	}
	public WebAddress getProvince() {
		return province;
	}
	public void setProvince(WebAddress province) {
		this.province = province;
	}
	public WebAddress getCity() {
		return city;
	}
	public void setCity(WebAddress city) {
		this.city = city;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getCardPositivePath() {
		return cardPositivePath;
	}
	public void setCardPositivePath(String cardPositivePath) {
		this.cardPositivePath = cardPositivePath;
	}
	public String getCardOpposite() {
		return cardOpposite;
	}
	public void setCardOpposite(String cardOpposite) {
		this.cardOpposite = cardOpposite;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	
}
