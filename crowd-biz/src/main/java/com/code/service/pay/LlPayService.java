package com.code.service.pay;

import com.code.entity.pay.BankCard;
import com.code.entity.pay.CardBin;

import java.util.List;

/**
 * Created by 高雄辉 on 17/05/2016.
 * @description 连连支付service
 */
public interface LlPayService {
    /**
     * 查询银行卡卡信息
     * @param card_no
     * @param type
     * @return
     */
    public CardBin queryCardBin(String card_no,String type);

    /**
     * 查询已经绑定卡信息
     * @param user_id
     * @param type
     * @return
     */
    public List<BankCard> queryBankcardList(long user_id, String type);





}
