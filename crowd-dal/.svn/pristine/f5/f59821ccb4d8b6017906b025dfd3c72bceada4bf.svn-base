package com.code.entity.home;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 后台菜单表
 * @createtime 2016年5月11日下午5:43:00
 */
@Entity
@Table(name="home_menu")
@Comment("后台菜单表")
public class HomeMenu extends CommenEntity {
	
	/**
	 * 菜单名称
	 */
	@Comment("后台名称")
	private String name;
	/**
	 * 图标class
	 */
	@Comment("菜单图标")
	private String icon;
	/**
	 * 菜单链接
	 */
	@Comment("菜单链接")
	private String href;
	/**
	 * 父id
	 */
	@Comment("父菜单Id")
	private long parentId;
	/**
	 * 是否启用
	 * 0:不启用
	 * 1:启用
	 */
	@Comment("是否启用 0:不启用 1:启用")
	private int status;
	/**
	 * 菜单类型
	 * 0:左侧功能
	 * 1:上侧配置
	 * 2:上侧用户管理
	 */
	@Comment("菜单类型 0:左侧功能1:上侧配置2:上侧用户管理")
	private int type;



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public long getParentId() {
		return parentId;
	}
	public void setParentId(long parentId) {
		this.parentId = parentId;
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
	
	
}
