package com.code.entity.project;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 项目收益规则
 * @createtime 2016年5月11日下午5:06:45
 */
@Entity
@Table(name="web_project_profit")
@Comment("项目收益规则")
public class WebProjectProfit extends CommenEntity {

	private static final long serialVersionUID = -6622559755909313109L;
	/**
	 * 项目Id
	 */
	@Comment("项目ID")
	private long projectId;
	/**
	 * 权益名称
	 */
	@Comment("权益名称")
	private String name;
	/**
	 * 支持金额
	 */
	@Comment("支付金额")
	private double money;
	/**
	 * 最大支持人数
	 * 0:不限制
	 */
	@Comment("最大支持人数 0:不限制")
	private int maxInvestor;
	/**
	 * 收益内容
	 */
	@Comment("收益内容")
	private String profitContent;
	/**
	 * 收益图片
	 */
	@Comment("收益图片")
	private String profitPic;
	/**
	 * 权益定向码
	 */
	@Comment("权益定向码")
	private String pwd;
	
	
	
	
	
	
	
	
	
	
	
	
	

	public long getProjectId() {
		return projectId;
	}
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public int getMaxInvestor() {
		return maxInvestor;
	}
	public void setMaxInvestor(int maxInvestor) {
		this.maxInvestor = maxInvestor;
	}
	public String getProfitContent() {
		return profitContent;
	}
	public void setProfitContent(String profitContent) {
		this.profitContent = profitContent;
	}
	public String getProfitPic() {
		return profitPic;
	}
	public void setProfitPic(String profitPic) {
		this.profitPic = profitPic;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
