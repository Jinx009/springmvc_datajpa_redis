package com.code.entity.sys;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 素材仓库
 * @createtime 2016年5月11日下午5:30:18
 */
@Entity
@Table(name="web_materials")
@Comment("素材仓库")
public class WebMaterials extends CommenEntity {
	
	private static final long serialVersionUID = 5930720965515691451L;
	/**
	 * 素材名称
	 */
	@Comment("素材名称")
	private String name;
	/**
	 * 素材编码
	 */
	@Comment("素材编码")
	private String code;
	/**
	 * 是否唯一
	 * 0:不唯一
	 * 1:唯一
	 */
	@Comment("是否唯一 0:不唯一 1:唯一")
	private int isOnly;
	/**
	 * 素材类型
	 * 0:文本
	 * 1:图片
	 * 2:文件
	 */
	@Comment("素材类型 0:文本 1:图片 2:文件")
	private int type;
	/**
	 * 素材用途0:平台，1:项目
	 */
	@Comment("素材用途0:平台，1:项目")
	private int site;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getIsOnly() {
		return isOnly;
	}
	public void setIsOnly(int isOnly) {
		this.isOnly = isOnly;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getSite() {
		return site;
	}
	public void setSite(int site) {
		this.site = site;
	}
	
	
}
