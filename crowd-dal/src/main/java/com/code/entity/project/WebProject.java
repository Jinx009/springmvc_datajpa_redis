package com.code.entity.project;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

/**
 * 
 * @author 高雄辉
 * @description 项目表
 * @createtime 2016年5月11日下午4:28:59
 */
@Entity
@Table(name="web_project")
@Comment("项目表")
public class WebProject extends CommenEntity {
	
	private static final long serialVersionUID = -1049914313851533036L;
	/**
	 * 项目名称
	 */
	@Comment("项目名称")
	private String name;
	/**
	 * 项目类型
	 * 1:实物众筹
	 * 2:股权众筹
	 * 3:公益众筹
	 */
	@Comment("项目类型 1:实物众筹2:股权众筹3:公益众筹")
	private int type;
	/**
	 * 当前募集金额
	 */
	@Comment("当前募集金额")
	private double account;
	/**
	 * 金额增加规则
	 * 0:不启用
	 */
	@Comment("金额增加规则 0:不启用")
	private double addAccount;
	/**
	 * 项目推荐码
	 */
	@Comment("项目推荐码")
	private String acceptanceCode;
	/**
	 * 预约金比例
	 */
	@Comment("预约金比例")
	private double breach;
	/**
	 * 发起方名称
	 */
	@Comment("发起方名称")
	private String createName;
	/**
	 * 发起方简介
	 */
	@Comment("发起方简介")
	private String createInfo;
	/**
	 * 创建者id
	 */
	@Comment("创建者id")
	private long createUserid;
	/**
	 * 募集开始时间
	 */
	@Comment("募集开始时间")
	private Date startTime;
	/**
	 * 募集结束时间
	 */
	@Comment("募集结束时间")
	private Date endTime;
	/**
	 * 违约天数
	 */
	@Comment("违约天数")
	private int breachDate;
	/**
	 * 融资轮次
	 */
	@Comment("融资轮次")
	private int financing;
	/**
	 * 项目状态
	 * 0:等待初审
	 * -1:初审不通过
	 * 1:提交审核
	 * 2:审核通过
	 * 3:募集完成
	 * 4:项目取消
	 * 5:募集失败
	 * 
	 */
	@Comment("项目状态 0:等待初审1:提交审核 -1:初审不通过 2:审核通过3:募集完成4:项目取消5:募集失败")
	private int status;
	/**
	 * 期望募集金额
	 */
	@Comment("期望募集金额")
	private double wannaAccount;
	/**
	 * 超募是否接受
	 * 0:不存在
	 * 1:存在
	 */
	@Comment("超募是否接受 0:不存在 1:存在")
	private int isExceedAccept;
	/**
	 * 人数超募是否接受
	 * 0:不存在
	 * 1:存在
	 */
	@Comment("人数超募是否接受 0:不存在 1:存在")
	private int isInVestorExceedAccept;
	/**
	 * 是否存在领头人
	 * 0:不存在
	 * 1:存在
	 */
	@Comment("是否存在领头人 0:不存在 1:存在")
	private int leaderStatus;
	/**
	 * 公司估值
	 */
	@Comment("公司估值")
	private double companyMoney;
	/**
	 * 公司估值类型
	 * 0:投钱估值
	 * 1:投后估值
	 */
	@Comment("公司估值类型 0:投钱估值1:投后估值")
	private int companyMoneyType;
	/**
	 * 单笔最小金额
	 */
	@Comment("单笔最小金额")
	private double minMoney;
	/**
	 * 单笔最大金额
	 */
	@Comment("单笔最大金额")
	private double maxMoney;
	/**
	 * 是否允许多次投资
	 * 0:不允许
	 * 1:允许
	 */
	@Comment("是否允许多次投资 0:不允许 1:允许")
	private int investTimesStatus;
	/**
	 * 推荐级别
	 */
	@Comment("推荐级别")
	private int recommendNum;
	/**
	 * 是否在app列表显示
	 * 0:不显示
	 * 1:显示
	 */
	@Comment("是否在app列表显示 0:不显示 1:显示")
	private int isShowApp;
	/**
	 * 是否在微信页面展示
	 * 0:不显示
	 * 1:显示
	 */
	@Comment("是否在微信页面展示 0:不显示 0:显示")
	private int isShowWechat;
	/**
	 * 是否在pc端显示
	 * 0:不显示
	 * 1:显示
	 */
	@Comment("是否在pc端显示 0:不显示 1:显示")
	private int isShowPc;
	/**
	 * 是否在首页显示
	 * 0:不显示
	 * 1:显示
	 */
	@Comment("是否在首页显示 0:不显示 1:显示")
	private int isIndexShow;
	/**
	 * 出让股权比例
	 */
	@Comment("出让股权比例")
	private double sellRate;
	/**
	 * 收费比例
	 */
	@Comment("收费比例")
	private double fee;
	/**
	 * 收费类型
	 * 0:投资方
	 * 1:项目方
	 */
	@Comment("收费类型 0:投资方 1:项目方")
	private int feeType;
	/**
	 * 最低接受金额
	 */
	@Comment("最低接受金额")
	private double lowestAccount;
	/**
	 * 项目简介
	 */
	@Comment("项目简介")
	private String info;
	/**
	 * 项目抒情文
	 */
	@Comment("项目抒情文")
	private String article;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public double getAccount() {
		return account;
	}
	public void setAccount(double account) {
		this.account = account;
	}
	public double getAddAccount() {
		return addAccount;
	}
	public void setAddAccount(double addAccount) {
		this.addAccount = addAccount;
	}
	public String getAcceptanceCode() {
		return acceptanceCode;
	}
	public void setAcceptanceCode(String acceptanceCode) {
		this.acceptanceCode = acceptanceCode;
	}
	public double getBreach() {
		return breach;
	}
	public void setBreach(double breach) {
		this.breach = breach;
	}
	public String getCreateName() {
		return createName;
	}
	public void setCreateName(String createName) {
		this.createName = createName;
	}
	public String getCreateInfo() {
		return createInfo;
	}
	public void setCreateInfo(String createInfo) {
		this.createInfo = createInfo;
	}
	public long getCreateUserid() {
		return createUserid;
	}
	public void setCreateUserid(long createUserid) {
		this.createUserid = createUserid;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public int getBreachDate() {
		return breachDate;
	}
	public void setBreachDate(int breachDate) {
		this.breachDate = breachDate;
	}
	public int getFinancing() {
		return financing;
	}
	public void setFinancing(int financing) {
		this.financing = financing;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public double getWannaAccount() {
		return wannaAccount;
	}
	public void setWannaAccount(double wannaAccount) {
		this.wannaAccount = wannaAccount;
	}
	public int getIsExceedAccept() {
		return isExceedAccept;
	}
	public void setIsExceedAccept(int isExceedAccept) {
		this.isExceedAccept = isExceedAccept;
	}
	public int getIsInVestorExceedAccept() {
		return isInVestorExceedAccept;
	}
	public void setIsInVestorExceedAccept(int isInVestorExceedAccept) {
		this.isInVestorExceedAccept = isInVestorExceedAccept;
	}
	public int getLeaderStatus() {
		return leaderStatus;
	}
	public void setLeaderStatus(int leaderStatus) {
		this.leaderStatus = leaderStatus;
	}
	public double getCompanyMoney() {
		return companyMoney;
	}
	public void setCompanyMoney(double companyMoney) {
		this.companyMoney = companyMoney;
	}
	public int getCompanyMoneyType() {
		return companyMoneyType;
	}
	public void setCompanyMoneyType(int companyMoneyType) {
		this.companyMoneyType = companyMoneyType;
	}
	public double getMinMoney() {
		return minMoney;
	}
	public void setMinMoney(double minMoney) {
		this.minMoney = minMoney;
	}
	public double getMaxMoney() {
		return maxMoney;
	}
	public void setMaxMoney(double maxMoney) {
		this.maxMoney = maxMoney;
	}
	public int getInvestTimesStatus() {
		return investTimesStatus;
	}
	public void setInvestTimesStatus(int investTimesStatus) {
		this.investTimesStatus = investTimesStatus;
	}
	public int getRecommendNum() {
		return recommendNum;
	}
	public void setRecommendNum(int recommendNum) {
		this.recommendNum = recommendNum;
	}
	public int getIsShowApp() {
		return isShowApp;
	}
	public void setIsShowApp(int isShowApp) {
		this.isShowApp = isShowApp;
	}
	public int getIsShowWechat() {
		return isShowWechat;
	}
	public void setIsShowWechat(int isShowWechat) {
		this.isShowWechat = isShowWechat;
	}
	public int getIsShowPc() {
		return isShowPc;
	}
	public void setIsShowPc(int isShowPc) {
		this.isShowPc = isShowPc;
	}
	public int getIsIndexShow() {
		return isIndexShow;
	}
	public void setIsIndexShow(int isIndexShow) {
		this.isIndexShow = isIndexShow;
	}
	public double getSellRate() {
		return sellRate;
	}
	public void setSellRate(double sellRate) {
		this.sellRate = sellRate;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public int getFeeType() {
		return feeType;
	}
	public void setFeeType(int feeType) {
		this.feeType = feeType;
	}
	public double getLowestAccount() {
		return lowestAccount;
	}
	public void setLowestAccount(double lowestAccount) {
		this.lowestAccount = lowestAccount;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	
}
