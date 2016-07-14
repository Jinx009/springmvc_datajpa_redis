package com.code.entity.project;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

import com.code.entity.CommenEntity;
import com.code.entity.user.WebUser;

@Entity
@Table(name="web_project_attention")
@Comment("项目关注表")
public class WebProjectAttention extends CommenEntity{

	private static final long serialVersionUID = 5272810853254118155L;

	/**
	 * 对应项目id
	 */
	@Comment("对应项目")
	private long projectId;

	/**
	 * 对应关注用户
	 */
	@OneToOne
	@JoinColumn(name = "user_id")
	@Comment("关注用户")
	private WebUser webUser;
	
	/**
	 * 当前关注状态 0 取消 1 关注中
	 */
	@Comment("是否取消")
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
