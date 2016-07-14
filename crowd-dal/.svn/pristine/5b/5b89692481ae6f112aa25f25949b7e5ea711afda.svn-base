package com.code.entity.sys;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 模板仓库表
 * @createtime 2016年5月11日下午5:25:20
 */
@Entity
@Table(name="web_template")
@Comment("模板仓库")
public class WebTemplate extends CommenEntity {

	private static final long serialVersionUID = 7530623291685790595L;
	/**
	 * 模板编码
	 */
	@Comment("模板编码")
	private String code;
	/**
	 * 模板类型
	 * 0:短信
	 * 1:资金
	 * 3:项目
	 * 4:邮件
	 * 5:微信
	 * 6:app推送
	 * 7:站内信
	 */
	@Comment("模板类型 0:短信 1:资金 3:项目 4:邮件 5:微信 6:APP推送 7:站内信")
	private int type;
	/**
	 * 备注
	 */
	@Comment("备注")
	private String remark;
	/**
	 * 启用状态
	 * 0:不启用
	 * 1:启用
	 */
	@Comment("启用状态 0:不启用 1:启用")
	private int status;

	@Comment("具体模板内容")
	public String content;

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
