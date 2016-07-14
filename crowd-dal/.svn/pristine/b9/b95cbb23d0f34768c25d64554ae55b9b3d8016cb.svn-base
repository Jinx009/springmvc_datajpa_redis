package com.code.entity.pay;

import java.io.Serializable;

/**
 * Created by 高雄辉 on 17/05/2016.15:02
 *
 * @description 银行卡信息
 */
public class CardBin implements Serializable {

    /**
     * 所属银行编号
     */
    private String bank_code;
    /**
     * 所属银行名称
     */
    private String bank_name;
    /**
     * 银行卡类型 2-储蓄卡 3-信用卡
     */
    private String cardtype;


    public CardBin() {
    }

    public CardBin(String bank_code, String bank_name, String cardtype) {
        this.bank_code = bank_code;
        this.bank_name = bank_name;
        this.cardtype = cardtype;
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

    public String getCardtype() {
        if(cardtype!=null){
            if(cardtype.equals("2")){
                return "储蓄卡";
            }else if(cardtype.equals("3")){
                return "信用卡";
            }
        }
            return "未知类型";

    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }
}
