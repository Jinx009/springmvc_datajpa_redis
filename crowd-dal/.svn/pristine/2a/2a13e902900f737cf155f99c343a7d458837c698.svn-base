package com.code.entity.project;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

import com.code.entity.CommenEntity;
import com.code.entity.user.WebUser;

@Entity
@Table(name="web_project_comment")
@Comment("项目评论表")
public class WebProjectComment extends CommenEntity{

	private static final long serialVersionUID = -3138396160173948305L;

	/**
	 * 对应项目id
	 */
	@Comment("对应项目")
	private long projectId;
	
	/**
	 * 评论者用户信息
	 */
	@OneToOne
	@JoinColumn(name = "user_id")
	@Comment("评论者对应用户")
	private WebUser webUser;
	
	/**
	 * 评论内容
	 */
	@Comment("评论内容")
	private String content;
	
	/**
	 * 对应父级id
	 */
	@Comment("对应父级id")
	private long parentId;
	
	/**
	 * 显示状态
	 */
	@Comment("显示状态")
	private int status;

	public long getProjectId() {
		return projectId;
	}
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	public WebUser getWebUser() {
		return webUser;
	}
	public void setWebUser(WebUser webUser) {
		this.webUser = webUser;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
}
