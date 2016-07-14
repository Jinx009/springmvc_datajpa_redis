package com.code.constants;

/**
 * Created by 高雄辉 on 2016/5/23.
 * 用户资金可用余额更改操作类型
 */
public enum WebUserAccountEnum {
    ADD("add","添加金额"),
    REDUCE("reduce","减少金额");

    private String type;
    private String msg;

    WebUserAccountEnum(String type,String msg) {
        this.type = type;
        this.msg = msg;
    }

    public String getType() {
        return type;
    }

    public String getMsg() {
        return msg;
    }
}
