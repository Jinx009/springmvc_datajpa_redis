package com.code.entity.sys;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 系统地址仓库
 * @createtime 2016年5月11日下午5:11:36
 */
@Entity
@Table(name="web_address")
@Comment("系统地址仓库")
public class WebAddress extends CommenEntity {
	/**
	 * 地址名称
	 */
	@Comment("地址名称")
	private String name;
	/**
	 * 父仓库id
	 */
	@Comment("父仓库ID")
	private long parentId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getParentId() {
		return parentId;
	}
	public void setParentId(long parentId) {
		this.parentId = parentId;
	}
	
	
}
