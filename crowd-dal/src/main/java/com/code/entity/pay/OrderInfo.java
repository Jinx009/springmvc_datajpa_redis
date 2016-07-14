package com.code.entity.pay;

import com.code.entity.CommenEntity;
import org.hibernate.annotations.Comment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
* 商户订单信息
* @author guoyx
* @date:Jun 24, 2013 3:25:29 PM
* @version :1.0
*
*/
@Entity
@Table(name="order_info")
@Comment("商户订单信息")
public class OrderInfo extends CommenEntity {
    private static final long serialVersionUID = 1L;



    @Column(name="channel_order_id")
    @Comment("连连支付订单号")
    private String channel_order_id;

    @Column(name="no_order")
    @Comment("商户唯一订单号")
    private String            no_order;             // 商户唯一订单号
    @Column(name="dt_order")
    @Comment("商户订单时间")
    private String            dt_order;             // 商户订单时间
    @Column(name="name_goods")
    @Comment("商品名称")
    private String            name_goods;           // 商品名称
    @Column(name="info_order")
    @Comment("订单描述")
    private String            info_order;           // 订单描述
    @Column(name="money_order")
    @Comment("交易金额")
    private String            money_order;          // 交易金额 单位为RMB-元
    @Column(name="user_id")
    @Comment("提交用户ID")
    private long userId;

    @Column(name="status")
    @Comment("支付状态  0:支付中  1:支付成功  2:支付失败 3:支付取消")
    private int status;
    @Column(name="card_no")
    @Comment("支付银行卡号")
    private String cardNo;
    @Column(name="no_agree")
    @Comment("支付卡绑定号")
    private String noAgree;



    public String getNo_order()
    {
        return no_order;
    }

    public void setNo_order(String no_order)
    {
        this.no_order = no_order;
    }

    public String getDt_order()
    {
        return dt_order;
    }

    public void setDt_order(String dt_order)
    {
        this.dt_order = dt_order;
    }

    public String getName_goods()
    {
        return name_goods;
    }

    public void setName_goods(String name_goods)
    {
        this.name_goods = name_goods;
    }

    public String getInfo_order()
    {
        return info_order;
    }

    public void setInfo_order(String info_order)
    {
        this.info_order = info_order;
    }

    public String getMoney_order()
    {
        return money_order;
    }

    public void setMoney_order(String money_order)
    {
        this.money_order = money_order;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getNoAgree() {
        return noAgree;
    }

    public void setNoAgree(String noAgree) {
        this.noAgree = noAgree;
    }
}
