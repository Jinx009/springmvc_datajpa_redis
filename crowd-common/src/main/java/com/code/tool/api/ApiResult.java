package com.code.tool.api;

/**
 * Created by 高雄辉 on 17/05/2016.
 * API返回数据类
 */
public class ApiResult<T> {
    /**
     * 是否成功
     */
    private boolean success;
    /**
     * 状态码
     */
    private int code;
    /**
     * 描述信息
     */
    private String msg;
    /**
     * 实体数据
     */
    private T data;

    public ApiResult() {
    }

    public ApiResult(boolean success, int code, String msg) {
        this.success = success;
        this.code = code;
        this.msg = msg;
    }

    public ApiResult(boolean success, int code, String msg, T data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
