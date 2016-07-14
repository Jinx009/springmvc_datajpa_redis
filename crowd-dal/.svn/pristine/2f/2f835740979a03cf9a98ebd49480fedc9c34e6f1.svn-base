package com.code.entity.home;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 后台角色表
 * @createtime 2016年5月11日下午5:46:04
 */
@Entity
@Table(name="home_role")
@Comment("后台角色表")
public class HomeRole extends CommenEntity {
	/**
	 * 角色名称
	 */
	@Comment("角色名称")
	private String name;
	/**
	 * 创建者名称
	 */
	@Comment("创建者名称")
	private long createUser;
	/**
	 * 备注
	 */
	@Comment("备注")
	private String remark;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCreateUser() {
		return createUser;
	}
	public void setCreateUser(long createUser) {
		this.createUser = createUser;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
