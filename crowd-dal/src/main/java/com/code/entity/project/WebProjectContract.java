package com.code.entity.project;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 项目合同模板
 * @createtime 2016年5月11日下午5:03:13
 */
@Entity
@Table(name="web_project_contract")
@Comment("项目合同模板")
public class WebProjectContract extends CommenEntity {

	private static final long serialVersionUID = 6088757474017183325L;
	/**
	 * 项目id
	 */
	@Comment("项目ID")
	private long projectId;
	/**
	 * 是否启用
	 * 0:不启用
	 * 1:启用
	 */
	@Comment("是否启用 0:不启用 1:启用")
	private int status;
	/**
	 * 合同模板
	 */
	@Comment("合同模板")
	private String template;
	/**
	 * 乙方文字
	 */
	@Comment("乙方文字")
	private String secondText;
	/**
	 * 丙方文字
	 */
	@Comment("丙方文字")
	private String thirdText;
	/**
	 * 丁方文字
	 */
	@Comment("丁方文字")
	private String fourText;


	public long getProjectId() {
		return projectId;
	}
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	public String getSecondText() {
		return secondText;
	}
	public void setSecondText(String secondText) {
		this.secondText = secondText;
	}
	public String getThirdText() {
		return thirdText;
	}
	public void setThirdText(String thirdText) {
		this.thirdText = thirdText;
	}
	public String getFourText() {
		return fourText;
	}
	public void setFourText(String fourText) {
		this.fourText = fourText;
	}
	
	
}
