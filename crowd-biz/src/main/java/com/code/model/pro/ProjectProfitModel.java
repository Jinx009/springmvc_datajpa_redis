package com.code.model.pro;

import org.springframework.beans.BeanUtils;

import com.code.entity.project.WebProjectProfit;

public class ProjectProfitModel extends WebProjectProfit{

	private static final long serialVersionUID = 6615604820526125045L;
	
	//支持人数
	private int num;
	//项目状态
	private String statusName;
	//项目状态字符
	private int status;

	 
	public static ProjectProfitModel instance(WebProjectProfit webProjectProfit) {
		ProjectProfitModel model = new ProjectProfitModel();
		BeanUtils.copyProperties(webProjectProfit, model);
		return model;
	}

	 
	 
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
