package com.code.entity.pay;

import java.io.Serializable;

/**
 * Created by 高雄辉 on 17/05/2016.16:10
 *
 * @description 用户绑定银行卡信息
 */
public class BankCard implements Serializable {
    /**
     * 银行卡签约的唯一编号
     */
    private String no_agree;
    /**
     * 银行卡后4位
     */
    private String card_no;
    /**
     * 所属银行编号
     */
    private String bank_code;
    /**
     * 所属银行卡类型
     */
    private String bank_name;
    /**
     * 卡类型  2-储蓄卡 3-信用卡
     */
    private String card_type;
    /**
     * 绑定手机号码
     */
    private String bind_mobile;

    public BankCard() {
    }

    public BankCard(String no_agree, String card_no, String bank_code, String bank_name, String card_type) {
        this.no_agree = no_agree;
        this.card_no = card_no;
        this.bank_code = bank_code;
        this.bank_name = bank_name;
        this.card_type = card_type;
    }

    public BankCard(String no_agree, String card_no, String bank_code, String bank_name, String card_type, String bind_mobile) {
        this.no_agree = no_agree;
        this.card_no = card_no;
        this.bank_code = bank_code;
        this.bank_name = bank_name;
        this.card_type = card_type;
        this.bind_mobile = bind_mobile;
    }

    public String getNo_agree() {
        return no_agree;
    }

    public void setNo_agree(String no_agree) {
        this.no_agree = no_agree;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getBank_code() {
        return bank_code;
    }

    public void setBank_code(String bank_code) {
        this.bank_code = bank_code;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public String getBind_mobile() {
        return bind_mobile;
    }

    public void setBind_mobile(String bind_mobile) {
        this.bind_mobile = bind_mobile;
    }
}
