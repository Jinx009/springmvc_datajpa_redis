package com.code.tool.pay;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 高雄辉 on 17/05/2016.16:43
 *
 * @description
 */
public class OrderUtil {



    public synchronized static  String createOrderId(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
        String nowDate = dateFormat.format(new Date());
        int random = ((int) ((Math.random() * 9 + 1) * 1000));
        return nowDate + random;
    }
}
