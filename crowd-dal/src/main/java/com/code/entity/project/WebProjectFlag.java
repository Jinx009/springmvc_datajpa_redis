package com.code.entity.project;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 项目行业标签表
 * @createtime 2016年5月11日下午4:57:43
 */
@Entity
@Table(name="web_project_flag")
@Comment("项目行业标签表")
public class WebProjectFlag extends CommenEntity {
	
	private static final long serialVersionUID = 7631395153481692676L;
	/**
	 * 项目id
	 */
	@Comment("项目ID")
	private long projectId;
	/**
	 * 行业标签id
	 */
	@Comment("行业标签ID")
	private long flagId;


	public long getProjectId() {
		return projectId;
	}
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	public long getFlagId() {
		return flagId;
	}
	public void setFlagId(long flagId) {
		this.flagId = flagId;
	}
	
	
}
