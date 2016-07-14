package com.code.entity;

import org.hibernate.annotations.Comment;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@EntityListeners({EntityListener.class})
public abstract class CommenEntity extends IdEntity{

	private static final long serialVersionUID = 1L;

	@Column(name="create_date")
	@Comment("创建时间")
	private Date createDate;
	
	@Column(name="last_update_date")
	private Date lastUpdateDate;
	
	@Column(name="create_ip")
	@Comment("创建IP")
	private String createIp;
	

	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public String getCreateIp() {
		return createIp;
	}
	public void setCreateIp(String createIp) {
		this.createIp = createIp;
	}
	
	
	
}
