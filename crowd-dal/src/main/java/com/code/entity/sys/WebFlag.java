package com.code.entity.sys;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 行业仓库标签
 * @createtime 2016年5月11日下午5:28:37
 */
@Entity
@Table(name="web_flag")
@Comment("行业仓库标签")
public class WebFlag extends CommenEntity {
	
	private static final long serialVersionUID = -2892191401791091552L;
	/**
	 * 行业名称
	 */
	@Comment("行业名称")
	private String name;
	/**
	 * 是否启用
	 * 0:不启用
	 * 1:启用
	 */
	@Comment("是否启用 0:不启用 1:启用")
	private int status;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}	
