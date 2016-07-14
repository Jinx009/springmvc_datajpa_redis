package com.code.entity.home;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 角色菜单表
 * @createtime 2016年5月11日下午5:50:11
 */
@Entity
@Table(name="home_role_menu")
@Comment("角色菜单表")
public class HomeRoleMenu extends CommenEntity {
	/**
	 * 角色id
	 */
	@Comment("角色ID")
	private long roleId;
	/**
	 * 菜单id
	 */
	@Comment("菜单ID")
	private long menuId;


	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public long getMenuId() {
		return menuId;
	}
	public void setMenuId(long menuId) {
		this.menuId = menuId;
	}
	
	
}
